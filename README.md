
# Game Love (v1.1.1)


In this assignment, we look forward to test your skills on software development in areas of code quality and design of your solution. Please, be pragmatic and avoid over engineering your solution.

## Problem Statement:

In this scenario, we are requested to offer a solution that would allow us to keep track of what are the games that are more popular on our system, in number of likes. 

In this case, we want to keep track of some gaming statistics of the player which should meet these requirements:

* Design a web service API that with information representing the player (i.e: player id), we can support the following:
  * The endpoint will create a new entry on the tracking system upon feeding it with the following:
    * The player that liked the game.
    * The game he liked.
  * The endpoint should support querying for lists of most popular liked games on the whole system:
    * The list should contain the 5 top liked games by the users.
    * Each item of this list should contain:
        * The game id.
        * Number of likes the game has.
    * The list should be ordered for the top 5 games, on how successful the player has been playing them. In case, of a tie of entries; use the game with lowest id, in order to break the tie.

## Deliverables:

Your submission should contain a Java service based Maven project solution. Avoid sending large attachments in your submission so do a maven clean before submission.

In this case, we recommend you to make use of dropwizard as a starting point for your application. 

In addition, in order for us to test your solution; make use of an embedded database like h2, Sqlite using a local file database scheme with your working solution.

*Note: If you have a Junior profile applying for us, you can submit us the assignment by sending your solution 
with a mock data source (i.e: a simple in memory data structure) in the service instead of using an SQL based database.*

We look forward to your solution and appreciate your time applying with us!

## More info

External libraries used in this test: [Dropwizard](https://dropwizard.github.io/dropwizard/getting-started.html), 
[Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html),
[Dropwizard DB](http://www.dropwizard.io/0.9.1/docs/manual/index.html)

## Found a bug?

Pull requests welcome, and maybe [we have a job for you](http://jobs.comeon.com/)? :)

## How to Submit the Home Assignment
Please, send us your code in a compressed file in an email with the code project.
