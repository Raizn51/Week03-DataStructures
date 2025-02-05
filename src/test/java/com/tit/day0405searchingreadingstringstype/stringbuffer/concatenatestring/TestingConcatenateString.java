package com.tit.day0405searchingreadingstringstype.stringbuffer.concatenatestring;

import com.tit.day0405searchingreadingstringstype.stringbuffer.concatenatestrings.ConcatenateStrings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating a class TestingConcatenateString to test the concatenateStringUsingStringBuffer functionality
public class TestingConcatenateString
{
    @Test
    // Method to test concatenateStringUsingStringBuffer method
    public void testingConcatenateStringUsingStringBuffer()
    {
        // Create an array of strings as input
        String[] input = {"Hello1 ", "Hello2 ", "Hello3 ", "Hello4 ", "Hello5 ", "Hello6 ", "Hello7"};

        // Define the expected output after concatenation
        String outputExpected = "Hello1 Hello2 Hello3 Hello4 Hello5 Hello6 Hello7";

        // Call the concatenateStringUsingStringBuffer method with the input array and store the actual output
        String outputActual = ConcatenateStrings.concatenateStringUsingStringBuffer(input);

        // Assert that the actual output matches the expected output
        assertEquals(outputExpected, outputActual);

        // Print a message indicating the function works as expected
        System.out.println("concatenateStringUsingStringBuffer working like expected");
    }
}
