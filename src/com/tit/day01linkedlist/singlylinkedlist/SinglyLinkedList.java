package com.tit.day01linkedlist.singlylinkedlist;

// Creating a class SinglyLinkedList to represent the singly linked list structure for inventory records
class SinglyLinkedList {
    static class Item {
        String name;
        int itemId;
        int quantity;
        double price;
        Item next;

        // Constructor to initialize item node
        Item(String name, int itemId, int quantity, double price) {
            this.name = name;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    Item head = null;

    // Method to add an item at the beginning of the list
    public void addItemAtBeginning(String name, int itemId, int quantity, double price) {
        Item newItem = new Item(name, itemId, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            newItem.next = head;
            head = newItem;
        }
    }

    // Method to add an item at the end of the list
    public void addItemAtEnd(String name, int itemId, int quantity, double price) {
        Item newItem = new Item(name, itemId, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    // Method to add an item at a specific position in the list
    public void addItemAtPosition(int position, String name, int itemId, int quantity, double price) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        Item newItem = new Item(name, itemId, quantity, price);
        if (position == 1) {
            addItemAtBeginning(name, itemId, quantity, price);
            return;
        }
        Item temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            newItem.next = temp.next;
            temp.next = newItem;
        }
    }

    // Method to remove an item based on Item ID
    public void removeItemById(int itemId) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Method to update the quantity of an item by Item ID
    public void updateQuantityById(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null && temp.itemId != itemId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Item not found");
        } else {
            temp.quantity = newQuantity;
        }
    }

    // Method to search for an item based on Item ID
    public void searchItemById(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println("Name: " + temp.name + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Method to search for an item based on Item Name
    public void searchItemByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Method to calculate and display the total value of inventory
    public void calculateTotalValue() {
        Item temp = head;
        double totalValue = 0;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    // Method to sort the inventory based on Item Name in ascending order
    public void sortInventoryByNameAscending() {
        if (head == null || head.next == null) {
            return;
        }
        head = mergeSort(head, true, true);
    }

    // Method to sort the inventory based on Item Name in descending order
    public void sortInventoryByNameDescending() {
        if (head == null || head.next == null) {
            return;
        }
        head = mergeSort(head, true, false);
    }

    // Method to sort the inventory based on Price in ascending order
    public void sortInventoryByPriceAscending() {
        if (head == null || head.next == null) {
            return;
        }
        head = mergeSort(head, false, true);
    }

    // Method to sort the inventory based on Price in descending order
    public void sortInventoryByPriceDescending() {
        if (head == null || head.next == null) {
            return;
        }
        head = mergeSort(head, false, false);
    }

    // Merge sort function to sort the linked list
    private Item mergeSort(Item head, boolean sortByName, boolean ascending) {
        if (head == null || head.next == null) {
            return head;
        }
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSort(head, sortByName, ascending);
        Item right = mergeSort(nextOfMiddle, sortByName, ascending);
        return merge(left, right, sortByName, ascending);
    }

    // Function to merge two sorted lists
    private Item merge(Item left, Item right, boolean sortByName, boolean ascending) {
        Item sortedList;
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        int comparison;
        if (sortByName) {
            comparison = left.name.compareToIgnoreCase(right.name);
        } else {
            comparison = Double.compare(left.price, right.price);
        }
        if (ascending) {
            if (comparison <= 0) {
                sortedList = left;
                sortedList.next = merge(left.next, right, sortByName, ascending);
            } else {
                sortedList = right;
                sortedList.next = merge(left, right.next, sortByName, ascending);
            }
        } else {
            if (comparison >= 0) {
                sortedList = left;
                sortedList.next = merge(left.next, right, sortByName, ascending);
            } else {
                sortedList = right;
                sortedList.next = merge(left, right.next, sortByName, ascending);
            }
        }
        return sortedList;
    }

    // Function to find the middle of the linked list
    private Item getMiddle(Item head) {
        if (head == null) {
            return head;
        }
        Item slow = head;
        Item fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Method to display all items in the inventory
    public void displayAllItems() {
        Item temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}
