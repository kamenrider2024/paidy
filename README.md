# Paidy Take-Home Coding Exercises - API for managing users

The complete specification for this exercise can be found in the [UsersAPI.md](UsersAPI.md).

Table of contents
------------------

  * [Technologies](#tech)
  * [Scripts](#scripts)


<a name="tech" />
## Technologies

IDE - IntelliJ IDEA

Web framework - [Scalatra](https://scalatra.org/)

Server - [Jetty](https://www.eclipse.org/jetty/)

### Why Scalatra

* open source framework
* great for beginners
* active community
* easy to set up
* extensive documentation

<a name="scripts" />
## Scripts

There are several bash scripts in the directory `scripts` that can be used for application testing. They contain `curl` commands. Some of them take input parameters.

To run a script open a terminal in the `script` folder and use command `./name-of-the-script.sh`

For running with parameters use command `./name-of-the-script.sh param1 param2`

It might be necessary to make the script executable. Then use command `chmod +x name-of-the-script.sh`

* `getid.sh`
	- takes parameter `userId`
	- returns json with user information
* `signup.sh`
	- takes no parameter, alredy contais data for mock user John
	- returns signed up user
* `signup_params.sh`
	- takes parameters `userName`, `email`, `password`
	- returns signed up user
* `update_email.sh`
	- takes parameters `userId`, `newEmail`
	- returns user with updated email
* `update_pass.sh`
	- takes parameters `userId`, `newPassword`
	- returns user with updated password
* `reset_pass.sh`
	- takes parameters `userId`
	- returns user with empty password
* `block.sh`
	- takes parameters `userId`
	- returns user with changed `blockedAt` timestamp
* `unblock.sh`
	- takes parameters `userId`
	- returns user with empty `blockedAt` timestamp
* `delete.sh`
	- takes parameters `userId`
	- returns status 200 if user was deleted


## What to expect?
We understand that your time is valuable, and in anyone's busy schedule solving these exercises may constitute a fairly substantial chunk of time, so we really appreciate any effort you put in to helping us build a solid team.

## What we are looking for?
**Keep it simple**. Read the requirements and restrictions carefully and focus on solving the problem.

**Treat it like production code**. That is, develop your software in the same way that you would for any code that is intended to be deployed to production. These may be toy exercises, but we really would like to get an idea of how you build code on a day-to-day basis.

## How to submit?
You can do this however you see fit - you can email us a tarball, a pointer to download your code from somewhere or just a link to a source control repository. Make sure your submission includes a small **README**, documenting any assumptions, simplifications and/or choices you made, as well as a short description of how to run the code and/or tests. Finally, to help us review your code, please split your commit history in sensible chunks (at least separate the initial provided code from your personal additions).

## The Interview:
After you submit your code, we will contact you to discuss and potentially arrange an in-person interview with some of the team.
The interview will cover a wide range of technical and social aspects relevant to working at Paidy, but importantly for this exercise: we will also take the opportunity to step through your submitted code with you.

## The Exercises:
### 1. [Platform] Build an API for managing users
The complete specification for this exercise can be found in the [UsersAPI.md](UsersAPI.md).

### 2. [Frontend] Build a SPA that displays weather information
The complete specification for this exercise can be found in the [Weather.md](Weather.md).

### 3. [Platform] Build a local proxy for currency exchange rates
The complete specification for this exercise can be found in the [Forex.md](Forex.md).

### 4. [Mobile] Create a Grouped Card View
The complete specification for this exercise can be found in the [GroupedCardView.md](GroupedCardView.md).

## F.A.Q.
1) _Is it OK to share your solutions publicly?_
Yes, the questions are not prescriptive, the process and discussion around the code is the valuable part. You do the work, you own the code. Given we are asking you to give up your time, it is entirely reasonable for you to keep and use your solution as you see fit.

2) _Should I do X?_
For any value of X, it is up to you, we intentionally leave the problem a little open-ended and will leave it up to you to provide us with what you see as important. Just remember to keep it simple. If it's a feature that is going to take you a couple of days, it's not essential.

3) _Something is ambiguous, and I don't know what to do?_
The first thing is: don't get stuck. We really don't want to trip you up intentionally, we are just attempting to see how you approach problems. That said, there are intentional ambiguities in the specifications, mainly to see how you fill in those gaps, and how you make design choices.
If you really feel stuck, our first preference is for you to make a decision and document it with your submission - in this case there is really no wrong answer. If you feel it is not possible to do this, just send us an email and we will try to clarify or correct the question for you.

Good luck!
