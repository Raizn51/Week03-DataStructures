package com.tit.day0405searchingreadingstringstype.linearsearch.firstnegativenumber;

import com.tit.day0405searchingreadingstringstype.stringbuffer.concatenatestrings.ConcatenateStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingLinearSearch
{
    @Test
    public void findFirstNegative()
    {
        // Creating an array
        int[] array = {3, 5, 11,3,7,9,0,0,5,7, -2, 8, -6, 4};

        // Define the expected output after concatenation
        int outputExpected = -2;

        // Call the findFirstNegative method with the input array and store the actual output
        int outputActual = array[LinearSearch.findFirstNegative(array)];

        try
        {
            assertEquals(outputExpected,outputActual);
            System.out.println("findFirstNegative function working like expected");

        }
        catch (Error e)
        {
            // Print error message
            System.out.println("Error - " + e.getMessage());
        }

    }
}
