/*
* Linked List with adding element to a particular position
* */

package DSA;
import java.util.Scanner;

public class LinkedList2 {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;
    public Scanner scan = new Scanner(System.in);

    public void add(int data) {
        Node toAdd = new Node(data);

        if(isEmpty()) {
            head = toAdd;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = toAdd;
        }
    }

    public void addToFirst(int data) {
        Node toFirst = new Node(data);

        if(isEmpty()) {
            head = toFirst;
        } else {
            toFirst.next = head;
            head = toFirst;
        }
    }

    public void addAtPosition(int data, int pos) {
        Node toPos = new Node(data);
        if(pos == 1) {
            toPos.next = head;
            head = toPos;
        }
        else {
            Node temp = head;
            int count = 1;
            while(count < pos-1) {
                temp = temp.next;
                count++;
            }
            toPos.next = temp.next;
            temp.next = toPos;
        }

    }

    public void print() {
        if(isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        int choice;
        LinkedList2 obj = new LinkedList2();

        while(true) {
            System.out.print("\n1. Add\n2. Add at First\n3. Add at Position\n4. Print\nEnter Choice: ");
            choice = obj.scan.nextInt();

            switch(choice) {
                case 1 -> {
                    System.out.print("Enter number: ");
                    int num = obj.scan.nextInt();
                    obj.add(num);
                }
                case 2 -> {
                    System.out.print("Enter number: ");
                    int num = obj.scan.nextInt();
                    obj.addToFirst(num);
                }
                case 3-> {
                    System.out.print("Enter number: ");
                    int num = obj.scan.nextInt();
                    System.out.print("Enter Position: ");
                    int pos = obj.scan.nextInt();
                    obj.addAtPosition(num, pos);
                }
                case 4 -> obj.print();
                case 5 -> System.exit(0);
            }
        }
    }
}
