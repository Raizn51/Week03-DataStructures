package com.tit.day06algorithmruntimeanalysis.datastructuresearch;

import java.util.HashSet;

// Creating a class HashSetSearch to represent search in a HashSet
class HashSetSearch {
    // Method to search for an element in a HashSet
    public boolean searchInHashSet(HashSet<Integer> set, int target) {
        return set.contains(target);
    }
}
