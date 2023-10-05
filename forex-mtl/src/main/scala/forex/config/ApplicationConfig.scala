package forex.config

import scala.concurrent.duration.FiniteDuration


case class ApplicationConfig(
                              http: HttpConfig,
                              oneFrame: OneFrameConfig,
                              program: ProgramConfig

                            )


case class HttpConfig(
                       host: String,
                       port: Int,
                       timeout: FiniteDuration
                     )


case class OneFrameConfig(
                           host: String,
                           port: Int,
                           timeout: FiniteDuration
                         )


case class ProgramConfig(
                          oneFrameTokens: List[String],
                          ratesRefreshTimeout: FiniteDuration
                        )
