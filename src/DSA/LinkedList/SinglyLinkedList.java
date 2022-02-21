package DSA.LinkedList;

public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node head = null;

    void InsertAtEnd(int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void Display() {
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.InsertAtEnd(1);
        singlyLinkedList.InsertAtEnd(2);
        singlyLinkedList.InsertAtEnd(3);
        singlyLinkedList.InsertAtEnd(4);


        singlyLinkedList.Display();

    }
}
