/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcasesforquestion2;

import java.util.Random;

/**
 *
 * @author ahmed
 */
public class TestCasesForQuestion2 {

    
    public static void main(String[] args) {
        
        
        int numberOfTests = 100000; // Change this to generate more or fewer tests
        runRandomTests(numberOfTests); // Run up to 'numberOfTests' random test cases
        
        
        
    }

    // Helper method to create a linked list from an array
    public static Node createLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Helper method to print the linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Helper method to generate a random linked list of size 'size'
    public static Node generateRandomList(int size, int maxValue) {
        Random rand = new Random();
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = rand.nextInt(maxValue) + 1;
        }
        return createLinkedList(values);
    }

    // Function to run up to n test cases
    public static void runRandomTests(int n) {
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            Node head;
            int k;

            // Decide whether to generate an empty list or a non-empty list
            if (rand.nextBoolean()) {
                // Generate an empty list
                head = null;
                k = 1; // k value doesn't matter for an empty list
            } else {
                int size = rand.nextInt(10) + 1; // Random size between 1 and 10
                int maxValue = 10; // Random values between 1 and 10
                head = generateRandomList(size, maxValue);
                k = rand.nextInt(size) + 1; // Random k value between 1 and size
            }

            System.out.println("Test case " + (i + 1));
            System.out.print("Original list: ");
            if (head == null) {
                System.out.println("Empty list");
            } else {
                printLinkedList(head);
            }

            Node result = swapNodes(head, k);
            System.out.print("List after swapping k = " + k + ": ");
            if (result == null) {
                System.out.println("Empty list");
            } else {
                printLinkedList(result);
            }

            System.out.println();
        }
    }

  
    public static Node swapNodes(Node head, int k) {
        
        // Put your implementation here
        return null;
    }

}


class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Counts the total number of nodes in the linked list
    public static int countNodes(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
