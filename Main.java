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
  //**Still need to create logic for randomNum that is between 0 and Usernum -1 input**
  int randomNum = r.nextInt(userNum - 1);

  System.out.println("A random number has been generated");
  playGame(userNum, randomNum);
  }

  static void playGame(int userInput, int randomGeneratedNum) {
    Scanner s2 = new Scanner(System.in);
    int numTries = 0;
    boolean win = false;
  //Start Sequence
  System.out.println("Please guess a number between 0 and " + userInput);

  //Loop for sequence of results
  while(win == false) {
    int userGuess = s2.nextInt();
    numTries++;

    if (userGuess < 0 && userGuess > userInput) {
      System.out.println("Please enter a number in the specified range");
    }
    else if (userGuess == randomGeneratedNum) {
      win = true;
      System.out.println("Great, you win! It took you " + numTries + " tries");
    }
    else if (userGuess > randomGeneratedNum) {
      System.out.println("Guess Lower!");
    }
    else if (userGuess < randomGeneratedNum) {
      System.out.println("Guess Higher!");
    }
    else
      System.out.println("Please enter a valid number");
  }
  }
}