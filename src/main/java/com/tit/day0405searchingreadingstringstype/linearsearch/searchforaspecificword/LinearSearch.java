package com.tit.day0405searchingreadingstringstype.linearsearch.searchforaspecificword;

// Creating a class LinearSearch to demonstrate the linear search functionality
public class LinearSearch
{
    // Method to perform linear search to find the first sentence containing a specific word
    public static String findFirstSentenceContainingWord(String[] sentences, String word) {
        // Iterate through the list of sentences
        for (String sentence : sentences) {
            // Check if the current sentence contains the specific word
            if (sentence.contains(word)) {
                // If the word is found, return the current sentence
                return sentence;
            }
        }
        // If no sentence contains the word, return "Not Found"
        return "Not Found";
    }
}