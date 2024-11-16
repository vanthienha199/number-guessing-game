# Guessing Game Project

## Overview
This is a simple Java-based guessing game where the program generates a random number between 0 and 99, and the user has to guess the number. The program provides hints to help the user get closer to the correct answer.

## How It Works
1. The program generates a random number between 0 and 99 when it starts.
2. The user inputs their guesses, one at a time.
3. The program compares the user's input to the generated number and provides feedback:
    - If the guess is lower than the correct number, it outputs: **"Higher. Please guess again"**.
    - If the guess is higher than the correct number, it outputs: **"Lower. Please guess again"**.
    - If the guess is correct, it outputs: **"You are correct"** and terminates.
4. If the user enters an invalid input (e.g., a non-integer), the program prompts them to enter a valid number.

## File Structure
- **Main.java**: Contains the main method, which manages user input and game logic.
- **Guessing.java**: Contains the `Guessing` class, which handles the logic for comparing guesses to the randomly generated number.

## Prerequisites
- **Java Development Kit (JDK)** installed (version 8 or later).
- A Java-compatible IDE or text editor (e.g., IntelliJ IDEA, Eclipse, or VS Code).

## How to Run
1. Compile the program:
   ```bash
   javac Main.java Guessing.java
   ```
2. Run the program:
   ```bash
   java Main
   ```
3. Follow the instructions on the console to play the game.

## Example Gameplay
```
Guess the number I am thinking (0-99): 50
Higher. Please guess again
Guess the number I am thinking (0-99): 75
Lower. Please guess again
Guess the number I am thinking (0-99): 63
You are correct!
```

## Error Handling
- If the user enters an invalid input (e.g., a string or special character), the program displays:
  **"Please enter a valid number."** and allows the user to try again.

## Code Explanation
### Main.java
- The `Main` class contains the main game loop and handles user input using a `Scanner` object.
- It calls the `guessing` method from the `Guessing` class to evaluate the user's guesses.

### Guessing.java
- The `Guessing` class generates a random number when an object is instantiated.
- The `guessing` method takes an integer input and returns a string with feedback based on the user's guess.

## Future Enhancements
- Add support for multiple difficulty levels (e.g., different ranges of numbers).
- Track the number of attempts and display it at the end of the game.
- Create a graphical user interface (GUI) for a better user experience.

## Contact
For questions or suggestions, feel free to contact the developer.