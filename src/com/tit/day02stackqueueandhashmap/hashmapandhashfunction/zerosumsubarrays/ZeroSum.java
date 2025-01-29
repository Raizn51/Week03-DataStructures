package com.tit.day02stackqueueandhashmap.hashmapandhashfunction.zerosumsubarrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Creating a class ZeroSum.java to find all subarrays with zero sum
class ZeroSum {
    // Method to find all subarrays with zero sum
    public static List<int[]> findSubarraysWithZeroSum(int[] nums) {
        List<int[]> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        // Add initial zero sum to handle subarrays starting from index 0
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Update the cumulative sum with the current element

            // Check if the current sum is present in the map
            if (sumMap.containsKey(sum)) {
                // If present, add all subarrays ending at index i with the sum zero
                for (int startIdx : sumMap.get(sum)) {
                    result.add(new int[]{startIdx + 1, i});
                }
            }

            // Add the current sum to the map
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result; // Return the list of subarrays
    }
}
