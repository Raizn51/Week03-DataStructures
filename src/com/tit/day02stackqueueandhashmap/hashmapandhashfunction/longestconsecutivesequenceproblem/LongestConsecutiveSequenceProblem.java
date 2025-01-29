package com.tit.day02stackqueueandhashmap.hashmapandhashfunction.longestconsecutivesequenceproblem;

/**
 * Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
 *
 * Approach:
 * 1. Use a hashmap to store elements.
 * 2. Check for consecutive elements efficiently.
 */

// Creating a class LongestConsecutiveSequenceProblem to demonstrate the finding of the longest consecutive sequence
class LongestConsecutiveSequenceProblem {
    public static void main(String[] args) {
        // Example array
        int[] nums = {100, 4, 200, 1, 3, 2};
        // Find the length of the longest consecutive sequence
        int result = LongestConsecutiveSequence.longestConsecutive(nums);

        // Print the result
        System.out.println("Length of the longest consecutive sequence: " + result);  // Output: Length of the longest consecutive sequence: 4
    }
}
