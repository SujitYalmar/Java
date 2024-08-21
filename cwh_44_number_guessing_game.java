package com.company;
import java.util.Random;
import java.util.Scanner;

public class cwh_44_number_guessing_game {
    private int numberToGuess;
    private int noOfGuesses;

    // Constructor to generate the random number
    public cwh_44_number_guessing_game() {
        Random random = new Random();
        this.numberToGuess = random.nextInt(100) + 1; // Generates a number between 1 and 100
        this.noOfGuesses = 0;
    }

    // Method to take user input
    public int takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess (between 1 and 100): ");
        int userInput = scanner.nextInt();
        noOfGuesses++;
        return userInput;
    }

    // Method to detect whether the number entered by the user is correct
    public boolean isCorrectNumber(int userGuess) {
        if (userGuess == numberToGuess) {
            System.out.println("Congratulations! You've guessed the correct number in " + noOfGuesses + " attempts.");
            return true;
        } else if (userGuess < numberToGuess) {
            System.out.println("Your guess is too low. Try again.");
        } else {
            System.out.println("Your guess is too high. Try again.");
        }
        return false;
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Main method to run the game
    public static void main(String[] args) {
        cwh_44_number_guessing_game game = new cwh_44_number_guessing_game();
        boolean correctGuess = false;
        while (!correctGuess) {
            int userGuess = game.takeUserInput();
            correctGuess = game.isCorrectNumber(userGuess);
        }
    }
}
