package com.tit.day02stackqueueandhashmap.stackandqueue.circulartourproblem;

// Creating a class CircularTour to determine the starting point for completing a circular tour
class CircularTour {
    // Method to find the starting point for the circular tour
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0, surplus = 0, deficit = 0;

        // Loop through the petrol pumps
        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];

            // If surplus is negative, move the starting point and adjust the deficit
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }
        // If total surplus and deficit is non-negative, return the starting point
        return (surplus + deficit >= 0) ? start : -1;
    }
}
