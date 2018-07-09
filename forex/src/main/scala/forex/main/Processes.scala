package forex.main

import cats.Eval
import com.typesafe.scalalogging.LazyLogging
import forex.config._
import forex.domain.Rate
import forex.{services => s}
import forex.{processes => p}
import org.zalando.grafter.{Start, StartResult, Stop, StopResult}
import org.zalando.grafter.macros._

import scala.concurrent.duration._
import org.atnos.eff.syntax.addon.monix.task._
@readerOf[ApplicationConfig]
case class Processes(
                      forexConfig: ForexConfig,
                      executors: Executors,
                      caches: Caches,
                      actorsSystems: ActorSystems
                    ) extends Start with Stop with LazyLogging {

  import actorsSystems._
  import executors._

  implicit final lazy val _oneForge: s.OneForge[AppEffect] =
    s.OneForge.live[AppStack](forexConfig)

  implicit final lazy val _ratesCache: s.RatesCache[AppEffect] =
    s.RatesCache.ratesCache[AppStack]

  final val Rates = p.Rates[AppEffect]

  final lazy val updatesSwitch =
    executors
      .default
      .scheduleWithFixedDelay(
        0.seconds,
        forexConfig.refreshDelay
      )(
        Rates.updateRates(Rate.Pair.allSupportedPairs)
          .map{
            case Left(error)=> logger.warn(s"Unable to refresh rates", error)
            case Right(_) => logger.info("Refreshed rates")
          }
          .runTaskMemo(caches.hashMapRatesCache)
          .runAsync
          .runAsync
      )

  override def start: Eval[StartResult] =
    StartResult.eval("Processes"){
      updatesSwitch
    }

  override def stop: Eval[StopResult] =
    StopResult.eval("Processors"){
      updatesSwitch.cancel()
    }
}
