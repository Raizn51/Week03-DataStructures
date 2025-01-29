package com.tit.day02stackqueueandhashmap.hashmapandhashfunction.twosumproblem;

/**
 * Problem: Given an array and a target sum, find two indices such that their values add up to the target.
 *
 * Approach:
 * 1. Use a hashmap to store the index of each element as you iterate.
 * 2. Check if target - current_element exists in the map.
 */


// Creating a class TwoSumProblem to demonstrate finding two indices with the given sum
class TwoSumProblem
{
    public static void main(String[] args) {
        // Example array and target sum
        int[] nums = {2, 7, 11, 15,7};
        int target = 9;
        // Find two indices with the given sum
        int[] result = TwoSum.findTwoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices with the given sum: [" + result[0] + ", " + result[1] + "]");  // Output: Indices with the given sum: [0, 1]
        } else {
            System.out.println("No pair with the given sum found.");
        }
    }
}
