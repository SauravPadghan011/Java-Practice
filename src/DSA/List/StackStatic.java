/*
* Stack using list
* */

package DSA.List;
import java.util.Scanner;

public class StackStatic {
    int top;
    static final int max = 1000;
    int[] stackArray = new int[max];
    static Scanner scan = new Scanner(System.in);

    StackStatic() {
        top = -1;
    }

    boolean isEmpty() {
        return (top<0);
    }

    void push(int num) {
        if(top >= (max-1)) {
            System.out.println("Stack Overflow!!");
        } else {
            stackArray[++top] = num;
            System.out.println(num + " is added into stack");
        }
    }

    int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow!!");
            return 0;
        } else {
            return stackArray[top--];
        }
    }

    int peek() {
        if(isEmpty()) {
            System.out.println("Stack Underflow!!");
            return 0;
        } else {
            return stackArray[top];
        }
    }

    void printStack() {
        for(int i=top; i>-1; i--) {
            System.out.print(" " + stackArray[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackStatic obj = new StackStatic();

        while(true) {
            System.out.print("\n******Stack******\n1. Push\n2. Pop\n3. Peek\n4. Print Stack\n5. Exit\nEnter Choice: ");
            int choice = scan.nextInt();
            int num;

            switch(choice) {
                case 1 -> {
                    System.out.print("Enter element to push: ");
                    num = scan.nextInt();
                    obj.push(num);
                }
                case 2 -> {
                    System.out.print(obj.pop()+" is popped from stack");
                    System.out.println();
                }
                case 3 -> System.out.println("Top Element is: " + obj.peek());
                case 4 -> obj.printStack();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid Choice!!");
            }
        }

    }
}
