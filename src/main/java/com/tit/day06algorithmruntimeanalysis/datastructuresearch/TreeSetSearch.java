package com.tit.day06algorithmruntimeanalysis.datastructuresearch;

import java.util.TreeSet;

// Creating a class TreeSetSearch to represent search in a TreeSet
class TreeSetSearch {
    // Method to search for an element in a TreeSet
    public boolean searchInTreeSet(TreeSet<Integer> set, int target) {
        return set.contains(target);
    }
}
