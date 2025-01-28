package com.tit.day01linkedlist.doublylinkedlist.moviemanagement;

/*
Problem Statement: Movie Management System using Doubly Linked List
Description: Implement a movie management system using a doubly linked list. Each node will represent a movie and
contain Movie Title, Director, Year of Release, and Rating. Implement the following functionalities:
1. Add a movie record at the beginning, end, or at a specific position.
2. Remove a movie record by Movie Title.
3. Search for a movie record by Director or Rating.
4. Display all movie records in both forward and reverse order.
5. Update a movie's Rating based on the Movie Title.
*/


// Creating a class MovieManagement to demonstrate the functionalities of DoublyLinkedList
class MovieManagement {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Adding some movies using different methods
        list.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        list.addMovieAtBeginning("The Matrix", "Wachowskis", 1999, 8.7);
        list.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addMovieAtPosition(2, "The Godfather", "Francis Ford Coppola", 1972, 9.2);
        list.addMovieAtEnd("The Dark Knight", "Christopher Nolan", 2008, 9.0);
        list.addMovieAtBeginning("Fight Club", "David Fincher", 1999, 8.8);
        list.addMovieAtPosition(3, "Pulp Fiction", "Quentin Tarantino", 1994, 8.9);

        // Displaying all movie records
        System.out.println("All movie records (forward):");
        list.displayAllMoviesForward();

        // Displaying all movie records in reverse order
        System.out.println("\nAll movie records (reverse):");
        list.displayAllMoviesReverse();

        // Updating a movie's rating
        System.out.println("\nUpdating rating for 'Inception':");
        list.updateRatingByTitle("Inception", 9.0);
        list.displayAllMoviesForward();

        // Searching for movies by Director
        System.out.println("\nSearching for movies by 'Christopher Nolan':");
        list.searchMoviesByDirector("Christopher Nolan");

        // Searching for movies by Rating
        System.out.println("\nSearching for movies with rating 8.8:");
        list.searchMoviesByRating(8.8);

        // Removing a movie by title
        System.out.println("\nRemoving 'The Godfather':");
        list.removeMovieByTitle("The Godfather");
        list.displayAllMoviesForward();
    }
}
