package com.tit.day02stackqueueandhashmap.hashmapandhashfunction.pairwithgivensum;

/**
 * Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
 *
 * Approach:
 * 1. Store visited numbers in a hashmap.
 * 2. For each number, check if target - current_number exists in the hashmap.
 */

// Creating a class PairWithGivenSum to demonstrate finding a pair with the given sum
class PairWithGivenSum {
    public static void main(String[] args) {
        // Example array and target sum
        int[] nums = {10, 15, 3, 7};
        int target = 17;
        // Check if there exists a pair with the given sum
        boolean result = Pair.hasPairWithSum(nums, target);

        // Print the result
        System.out.println("Pair with given sum exists: " + result);  // Output: Pair with given sum exists: true
    }
}
