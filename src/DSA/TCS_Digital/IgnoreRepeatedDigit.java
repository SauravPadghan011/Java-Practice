package TCS_Digital;

public class IgnoreRepeatedDigit {

    public static int Equal(int num) {

        Boolean[] visited = new Boolean[]{false, false, false, false, false, false, false, false, false, false};
        while(num > 0) {
            if(visited[num % 10]) {
                return -1;
            }
            visited[num%10] = true;
            num /= 10;
        }
        return 1;
    }

    public static void main(String[] args) {

        int count = 0;
        for(int i=101; i<=200; i++) {

            int equalStatus = Equal(i);

            if(equalStatus != -1)
                count++;

        }
        System.out.println(count);
    }
}
