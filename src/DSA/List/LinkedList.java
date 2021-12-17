/*
* List with add element to the end and the first
* */

package DSA.List;
import java.util.Scanner;

public class LinkedList {

    Node head;
    static Scanner scan = new Scanner(System.in);

    // Linked List node
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Method to insert element at last
    void add(int data) {
        Node toAdd = new Node(data);

        if(isEmpty()) {
            head = toAdd;
            return;
        }

        // temporary variable for iteration. temp will point to the last node
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;      // pointing next data to the last node
    }

    // method to insert data at first
    void insertAtFirst(int data) {
        Node toFirst = new Node(data);
        if(isEmpty()) {
            head = toFirst;
            return;
        }

        toFirst.next = head;
        head = toFirst;
    }

    void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // check whether linked list is empty or not
    boolean isEmpty() {
        return head == null;
    }


    public static void main(String[] args) {
        int choice;
        LinkedList obj = new LinkedList();

        while(true) {
            System.out.print("\n1. Add\n2. Insert at First\n3. Print\nEnter Choice: ");
            choice = scan.nextInt();

            switch(choice) {
                case 1 -> {
                    System.out.print("Enter number: ");
                    int num = scan.nextInt();
                    obj.add(num);
                }
                case 2 -> {
                    System.out.print("Enter number: ");
                    int num = scan.nextInt();
                    obj.insertAtFirst(num);
                }
                case 3 -> obj.print();
                case 4 -> System.exit(0);
            }
        }
    }
}
