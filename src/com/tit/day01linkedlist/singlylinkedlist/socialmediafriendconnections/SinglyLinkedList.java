package com.tit.day01linkedlist.singlylinkedlist.socialmediafriendconnections;
import java.util.ArrayList;
import java.util.List;


// Creating a class SinglyLinkedList to represent the singly linked list structure for social media users
class SinglyLinkedList {
    static class User {
        int userId;
        String name;
        int age;
        List<Integer> friendIds;
        User next;

        // Constructor to initialize user node
        User(int userId, String name, int age) {
            this.userId = userId;
            this.name = name;
            this.age = age;
            this.friendIds = new ArrayList<>();
            this.next = null;
        }
    }

    User head = null;

    // Method to add a user
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Method to add a friend connection between two users
    public void addFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.add(userId2);
            user2.friendIds.add(userId1);
        }
    }

    // Method to remove a friend connection
    public void removeFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    // Method to find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>(user1.friendIds);
            mutualFriends.retainAll(user2.friendIds);
            System.out.println("Mutual Friends: " + mutualFriends);
        }
    }

    // Method to display all friends of a specific user
    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friendIds);
        }
    }

    // Method to search for a user by Name
    public void searchUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("User ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // Method to search for a user by User ID
    public void searchUserById(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            System.out.println("User ID: " + user.userId + ", Name: " + user.name + ", Age: " + user.age);
        } else {
            System.out.println("User not found");
        }
    }

    // Method to count the number of friends for each user
    public void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println("User: " + temp.name + ", Number of Friends: " + temp.friendIds.size());
            temp = temp.next;
        }
    }

    // Helper method to find a user by User ID
    private User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
