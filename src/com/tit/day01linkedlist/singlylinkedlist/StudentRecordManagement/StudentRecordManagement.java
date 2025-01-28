package com.tit.day01linkedlist.singlylinkedlist.StudentRecordManagement;

/*
Problem Statement 1: Student Record Management System using Singly Linked List
Description: Create a program to manage student records using a singly linked list. Each node will store
information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
1. Add a new student record at the beginning, end, or at a specific position.
2. Delete a student record by Roll Number.
3. Search for a student record by Roll Number.
4. Display all student records.
5. Update a student's grade based on their Roll Number.
*/

// Creating a class StudentRecordManagement to demonstrate the functionalities of SinglyLinkedList
class StudentRecordManagement
{
    public static void main(String[] args)
    {
        SinglyLinkedList list = new SinglyLinkedList();

        // Adding 12 student nodes using different methods
        list.addStudentAtEnd(1, "Alice", 20, "A");
        list.addStudentAtBeginning(2, "Bob", 21, "B");
        list.addStudentAtEnd(3, "Charlie", 22, "C");
        list.addStudentAtPosition(2, 4, "David", 23, "A-");
        list.addStudentAtEnd(5, "Eve", 20, "B+");
        list.addStudentAtBeginning(6, "Frank", 21, "A");
        list.addStudentAtPosition(4, 7, "Grace", 22, "C+");
        list.addStudentAtEnd(8, "Hank", 23, "B-");
        list.addStudentAtBeginning(9, "Ivy", 20, "A+");
        list.addStudentAtPosition(5, 10, "Jack", 21, "B");
        list.addStudentAtEnd(11, "Kate", 22, "A-");
        list.addStudentAtPosition(3, 12, "Leo", 23, "B+");

        // Displaying all student records
        System.out.println("All student records:");
        list.displayAllStudents();

        // Updating a student's grade based on their Roll Number
        System.out.println("\nUpdating grade for Roll Number 1:");
        list.updateGradeByRollNumber(1, "A+");
        list.displayAllStudents();

        // Searching for a student record by Roll Number
        System.out.println("\nSearching for Roll Number 2:");
        SinglyLinkedList.Student student = list.searchStudentByRollNumber(2);
        if (student != null)
        {
            System.out.println("Found: " + student.name);
        }

        // Deleting a student record by Roll Number
        System.out.println("\nDeleting Roll Number 3:");
        list.deleteStudentByRollNumber(3);
        list.displayAllStudents();
    }

}
