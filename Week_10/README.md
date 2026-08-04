# Code Boss Battle - Java GUI Quiz Game

## Description

**Code Boss Battle** is a simple Java GUI quiz game developed using **JOptionPane**. The player battles a boss by answering Java programming questions. Correct answers defeat the boss, while incorrect answers reduce the player's health.

The project demonstrates the use of graphical user interfaces (GUI), object-oriented programming, arrays, loops, and conditional statements in Java.

## Features

- Graphical user interface using `JOptionPane`.
- Multiple-choice style quiz through text input.
- Boss HP and Player HP system.
- Score tracking.
- Win/Lose game logic.
- Instant feedback after each answer.

## Game Rules

- **Boss HP:** 20
- **Player HP:** 10

### Correct Answer
- Boss HP decreases by **20**
- Score increases by **10**

### Wrong Answer
- Player HP decreases by **10**

The game ends when:
- The boss's HP reaches **0** (Player Wins), or
- The player's HP reaches **0** (Game Over).

## Files

### Question.java
Handles the game logic by:
- Storing quiz questions and answers.
- Managing player HP, boss HP, and score.
- Displaying questions and game status.
- Determining the final game result.

### QuizBattleGUI.java
Contains the `main()` method that starts the game by creating a `Question` object and calling the `startQuiz()` method.

## Sample Gameplay

```
Welcome to Code Boss Battle!

Boss HP: 20
Player HP: 10

Question:
Which keyword is used to create an object in Java?

Answer: new

Correct!

Boss HP = 0
Player HP = 10
Score = 10

🎉 YOU WIN!
Boss Defeated!
Final Score: 10
```

## Java Concepts Demonstrated

- Classes and Objects
- Methods
- Arrays
- Loops
- Conditional Statements (`if-else`)
- String Comparison (`equalsIgnoreCase()`)
- GUI Programming with `JOptionPane`
- Encapsulation (private fields)
- Object Instantiation

## Learning Outcomes

After completing this project, you should be able to:
- Create a simple GUI application using `JOptionPane`.
- Store and retrieve data using arrays.
- Implement game logic with loops and conditionals.
- Track game state using variables.
- Apply object-oriented programming concepts to organize application logic.

## Future Improvements

Possible enhancements include:
- Add multiple levels and bosses.
- Randomize question order.
- Include multiple-choice buttons instead of text input.
- Add a timer for each question.
- Play sound effects and background music.
- Display a health bar and graphical interface using Swing components.
- Load questions from a text file or database.

