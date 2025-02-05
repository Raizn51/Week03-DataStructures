package com.tit.day0405searchingreadingstringstype.stringbuilder.reversestring;

import org.junit.jupiter.api.Test;
import static com.tit.day0405searchingreadingstringstype.stringbuilder.reversestring.ReverseString.*;
import static org.junit.jupiter.api.Assertions.*;

// Creating a class TestingReverseString to test the reverseString method
 class TestingReverseString
{
    // Method to test the reverseString function
    @Test
    public void testReverseStringFunction()
    {
        // Step 1: Create a StringBuilder object with the input string
        StringBuilder input = new StringBuilder("same to you");

        // Step 2: Reverse the string using the reverseString method
        String output = reverseString(input.toString());

        // Step 3: Reverse the input string using StringBuilder's reverse method
        input = input.reverse();

        // Step 4: Assert that the reversed string matches the expected output
        assertEquals(input.toString(), output);

        // Print a message indicating the test result
        System.out.println("Both the strings are same");
    }
}
