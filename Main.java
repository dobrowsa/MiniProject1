/* Mini Project 1
Sam Dobrowolski, Christopher Sonnhalter, Christopher Fenter, Jon Ashbrook
2/15/21*/

//Bringing in imports
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  Random r = new Random();
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Please enter any positive whole number: ");
  
  // Setting up Variables
  int userNum = s.nextInt();
  int randomNum = r.nextInt(userNum);

  System.out.println("A random number has been generated");
  playGame(userNum, randomNum);
  }
  
  //Creating Method PlayGame that is called above (line 21)
  //Implement Game Logic inside Method
  static void playGame(int userInput, int randomGeneratedNum) {
    Scanner s = new Scanner(System.in);
    int numTries = 0;
    boolean win = false;
  //Start Sequence
  System.out.println("Please guess a number between 0 and " + userInput);

  //Loop for sequence of results
  while(win == false) {
    int userGuess = s.nextInt();
    numTries++;

    if (userGuess == randomGeneratedNum) {
      win = true;
      System.out.println("Great, you win! It took you " + numTries + " tries");
    }
    else if (userGuess > randomGeneratedNum) {
      System.out.println("Guess Lower!");
    }
    else if (userGuess < randomGeneratedNum) {
      System.out.println("Guess Higher!");
    }
  }
  }
}