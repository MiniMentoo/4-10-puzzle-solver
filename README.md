# 4=10-puzzle-solver

This is a brute force solver of a puzzle game I found interesting called _4=10_.
The rules of the game (which my solver should understand) are as follows.

• The game consists of 500 puzzles, in each one you're given 4 numbers.

• You must use all 4 numbers, and pick 3 operators, + - * or / to make 10.

• You may recieve duplicate numbers.

• You cannot use a number more than once.

• You may use multiple operators but only one set of brackets.

• You cannot combine two numbers without operators (cannot combine 1 and 0 to make 10).

• The game does not allow you to put a - operator at the start.

• On specific levels some number of operators are disabled and you cannot use them.

# Requirements for a successfull solver

• Will take 4 numbers, and return all calculations that give 10.

• Will only return solutions that use all four numbers.

• Will only return correct solutions.

• Will return all solutions.

• Will filter answers if certain operators are not available.

Maybe I'll try and make it efficient, maybe it'll be O(n!). Depends on how I'm feeling :)

# Why?

I played through the first 400 or so levels and got really stuck on level 415. I couldn't figure it out and I was too prideful to check the solution, so I made a rudimentary brute force solver (which worked for that level!). I then realised how bad my quick solution was, so I decided this is as good of a project as any to be my first real one.
