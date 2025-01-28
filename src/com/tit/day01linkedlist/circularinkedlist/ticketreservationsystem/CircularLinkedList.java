package com.tit.day01linkedlist.circularinkedlist.ticketreservationsystem;

// Creating a class CircularLinkedList to represent the ticket reservation system
class CircularLinkedList {
    static class Ticket {
        int ticketId;         // Ticket ID
        String customerName;  // Customer Name
        String movieName;     // Movie Name
        String seatNumber;    // Seat Number
        String bookingTime;   // Booking Time
        Ticket next;          // Pointer to the next ticket

        // Constructor to initialize the ticket
        Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
            this.next = null;
        }
    }

    Ticket last = null; // Pointer to the last node of the circular linked list
    int size = 0;       // Total number of tickets in the system

    // Method to add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (last == null) {
            // If the list is empty, make the new ticket point to itself
            last = newTicket;
            last.next = last;
        } else {
            // Insert the new ticket at the end and update the circular pointer
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
        size++;
    }

    // Method to remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (last == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = last.next;
        Ticket prev = last;

        // Traverse the circular list to find the ticket to remove
        do {
            if (current.ticketId == ticketId) {
                if (current == last && current.next == last) {
                    // Single ticket case
                    last = null;
                } else {
                    // Update pointers to remove the ticket
                    prev.next = current.next;
                    if (current == last) {
                        last = prev; // Update last pointer if the removed node was the last node
                    }
                }
                size--;
                System.out.println("Ticket with ID " + ticketId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Method to display all tickets
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets to display.");
            return;
        }

        System.out.println("Current Tickets:");
        Ticket current = last.next;
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer Name: " + current.customerName +
                    ", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber +
                    ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    // Method to search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchTerm) {
        if (last == null) {
            System.out.println("No tickets to search.");
            return;
        }

        Ticket current = last.next;
        boolean found = false;

        do {
            if (current.customerName.equalsIgnoreCase(searchTerm) || current.movieName.equalsIgnoreCase(searchTerm)) {
                System.out.println("Ticket Found: Ticket ID: " + current.ticketId + ", Customer Name: " + current.customerName +
                        ", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber +
                        ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("No ticket found for search term: " + searchTerm);
        }
    }

    // Method to calculate the total number of booked tickets
    public void countTickets() {
        System.out.println("Total number of booked tickets: " + size);
    }
}
