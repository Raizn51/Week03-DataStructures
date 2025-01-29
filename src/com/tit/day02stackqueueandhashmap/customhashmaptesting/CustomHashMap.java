package com.tit.day02stackqueueandhashmap.customhashmaptesting;

import java.util.LinkedList;

// Creating a class CustomHashMap to implement a basic hashmap
class CustomHashMap<K, V> {
    private static final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] buckets;

    // Entry class to store key-value pairs
    static class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the buckets array
    public CustomHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Method to get the index for a key
    private int getIndex(K key) {
        return key.hashCode() % SIZE;
    }

    // Method to insert a key-value pair
    public void put(K key, V value) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }

    // Method to retrieve a value by key
    public V get(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    // Method to delete a key-value pair
    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        bucket.removeIf(entry -> entry.key.equals(key));
    }
}
