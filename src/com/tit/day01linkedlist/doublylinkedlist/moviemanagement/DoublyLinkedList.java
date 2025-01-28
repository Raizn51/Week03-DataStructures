package com.tit.day01linkedlist.doublylinkedlist.moviemanagement;

// Creating a class DoublyLinkedList to represent the doubly linked list structure for movie records
class DoublyLinkedList {
    static class Movie {
        String title;
        String director;
        int yearOfRelease;
        double rating;
        Movie next;
        Movie prev;

        // Constructor to initialize movie node
        Movie(String title, String director, int yearOfRelease, double rating) {
            this.title = title;
            this.director = director;
            this.yearOfRelease = yearOfRelease;
            this.rating = rating;
            this.next = null;
            this.prev = null;
        }
    }

    Movie head = null;
    Movie tail = null;

    // Method to add a movie record at the beginning of the list
    public void addMovieAtBeginning(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Method to add a movie record at the end of the list
    public void addMovieAtEnd(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Method to add a movie record at a specific position in the list
    public void addMovieAtPosition(int position, String title, String director, int yearOfRelease, double rating) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (position == 1) {
            addMovieAtBeginning(title, director, yearOfRelease, rating);
            return;
        }
        Movie temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            newMovie.next = temp.next;
            newMovie.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newMovie;
            }
            temp.next = newMovie;
            if (newMovie.next == null) {
                tail = newMovie;
            }
        }
    }

    // Method to remove a movie record by Movie Title
    public void removeMovieByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie not found");
        } else {
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            } else {
                head = temp.next;
            }
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            } else {
                tail = temp.prev;
            }
        }
    }

    // Method to search for a movie record by Director
    public void searchMoviesByDirector(String director) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Title: " + temp.title + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found by director " + director);
        }
    }

    // Method to search for a movie record by Rating
    public void searchMoviesByRating(double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found with rating " + rating);
        }
    }

    // Method to display all movie records in forward order
    public void displayAllMoviesForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Method to display all movie records in reverse order
    public void displayAllMoviesReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    // Method to update a movie's Rating based on the Movie Title
    public void updateRatingByTitle(String title, double newRating) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie not found");
        } else {
            temp.rating = newRating;
        }
    }
}
