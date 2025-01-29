package com.tit.day02stackqueueandhashmap.stackandqueue.circulartourproblem;

/**
 * Problem: Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.
 *
 * Approach:
 * 1. Use a queue to simulate the tour, keeping track of surplus petrol at each pump.
 * 2. Traverse the petrol pumps and check if we can complete the tour starting from each pump.
 * 3. Maintain a current index and count of pumps processed to detect cycles.
 */

// Creating a class CircularTourProblem to demonstrate the circular tour calculation
class CircularTourProblem {
    public static void main(String[] args) {
        // Example petrol and distance arrays
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        // Find the starting point for the circular tour
        int start = CircularTour.findStartingPoint(petrol, distance);

        // Print the starting point
        System.out.println("Starting point: " + start);  // Output: Starting point: 1
    }
}
