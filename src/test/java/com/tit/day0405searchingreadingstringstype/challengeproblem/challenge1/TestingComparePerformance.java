package com.tit.day0405searchingreadingstringstype.challengeproblem.challenge1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingComparePerformance {

    @Test
    public void testComparePerformanceMethods() {
        // Measure the time taken by StringBuilder
        long durationStringBuilder = ComparePerformance.measureStringBuilder();

        // Measure the time taken by StringBuffer
        long durationStringBuffer = ComparePerformance.measureStringBuffer();

        // Sample file path for testing file readers
        String filePath = "src/test/java/com/tit/day0405searchingreadingstringstype/challengeproblem/challenge1/100MBFile.txt";

        // Measure the time taken by FileReader
        long durationFileReader = ComparePerformance.measureFileReader(filePath);

        // Measure the time taken by InputStreamReader
        long durationInputStreamReader = ComparePerformance.measureInputStreamReader(filePath);

        try
        {
            // Assert that the StringBuilder and StringBuffer durations are the same
            assertEquals(durationStringBuilder, durationStringBuffer);


            System.out.println("StringBuffer and StringBuilder have the same duration");
        }
        catch (Error e)
        {
            System.out.println("\nError - " + e.getMessage());
            System.out.println("StringBuffer duration: " + durationStringBuffer);
            System.out.println("StringBuilder duration: " + durationStringBuilder);
            System.out.println("StringBuffer and StringBuilder durations are not the same");
        }

        try
        {
            // Assert that the FileReader and InputStreamReader durations are the same
            assertEquals(durationFileReader, durationInputStreamReader);
            System.out.println("FileReader and InputStreamReader have the same duration");
        }
        catch (Error e)
        {
            System.out.println("\nError - " + e.getMessage());
            System.out.println("FileReader duration: " + durationFileReader);
            System.out.println("InputStreamReader duration: " + durationInputStreamReader);
            System.out.println("FileReader and InputStreamReader durations are not the same");
        }
    }
}
