# Guesser_Game

# 🎯 Guesser Game in Java

A simple console-based number guessing game built in Java where one Guesser picks a number, and three Players try to guess it. The Umpire compares the guesses and announces the winners. The game supports multiple rounds for added fun!

## 📦 Project Structure

```
Guesser_Game.java
├── Guesser       // Guesses a number
├── Player        // Each player guesses a number
├── Umpire        // Collects guesses and compares results
└── Guesser_Game  // Main class to run the game
```

## 🚀 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/guesser-game-java.git
   cd guesser-game-java
   ```

2. **Compile the code**
   ```bash
   javac Guesser_Game.java
   ```

3. **Run the game**
   ```bash
   java Guesser_Game
   ```

## 🎮 Gameplay Instructions

- The game begins by asking how many rounds you'd like to play.
- In each round:
  - The Guesser inputs a secret number.
  - Each of the three Players tries to guess the same number.
  - The Umpire compares all guesses and announces the winners.

## 🧠 Sample Output

```
Enter the number of Rounds You want to Play :
2
<----- Game Started ----->
Round 1
Guesser kindly Guess a Number : 5
Player1 kindly Guess a Number : 5
Player2 kindly Guess a Number : 3
Player3 kindly Guess a Number : 5
Result :Player 1 and Player 3 won the Game.
Round 2
...
<----- Game Over ----->
```

## 🛠️ Features

- Supports multiple rounds
- Clean object-oriented design
- Interactive console input
- Clear winner logic

## 📌 Future Improvements

- Add input validation
- Support more players
- GUI version using JavaFX or Swing
- Scoreboard across rounds
