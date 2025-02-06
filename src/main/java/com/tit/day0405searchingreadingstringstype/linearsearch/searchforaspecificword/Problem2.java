package com.tit.day0405searchingreadingstringstype.linearsearch.searchforaspecificword;


/*
Linear Search Problem 2: Search for a Specific Word in a List of Sentences
Problem:
You are given an array of sentences (strings). Write a program that performs Linear Search to find the first sentence containing a specific word. If the word is found, return the sentence. If no sentence contains the word, return "Not Found".
Approach:
- Iterate through the list of sentences.
- For each sentence, check if it contains the specific word.
- If the word is found, return the current sentence.
- If no sentence contains the word, return "Not Found".
*/


import java.util.Scanner;

// Creating a class Problem2 to demonstrate the usage of LinearSearch class
public class Problem2
{
    public static void main(String[] args) {
        // Example array of sentences for testing
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Java is a popular programming language.",
                "Artificial Intelligence is the future.",
                "I enjoy coding and solving problems."
        };

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the word to search for
        System.out.print("Enter the word to search for: ");

        // Read the input word
        String word = sc.nextLine();

        // Find and print the first sentence containing the specific word
        String result = LinearSearch.findFirstSentenceContainingWord(sentences, word);
        System.out.println("The first sentence containing the word '" + word + "': " + result);
    }
}
