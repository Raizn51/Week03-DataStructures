package com.tit.day0405searchingreadingstringstype.stringbuilder.removeduplicatesfromstring;

import java.util.HashSet;
// Creating a class RemoveDuplicates to represent the removal of duplicate characters using StringBuilder
public class RemoveDuplicates
{
    // Method to remove duplicates from the input string
    public static String removeDuplicatesFromString(String input)
    {
        // Initialize a HashSet to keep track of characters
        HashSet<Character> set = new HashSet<>();

        // Create a new StringBuilder object to store the result without duplicates
        StringBuilder stringWithoutDuplicates = new StringBuilder();

        // Iterate over each character in the input string
        for (char ch : input.toCharArray())
        {
            // If the character is not in the HashSet, append it to the StringBuilder and add it to the HashSet
            if (set.add(ch))
            {
                stringWithoutDuplicates.append(ch);
            }
        }

        // Convert the StringBuilder back to a string and return it
        return stringWithoutDuplicates.toString();
    }
}
