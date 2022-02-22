package TCS_Digital;

import java.util.ArrayList;

public class PickFromBothSides {
    public static int solve(ArrayList<Integer> A, int B) {
        int i = 0;
        int j = A.size()-1;

        int max = 0;
        int sum = 0;
        while(B>0) {
            if(A.get(i) > A.get(j)) {
                sum += A.get(i);
                i++;
            } else {
                sum += A.get(j);
                j--;
            }
            B--;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        int[] arr = new int[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};

        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println(solve(list, 48));

    }
}
