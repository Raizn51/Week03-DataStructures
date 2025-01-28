package com.tit.day01linkedlist.doublylinkedlist.librarymanagementsystem;

// Creating a class DoublyLinkedList to represent the doubly linked list structure for library records
class DoublyLinkedList {
    static class Book {
        String title;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;
        Book next;
        Book prev;

        // Constructor to initialize book node
        Book(String title, String author, String genre, int bookId, boolean isAvailable) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.isAvailable = isAvailable;
            this.next = null;
            this.prev = null;
        }
    }

    Book head = null;
    Book tail = null;

    // Method to add a book at the beginning of the list
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Method to add a book at the end of the list
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Method to add a book at a specific position in the list
    public void addBookAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (position == 1) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }
        Book temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            if (newBook.next == null) {
                tail = newBook;
            }
        }
    }

    // Method to remove a book by Book ID
    public void removeBookById(int bookId) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found");
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

    // Method to search for a book by Book Title
    public void searchBookByTitle(String title) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println("Book ID: " + temp.bookId + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Availability: " + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Book not found with title: " + title);
        }
    }

    // Method to search for a book by Author
    public void searchBookByAuthor(String author) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                System.out.println("Book ID: " + temp.bookId + ", Title: " + temp.title + ", Genre: " + temp.genre + ", Availability: " + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Book not found by author: " + author);
        }
    }

    // Method to update the availability status of a book by Book ID
    public void updateAvailabilityById(int bookId, boolean newStatus) {
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found");
        } else {
            temp.isAvailable = newStatus;
        }
    }

    // Method to display all books in forward order
    public void displayAllBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId + ", Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Availability: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    // Method to display all books in reverse order
    public void displayAllBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId + ", Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Availability: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    // Method to count the total number of books in the library
    public int countTotalBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
