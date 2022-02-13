# LightCycle Game

The LightCycles game is a classic arcade version of the game "Light Cycles" from the  first  Tron  movie.
The game has the following functionality:
* allows up to 10 players
* players can turn jetwall on/off
* players can speed up/down the light cycle
* players choose own unique username and color
* the score is based on the length of the jetwall

## Getting Started
* the game should run from within intelliJ

* First run the server program, and choose number of players. Default is 2 players, which is the minimum to play the game. 

* Second: Each player runs ClientGUI, and choose color and username. Client also chooses the server it wishes to connect with. Default is LocalHost (same computer) otherwise input an ip-adress for the server. (and make sure Intellij/java is not blocked by firewall) 

* (it is possible for testing to have two clients on same computer, though they cannot be controlled at same time)

* game starts when all players are connected. 

### Control Keys

```
a = Turn anticlockwise
d = Turn clockwise
w = Go faster
s = Go Slower
e = turn jetwall on/off

```

### Light Cycle Colors

The available colors are listed below. (the should be written as lowercase)

```
red
green
blue
yellow
cyan
magenta
gray
white
purple
orange
```


## Extra files
included is some extra files:

```
* "Leaderboard.txt" -  stores the highscores from previous games.
* "LightCycles test" - Known as JUnit test. Ensures all code is working fine.
```


## Built With

* [IntelliJ](https://www.jetbrains.com/idea/) - The IDE used





