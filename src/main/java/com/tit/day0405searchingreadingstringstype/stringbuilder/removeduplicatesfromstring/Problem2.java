package com.tit.day0405searchingreadingstringstype.stringbuilder.removeduplicatesfromstring;
/*
StringBuilder Problem 2: Remove Duplicates from a String Using StringBuilder
Problem:
Write a program that uses StringBuilder to remove all duplicate characters from a given string while maintaining the original order.
Approach:
- Initialize an empty StringBuilder and a HashSet to keep track of characters.
- Iterate over each character in the string:
  - If the character is not in the HashSet, append it to the StringBuilder and add it to the HashSet.
- Return the StringBuilder as a string without duplicates.
*/
import java.util.Scanner;

// Creating a class Problem2 to demonstrate the RemoveDuplicates functionality
class Problem2
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Please Enter a String: ");

        // Read the input string
        String input = sc.nextLine();

        // Remove duplicates from the input string using the RemoveDuplicates class
        String output = RemoveDuplicates.removeDuplicatesFromString(input);

        // Display the original and modified strings
        System.out.println("String Before Removing Duplicates: " + input);
        System.out.println("String After Removing Duplicates: " + output);

        // Close the Scanner object
        sc.close();
    }
}
