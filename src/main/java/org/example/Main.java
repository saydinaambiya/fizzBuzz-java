package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;

    public static void main(String[] args) {

        Scanner inputTerminal = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int number = inputTerminal.nextInt();
            String result = checkFizzBuzz(number);
            System.out.println("Output: " + result);
        } catch (InputMismatchException error) {
            System.out.println("Output: Error: Invalid input. Please enter an integer");
        }
        inputTerminal.close();
    }

    private static String checkFizzBuzz(int number) {
        boolean isFizz = number % FIZZ_NUMBER == 0;
        boolean isBuzz = number % BUZZ_NUMBER == 0;
        boolean isFizzBuzz = isFizz && isBuzz;

        if (isFizzBuzz) return "FizzBuzz";
        if (isFizz) return "Fizz";
        if (isBuzz) return "Buzz";

        return Integer.toString(number);
    }
}