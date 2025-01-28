package com.tit.day01linkedlist.singlylinkedlist.socialmediafriendconnections;

/*
7. Singly Linked List: Social Media Friend Connections
Problem Statement: Create a system to manage social media friend connections using a singly linked list. Each node represents a user with User ID, Name, Age, and List of Friend IDs. Implement the following operations:
Add a friend connection between two users.
Remove a friend connection.
Find mutual friends between two users.
Display all friends of a specific user.
Search for a user by Name or User ID.
Count the number of friends for each user.
Hint:
Use a singly linked list where each node contains a list of friends (which can be another linked list or array of Friend IDs).
For mutual friends, traverse both lists and compare the Friend IDs.
The List of Friend IDs for each user can be implemented as a nested linked list or array.
*/


// Creating a class SocialMediaFriendConnections to demonstrate the functionalities of SinglyLinkedList
class SocialMediaFriendConnections {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Adding users
        list.addUser(1, "Alice", 25);
        list.addUser(2, "Bob", 22);
        list.addUser(3, "Charlie", 28);
        list.addUser(4, "Daisy", 23);

        // Adding friend connections
        list.addFriend(1, 2);
        list.addFriend(1, 3);
        list.addFriend(2, 3);
        list.addFriend(3, 4);

        // Displaying friends of a specific user
        System.out.println("Displaying friends of Alice:");
        list.displayFriends(1);

        // Finding mutual friends between users
        System.out.println("\nFinding mutual friends between Alice and Bob:");
        list.findMutualFriends(1, 2);

        // Searching for a user by name
        System.out.println("\nSearching for user named Charlie:");
        list.searchUserByName("Charlie");

        // Counting number of friends for each user
        System.out.println("\nCounting number of friends for each user:");
        list.countFriends();

        // Removing a friend connection
        System.out.println("\nRemoving friend connection between Alice and Bob:");
        list.removeFriend(1, 2);
        list.displayFriends(1);
    }
}
