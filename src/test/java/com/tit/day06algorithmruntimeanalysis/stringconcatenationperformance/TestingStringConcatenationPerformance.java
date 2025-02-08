package com.tit.day06algorithmruntimeanalysis.stringconcatenationperformance;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


// Class to test the performance of String, StringBuilder, and StringBuffer
class TestingStringConcatenationPerformance
{

    @Test
    public void testingTimeSmall() {
        StringConcatenation stringConcat = new StringConcatenation();
        StringBuilderConcatenation stringBuilderConcat = new StringBuilderConcatenation();
        StringBufferConcatenation stringBufferConcat = new StringBufferConcatenation();

        // Generate small dataset
        int size = 1000;

        // Measure time for String concatenation
        long startTime = System.nanoTime();
        stringConcat.concatenateWithString(size);
        long endTime = System.nanoTime();
        double stringTime = (endTime - startTime) / 1000000.0;

        // Measure time for StringBuilder concatenation
        startTime = System.nanoTime();
        stringBuilderConcat.concatenateWithStringBuilder(size);
        endTime = System.nanoTime();
        double stringBuilderTime = (endTime - startTime) / 1000000.0;

        // Measure time for StringBuffer concatenation
        startTime = System.nanoTime();
        stringBufferConcat.concatenateWithStringBuffer(size);
        endTime = System.nanoTime();
        double stringBufferTime = (endTime - startTime) / 1000000.0;

        // Assert that StringBuilder and StringBuffer are faster than String
        assertTrue(stringTime > stringBuilderTime);
        assertTrue(stringTime > stringBufferTime);
        System.out.println("Testing Pass for Small Data");
    }

    @Test
    public void testingTimeMedium() {
        StringConcatenation stringConcat = new StringConcatenation();
        StringBuilderConcatenation stringBuilderConcat = new StringBuilderConcatenation();
        StringBufferConcatenation stringBufferConcat = new StringBufferConcatenation();

        // Generate medium dataset
        int size = 10000;

        // Measure time for String concatenation
        long startTime = System.nanoTime();
        stringConcat.concatenateWithString(size);
        long endTime = System.nanoTime();
        double stringTime = (endTime - startTime) / 1000000.0;

        // Measure time for StringBuilder concatenation
        startTime = System.nanoTime();
        stringBuilderConcat.concatenateWithStringBuilder(size);
        endTime = System.nanoTime();
        double stringBuilderTime = (endTime - startTime) / 1000000.0;

        // Measure time for StringBuffer concatenation
        startTime = System.nanoTime();
        stringBufferConcat.concatenateWithStringBuffer(size);
        endTime = System.nanoTime();
        double stringBufferTime = (endTime - startTime) / 1000000.0;

        // Assert that StringBuilder and StringBuffer are faster than String
        assertTrue(stringTime > stringBuilderTime);
        assertTrue(stringTime > stringBufferTime);
        System.out.println("Testing Pass for Medium Data");
    }

    @Test
    public void testingTimeLarge() {
        StringConcatenation stringConcat = new StringConcatenation();
        StringBuilderConcatenation stringBuilderConcat = new StringBuilderConcatenation();
        StringBufferConcatenation stringBufferConcat = new StringBufferConcatenation();

        // Generate large dataset
        int size = 1000000;

        // Measure time for String concatenation
        long startTime = System.nanoTime();
        stringConcat.concatenateWithString(size);
        long endTime = System.nanoTime();
        double stringTime = (endTime - startTime) / 1000000.0;

        // Measure time for StringBuilder concatenation
        startTime = System.nanoTime();
        stringBuilderConcat.concatenateWithStringBuilder(size);
        endTime = System.nanoTime();
        double stringBuilderTime = (endTime - startTime) / 1000000.0;

        // Measure time for StringBuffer concatenation
        startTime = System.nanoTime();
        stringBufferConcat.concatenateWithStringBuffer(size);
        endTime = System.nanoTime();
        double stringBufferTime = (endTime - startTime) / 1000000.0;

        // Assert that StringBuilder and StringBuffer are faster than String
        assertTrue(stringTime > stringBuilderTime);
        assertTrue(stringTime > stringBufferTime);
        System.out.println("Testing Pass for Large Data");
    }
}
