package com.tit.day02stackqueueandhashmap.hashmapandhashfunction.twosumproblem;

import java.util.HashMap;

// Creating a class TwoSum to find two indices with the given sum
class TwoSum
{
    // Method to find two indices with the given sum
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement of the current number exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};  // Indices found
            }
            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        return new int[0];  // No pair found
    }
}
