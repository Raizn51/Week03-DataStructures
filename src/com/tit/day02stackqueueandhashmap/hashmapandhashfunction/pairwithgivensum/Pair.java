package com.tit.day02stackqueueandhashmap.hashmapandhashfunction.pairwithgivensum;

import java.util.HashMap;

// Creating a class Pair to check for a pair with the given sum
class Pair {
    // Method to check if there exists a pair with the given sum
    public static boolean hasPairWithSum(int[] nums, int target) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Loop through the array
        for (int num : nums) {
            // Check if the complement of the current number exists in the map
            if (map.containsKey(target - num)) {
                return true;  // Pair found
            }
            // Store the current number in the map
            map.put(num, true);
        }

        return false;  // No pair found
    }
}

