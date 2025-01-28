package com.tit.day01linkedlist.doublylinkedlist.librarymanagementsystem;
/*
5. Doubly Linked List: Library Management System
Problem Statement: Design a library management system using a doubly linked list. Each node represents a book and contains the following attributes: Book Title, Author, Genre, Book ID, and Availability Status. Implement the following functionalities:
Add a new book at the beginning, end, or at a specific position.
Remove a book by Book ID.
Search for a book by Book Title or Author.
Update a book’s Availability Status.
Display all books in forward and reverse order.
Count the total number of books in the library.
Hint:
Use a doubly linked list with two pointers (next and prev) in each node to facilitate traversal in both directions.
Ensure that when removing a book, both the next and prev pointers are correctly updated.
Displaying in reverse order will require traversal from the last node using prev pointers.
*/


// Creating a class LibraryManagementSystem to demonstrate the functionalities of DoublyLinkedList
class LibraryManagementSystem {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Adding some books using different methods
        list.addBookAtEnd("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true);
        list.addBookAtBeginning("1984", "George Orwell", "Dystopian", 102, true);
        list.addBookAtEnd("To Kill a Mockingbird", "Harper Lee", "Fiction", 103, true);
        list.addBookAtPosition(2, "Moby Dick", "Herman Melville", "Adventure", 104, false);
        list.addBookAtEnd("Pride and Prejudice", "Jane Austen", "Romance", 105, true);
        list.addBookAtBeginning("The Catcher in the Rye", "J.D. Salinger", "Fiction", 106, true);
        list.addBookAtPosition(3, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 107, false);

        // Displaying all books in forward order
        System.out.println("All books (forward):");
        list.displayAllBooksForward();

        // Displaying all books in reverse order
        System.out.println("\nAll books (reverse):");
        list.displayAllBooksReverse();

        // Updating a book's availability status
        System.out.println("\nUpdating availability for 'The Great Gatsby':");
        list.updateAvailabilityById(101, false);
        list.displayAllBooksForward();

        // Searching for a book by title
        System.out.println("\nSearching for book with title '1984':");
        list.searchBookByTitle("1984");

        // Searching for a book by author
        System.out.println("\nSearching for books by 'George Orwell':");
        list.searchBookByAuthor("George Orwell");

        // Counting total number of books
        System.out.println("\nTotal number of books in the library:");
        System.out.println(list.countTotalBooks());

        // Removing a book by Book ID
        System.out.println("\nRemoving 'Moby Dick':");
        list.removeBookById(104);
        list.displayAllBooksForward();
    }
}
