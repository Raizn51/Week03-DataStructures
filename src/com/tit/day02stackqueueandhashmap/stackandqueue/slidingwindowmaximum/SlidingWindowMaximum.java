package com.tit.day02stackqueueandhashmap.stackandqueue.slidingwindowmaximum;

/**
 * Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
 *
 * Approach:
 * 1. Use a deque (double-ended queue) to maintain indices of useful elements in each window.
 * 2. For each element, remove elements from the deque that are out of the current window or smaller than the current element.
 * 3. The front of the deque will always be the maximum element for the current window.
 */



// Creating a class SlidingWindowMaximum to demonstrate the sliding window maximum calculation
class SlidingWindowMaximum {
    public static void main(String[] args) {
        // Example array and window size
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        // Find the maximum element in each sliding window
        int[] result = SlidingWindow.maxSlidingWindow(nums, k);

        // Print the result
        for (int r : result) {
            System.out.print(r + " ");  // Output: [3, 3, 5, 5, 6, 7]
        }
    }
}
