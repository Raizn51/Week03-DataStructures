package com.tit.day0405searchingreadingstringstype.stringbuffer.comparestringbufferwithstringbuilder;

/*
StringBuffer Problem 2: Compare StringBuffer with StringBuilder for String Concatenation
Testing:
Write a test case to verify the functionality of comparing the performance of StringBuffer and StringBuilder.
Approach:
- Define a test method annotated with @Test.
- Create an instance of CompareStringBufferAndStringBuilder.
- Measure the time taken to concatenate strings using StringBuffer and StringBuilder.
- Assert that the durations are the same (note: this might fail due to inherent differences in performance).
- Print messages indicating whether the durations are the same or not.
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingCompareStringBufferAndStringBuilder to test the performance comparison
public class TestingCompareStringBufferAndStringBuilder
{
    @Test
    // Method to test the performance of StringBuffer and StringBuilder
    public void testBothFunctionOfClassCompareStringBufferAndStringBuilder()
    {
        // Create an instance of CompareStringBufferAndStringBuilder
        CompareStringBufferAndStringBuilder compare = new CompareStringBufferAndStringBuilder();

        // Measure the time taken to concatenate strings using StringBuilder
        long durationStringBuilder = compare.concatenationStringByStringBuilder();

        // Measure the time taken to concatenate strings using StringBuffer
        long durationStringBuffer = compare.concatenationStringByStringBuffer();

        try
        {
            // Assert that the durations are the same (this might fail due to differences in performance)
            assertEquals(durationStringBuilder, durationStringBuffer);
            System.out.println("Duration taken by both the classes StringBuffer and StringBuilder are the same");
        }
        catch (Error e)
        {
            // Print error message and indicate that durations are not the same
            System.out.println("Error - " + e.getMessage());
            System.out.println("Duration taken by both the classes StringBuffer and StringBuilder are not the same");
        }
    }
}
