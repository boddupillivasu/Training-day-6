package com.stringexercises;
import java.util.Scanner;

public class ExcericesOnString {
    public static void main(String[] args) {



        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of integers separated by spaces:");

        // Read the entire line of input as a single String
        String inputLine = scanner.nextLine();

        // Split the input line into an array of strings based on spaces
        String[] stringNumbers = inputLine.split("\\s+");

        // Initialize a variable to store the sum of the integers
        int sum = 0;

        // Loop through each string in the array
        for (String str : stringNumbers) {
            try {
                // Convert the string to an integer
                int number = Integer.parseInt(str);

                // Display the integer
                System.out.println("Integer: " + number);

                // Add the integer to the sum
                sum += number;
            } catch (NumberFormatException e) {
                // Handle the case where the string is not a valid integer
                System.out.println("Invalid integer: " + str);
            }
        }

        // Display the sum of all integers
        System.out.println("Sum of integers: " + sum);

        // Close the scanner
        scanner.close();
    }
}



