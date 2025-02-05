package com.tit.day0405searchingreadingstringstype.stringbuilder.reversestring;

// Creating a class ReverseString to represent the string reversal using StringBuilder
class ReverseString
{
    // Method to reverse the input string
    public static String reverseString(String input)
    {
        // Create a new StringBuilder object and append the input string
        StringBuilder sb = new StringBuilder();
        sb.append(input);

        // Reverse the string using StringBuilder's reverse method
        sb.reverse();

        // Convert the StringBuilder back to a string and return it
        return sb.toString();
    }
}

