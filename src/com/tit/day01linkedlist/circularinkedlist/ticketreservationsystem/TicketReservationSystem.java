package com.tit.day01linkedlist.circularinkedlist.ticketreservationsystem;
/*
9. Circular Linked List: Online Ticket Reservation System
Problem Statement: Design an online ticket reservation system using a circular linked list, where each node represents a booked ticket. Each node will store the following information: Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
Add a new ticket reservation at the end of the circular list.
Remove a ticket by Ticket ID.
Display the current tickets in the list.
Search for a ticket by Customer Name or Movie Name.
Calculate the total number of booked tickets.

Hint:
Use a circular linked list to represent the ticket reservations, with the last node’s next pointer pointing to the first node.
When removing a ticket, update the circular pointers accordingly.
For displaying all tickets, traverse the list starting from the first node, looping back after reaching the last node.

*/

// Creating a class TicketReservationSystem to demonstrate the functionalities of CircularLinkedList
class TicketReservationSystem {
    public static void main(String[] args) {
        CircularLinkedList reservationSystem = new CircularLinkedList();

        // Adding tickets
        reservationSystem.addTicket(101, "Alice", "Avatar 2", "A1", "10:00 AM");
        reservationSystem.addTicket(102, "Bob", "Inception", "B2", "12:00 PM");
        reservationSystem.addTicket(103, "Charlie", "Avatar 2", "A2", "10:00 AM");

        // Displaying all tickets
        System.out.println("\nDisplaying all tickets:");
        reservationSystem.displayTickets();

        // Searching for tickets
        System.out.println("\nSearching for tickets by Customer Name:");
        reservationSystem.searchTicket("Alice");

        System.out.println("\nSearching for tickets by Movie Name:");
        reservationSystem.searchTicket("Inception");

        // Removing a ticket
        System.out.println("\nRemoving a ticket with ID 102:");
        reservationSystem.removeTicket(102);
        reservationSystem.displayTickets();

        // Counting total tickets
        System.out.println("\nCounting total tickets:");
        reservationSystem.countTickets();
    }
}
