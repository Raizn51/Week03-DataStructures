package com.tit.day01linkedlist.doublylinkedlist.texteditor;

// Creating a class DoublyLinkedList to represent the structure for text editor undo/redo functionality
class DoublyLinkedList {
    static class TextState {
        String content; // Text content at the current state
        TextState prev; // Pointer to the previous state
        TextState next; // Pointer to the next state

        // Constructor to initialize the text state
        TextState(String content) {
            this.content = content;
            this.prev = null;
            this.next = null;
        }
    }

    TextState head = null;   // Head of the doubly linked list
    TextState current = null; // Current state pointer
    int size = 0;            // Current size of the history
    final int maxSize;       // Maximum size of the history

    // Constructor to initialize with a fixed history size
    public DoublyLinkedList(int maxSize) {
        this.maxSize = maxSize;
    }

    // Method to add a new state
    public void addTextState(String content) {
        TextState newState = new TextState(content);

        // Remove forward history if present (after undo)
        if (current != null && current.next != null) {
            current.next = null;
        }

        // Add the new state
        if (current == null) {
            head = newState;
        } else {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;

        // Maintain the size limit by removing the oldest state if necessary
        size++;
        if (size > maxSize) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }
    }

    // Method to perform undo
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed. Current state: " + current.content);
        } else {
            System.out.println("Cannot undo. Already at the oldest state.");
        }
    }

    // Method to perform redo
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed. Current state: " + current.content);
        } else {
            System.out.println("Cannot redo. Already at the newest state.");
        }
    }

    // Method to display the current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current state: " + current.content);
        } else {
            System.out.println("No current state available.");
        }
    }
}
