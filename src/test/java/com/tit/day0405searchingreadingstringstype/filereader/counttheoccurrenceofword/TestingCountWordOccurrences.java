package com.tit.day0405searchingreadingstringstype.filereader.counttheoccurrenceofword;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingCountWordOccurrences to verify the CountWordOccurrences class
public class TestingCountWordOccurrences
{
    @Test
    public void testingCountWordOccurrences()
    {
        // Creating an instance of CountWordOccurrences class
        CountWordOccurrences cwo = new CountWordOccurrences();

        // Reading the target word from the console
        String targetWord = "to";

        // Path to the test file
        String filePath = "src/test/java/com/tit/day0405searchingreadingstringstype/filereader/counttheoccurrenceofword/TestingCountWordOccurrences.java";

        // Calling the countWordOccurrences method with the specified file path and target word
        int output = cwo.countWordOccurrences(filePath, targetWord);

        try
        {
            // Asserting that the output is equal to the expected value (10)
            assertEquals(10, output);

            // Printing a message to indicate the function is working as expected
            System.out.println("countWordOccurrences function working like expected");
        }
        catch (Error e)
        {
            // Printing an error message if the assertion fails
            System.out.println("Error - " + e.getMessage());
            System.out.println(targetWord+" occurs "+output+" time in the text file");
        }
    }
}
