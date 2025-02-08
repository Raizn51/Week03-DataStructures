package com.tit.day06algorithmruntimeanalysis.stringconcatenationperformance;

// Creating a class for String concatenation
class StringConcatenation {
    // Method to concatenate strings using String
    public void concatenateWithString(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
    }
}
