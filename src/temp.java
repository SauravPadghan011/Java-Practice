//import java.util.Scanner;
//
//public class temp {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.print("Enter the base you would like to convert the number to : ");
//        int b=sc.nextInt();
//        int q=n,r;
//        String ans="";
//        while(q!=0)
//        {
//            r=q%b;
//            ans=r+ans;
//            q=q/b;
//        }
//        System.out.println(ans);
//    }
//}


import java.util.*;

public class temp {
    public static void main(String[] args) {
        List<String> fruitsName = new ArrayList<>();
        fruitsName.add("Apple");
        fruitsName.add("Banana");
        fruitsName.add("Apple");
        fruitsName.add("Mango");

        int[] array = new int[fruitsName.size()];

        for(int i=0; i< fruitsName.size(); i++) {
            int count = 0;
            String fruit = fruitsName.get(i);
            for(int j=i+1; j< fruitsName.size(); j++) {
                if(Objects.equals(fruit, fruitsName.get(j))) {
                    count++;
                }
            }
            array[i] = count;
        }

//        for(int i: array) {
//            System.out.println(i+" ");
//        }


        for(int i=0; i< fruitsName.size(); i++) {
            System.out.print(Collections.frequency(fruitsName, i)+" ");
        }





    }
}


