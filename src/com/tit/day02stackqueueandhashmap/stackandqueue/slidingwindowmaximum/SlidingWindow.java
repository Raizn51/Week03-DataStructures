package com.tit.day02stackqueueandhashmap.stackandqueue.slidingwindowmaximum;

import java.util.Deque;
import java.util.LinkedList;

// Creating a class SlidingWindow to represent the sliding window maximum problem
class SlidingWindow {
    // Method to find the maximum element in each sliding window
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return new int[0];

        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        // Loop through the elements
        for (int i = 0; i < n; i++) {
            // Remove elements from the front of the deque if they are out of the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements from the back of the deque if they are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element's index to the deque
            deque.offerLast(i);

            // The front of the deque is the maximum element for the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
