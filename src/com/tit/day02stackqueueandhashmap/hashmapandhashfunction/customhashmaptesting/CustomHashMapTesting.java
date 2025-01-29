package com.tit.day02stackqueueandhashmap.hashmapandhashfunction.customhashmaptesting;

/**
 * Problem: Design and implement a basic hashmap class with operations for insertion, deletion, and retrieval.
 *
 * Approach:
 * 1. Use an array of linked lists to handle collisions using separate chaining.
 */


// Creating a class CustomHashMapTesting to demonstrate the custom hashmap implementation
class CustomHashMapTesting {
    public static void main(String[] args) {
        // Create an instance of CustomHashMap
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // Insert key-value pairs into the hashmap
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Retrieve values by keys
        System.out.println("Value for key 'one': " + map.get("one"));  // Output: Value for key 'one': 1
        System.out.println("Value for key 'two': " + map.get("two"));  // Output: Value for key 'two': 2

        // Delete a key-value pair
        map.remove("two");

        // Try to retrieve the deleted key
        System.out.println("Value for key 'two': " + map.get("two"));  // Output: Value for key 'two': null
    }
}
