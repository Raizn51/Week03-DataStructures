package com.tit.day01linkedlist.doublylinkedlist.texteditor;
/*
8. Doubly Linked List: Undo/Redo Functionality for Text Editor
Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
Add a new text state at the end of the list every time the user types or performs an action.
Implement the undo functionality (revert to the previous state).
Implement the redo functionality (revert back to the next state after undo).
Display the current state of the text.
Limit the undo/redo history to a fixed size (e.g., last 10 states).
Hint:
Use a doubly linked list where each node represents a state of the text.
The next pointer will represent the forward history (redo), and the prev pointer will represent the backward history (undo).
Keep track of the current state and adjust the next and prev pointers for undo/redo operations.
*/


// Creating a class TextEditor to demonstrate the functionalities of DoublyLinkedList
class TextEditor {
    public static void main(String[] args) {
        DoublyLinkedList editor = new DoublyLinkedList(10); // History size limited to 10 states

        // Adding text states
        editor.addTextState("Hello");
        editor.addTextState("Hello, World");
        editor.addTextState("Hello, World!");

        // Display current state
        System.out.println("Displaying current state:");
        editor.displayCurrentState();

        // Perform undo operations
        System.out.println("\nPerforming undo:");
        editor.undo();
        editor.undo();

        // Perform redo operation
        System.out.println("\nPerforming redo:");
        editor.redo();

        // Add more states
        System.out.println("\nAdding new states:");
        editor.addTextState("Hello, Java!");
        editor.displayCurrentState();

        // Undo beyond the oldest state
        System.out.println("\nUndo beyond the oldest state:");
        editor.undo();
        editor.undo();
        editor.undo();
    }
}
