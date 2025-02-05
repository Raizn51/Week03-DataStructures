package com.tit.day0405searchingreadingstringstype.stringbuilder.removeduplicatesfromstring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Creating a class TestingRemoveDuplicates to test the RemoveDuplicates functionality
public class TestingRemoveDuplicates
{
    @Test
    // Method to test removeDuplicatesFromString method
    public void testingRemoveDuplicatesFromString()
    {
        // Call the removeDuplicatesFromString method with sample input and store the result
        String output = RemoveDuplicates.removeDuplicatesFromString("goooggggogoogogogogogogoggooggogo");

        // Assert that the output matches the expected result
        assertEquals("go", output);

        // Print a message indicating the function works as expected
        System.out.println("removeDuplicatesFromString Function working like expected");
    }
}
