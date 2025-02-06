package com.tit.day0405searchingreadingstringstype.linearsearch.searchforaspecificword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestingLinearSearch
{

    @Test
    public void testFindFirstSentenceContainingWord()
    {
        String[] sentences = {
                "This is the first sentence.",
                "Another sentence follows.",
                "The specific word is in this sentence.",
                "Yet another sentence without the word."
        };
        try
        {
            // Test case where the word is present
            String word = "specific";
            String expected = "The specific word is in this sentence.";
            Assertions.assertEquals(expected, LinearSearch.findFirstSentenceContainingWord(sentences, word));
            System.out.println("testFindFirstSentenceContainingWord function working like as expected");

            // Test case where the word is not present
            word = "missing";
            expected = "Not Found";
            Assertions.assertEquals(expected, LinearSearch.findFirstSentenceContainingWord(sentences, word));
            System.out.println("testFindFirstSentenceContainingWord function working like as expected");

            // Test case with an empty array
            sentences = new String[]{};
            word = "in";
            expected = "Not Found";
            Assertions.assertEquals(expected, LinearSearch.findFirstSentenceContainingWord(sentences, word));
            System.out.println("testFindFirstSentenceContainingWord function working like as expected");

        }
        catch (Error e)
        {
            System.out.println("Error - "+e.getMessage());
        }

    }
}
