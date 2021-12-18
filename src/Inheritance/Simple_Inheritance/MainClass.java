package Inheritance.Simple_Inheritance;

class ParentClass {
    public void displayP() {
        System.out.println("This is Parent Class");
    }
}

class ChildClass extends ParentClass{
    public void displayC() {
        System.out.println("This is Child Class");
    }
}

public class MainClass {
    public static void main(String[] args) {
        ParentClass p1 = new ChildClass();
        ChildClass c1 = new ChildClass();
        p1.displayP();
        c1.displayC();
        c1.displayP();
    }
}