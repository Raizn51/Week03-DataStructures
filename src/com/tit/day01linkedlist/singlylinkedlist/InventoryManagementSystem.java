package com.tit.day01linkedlist.singlylinkedlist;


// Creating a class InventoryManagemenSystem to demonstrate the functionalities of SinglyLinkedList
class InventoryManagementSystem {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Adding some items using different methods
        list.addItemAtEnd("Laptop", 101, 10, 50000);
        list.addItemAtBeginning("Smartphone", 102, 15, 30000);
        list.addItemAtEnd("Tablet", 103, 5, 20000);
        list.addItemAtPosition(2, "Headphones", 104, 20, 1500);
        list.addItemAtEnd("Smartwatch", 105, 25, 10000);
        list.addItemAtBeginning("Monitor", 106, 8, 12000);
        list.addItemAtPosition(3, "Keyboard", 107, 30, 800);

        // Displaying all items
        System.out.println("All items:");
        list.displayAllItems();

        // Updating an item's quantity
        System.out.println("\nUpdating quantity for 'Laptop':");
        list.updateQuantityById(101, 12);
        list.displayAllItems();

        // Searching for items by Item ID
        System.out.println("\nSearching for item with ID 102:");
        list.searchItemById(102);

        //Searching for items by Removing an item
        System.out.println("\nRemoving item with ID 104:");
        list.removeItemById(104);
        list.displayAllItems();

        // Calculating total inventory value
        System.out.println("\nCalculating total inventory value:");
        list.calculateTotalValue();

        // Sorting inventory by name in ascending order
        System.out.println("\nSorting inventory by name in ascending order:");
        list.sortInventoryByNameAscending();
        list.displayAllItems();

        // Sorting inventory by price in descending order
        System.out.println("\nSorting inventory by price in descending order:");
        list.sortInventoryByPriceDescending();
        list.displayAllItems();

        // Searching for a non-existent item
        System.out.println("\nSearching for item with ID 999:");
        list.searchItemById(999);

        System.out.println("\nSearching for item with name 'Mouse':");
        list.searchItemByName("Mouse");
    }
}
