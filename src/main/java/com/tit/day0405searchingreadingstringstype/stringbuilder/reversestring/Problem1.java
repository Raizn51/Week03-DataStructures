package com.tit.day0405searchingreadingstringstype.stringbuilder.reversestring;

/*
StringBuilder Problem 1: Reverse a String Using StringBuilder
Problem:
Write a program that uses StringBuilder to reverse a given string. For example, if the input is "hello", the output should be "olleh".
Approach:
- Create a new StringBuilder object.
- Append the string to the StringBuilder.
- Use the reverse() method of StringBuilder to reverse the string.
- Convert the StringBuilder back to a string and return it.
*/


import java.util.Scanner;

// Creating a class Problem1 to demonstrate the ReverseString functionality
class Problem1
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Please Enter the String: ");

        // Read the input string
        String input = sc.nextLine();

        // Reverse the input string using the ReverseString class
        String reverseInput = ReverseString.reverseString(input);

        // Display the original and reversed strings
        System.out.println("String Before Reverse: " + input);
        System.out.println("String After Reverse: " + reverseInput);
    }
}

