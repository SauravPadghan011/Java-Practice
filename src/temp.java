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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(2);
        System.out.println(list);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<list.size(); i++) {
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
        }

        System.out.println(map);
    }
}


