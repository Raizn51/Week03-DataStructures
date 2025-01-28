package com.tit.day01linkedlist.singlylinkedlist.StudentRecordManagement;

// Creating a class SinglyLinkedList to represent the singly linked list structure for student records
class SinglyLinkedList
{
    static int numberOfNodes = 0;

    // Creating a class to represent each student node in the linked list
    static class Student {
        int rollNumber;
        String name;
        int age;
        String grade;
        Student next;

        // Constructor to initialize student node
        Student(int rollNumber, String name, int age, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    static Student head = null;

    // Method to add a student record at the beginning of the list
    public void addStudentAtBeginning(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
        numberOfNodes++;
    }

    // Method to add a student record at the end of the list
    public void addStudentAtEnd(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
        } else {
            Student ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newStudent;
        }
        numberOfNodes++;
    }

    // Method to add a student record at a specific position in the list
    public void addStudentAtPosition(int position, int rollNumber, String name, int age, String grade) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (position == 1) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            newStudent.next = temp.next;
            temp.next = newStudent;
        }
        numberOfNodes++;
    }

    // Method to delete a student record by Roll Number
    public void deleteStudentByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            numberOfNodes--;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            numberOfNodes--;
        }
    }

    // Method to search for a student record by Roll Number
    public Student searchStudentByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null && temp.rollNumber != rollNumber) {
            temp = temp.next;
        }
        return temp;
    }

    // Method to update a student's grade by Roll Number
    public void updateGradeByRollNumber(int rollNumber, String newGrade) {
        Student temp = head;
        while (temp != null && temp.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Student not found");
        } else {
            temp.grade = newGrade;
        }
    }

    // Method to display all student records
    public void displayAllStudents() {
        if (head == null) System.out.println("LinkedList is empty");
        else {
            Student ptr = head;
            while (ptr != null) {
                System.out.println("Roll Number: " + ptr.rollNumber + ", Name: " + ptr.name + ", Age: " + ptr.age + ", Grade: " + ptr.grade);
                ptr = ptr.next;
            }
        }
    }
}
