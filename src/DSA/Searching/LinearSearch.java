/*
* Linear Searching using Linked list
* */

package DSA.Searching;
import java.util.Scanner;

public class LinearSearch {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public Scanner scan = new Scanner(System.in);
    Node head;

    public void add(int data) {
        Node node = new Node(data);

        if(head == null) head = node;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void linearSearchFunction(int searchKey) {
        Node temp = head;
        int location = 1;
        while(temp != null) {
            if(temp.data == searchKey) {
                System.out.println(searchKey + " Found at " + location + "th location");
                return;
            }
            temp = temp.next;
            location++;
        }
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int choice;
        LinearSearch obj = new LinearSearch();

        while(true) {
            System.out.print("\n1. Add\n2. Print\n3. Search Number\nEnter Choice: ");
            choice = obj.scan.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter number: ");
                    int num = obj.scan.nextInt();
                    obj.add(num);
                }
                case 2 -> obj.print();
                case 3 -> {
                    System.out.print("Enter Number to Search: ");
                    obj.linearSearchFunction(obj.scan.nextInt());
                }
                case 4 -> System.exit(0);
            }
        }
    }
}
