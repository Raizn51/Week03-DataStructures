package com.tit.day02stackqueueandhashmap.hashmapandhashfunction.longestconsecutivesequenceproblem;

import java.util.HashSet;

// Creating a class LongestConsecutiveSequence to find the longest consecutive elements sequence
class LongestConsecutiveSequence {
    // Method to find the length of the longest consecutive sequence
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longestStreak = 0;

        // Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        // Loop through the numbers
        for (int num : set) {
            // Check if it is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Check the length of the current sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak; // Return the length of the longest consecutive sequence
    }
}
