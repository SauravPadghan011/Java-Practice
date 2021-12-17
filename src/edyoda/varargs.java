package edyoda;

public class varargs {
    static void fun(int ...a) {
        System.out.println("Number of arguments: " + a.length);
        for (int i: a)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
       fun(1000);
       fun(1,2,3,4,5,6);
    }
}
