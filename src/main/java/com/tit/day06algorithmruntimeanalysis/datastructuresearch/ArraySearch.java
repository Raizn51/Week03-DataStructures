package com.tit.day06algorithmruntimeanalysis.datastructuresearch;

// Creating a class ArraySearch to represent linear search in an array
class ArraySearch {
    // Method to search for an element in an array
    public boolean searchInArray(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
