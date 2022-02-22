package TCS_Digital;

public class MaxSquareSubMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{0, 1, 1, 0, 1},
//                {1, 1, 0, 1, 0},
//                {0, 1, 1, 1, 0},
//                {1, 1, 1, 1, 0},
//                {1, 1, 1, 1, 1},
//                {0, 0, 0, 0, 0}};

//        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        char[][] matrix = {{'0','1'},{'1','0'}};

        System.out.println("Answer: " + fun(matrix));
    }

    static int fun(char[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int ans = 0;

        System.out.println("Original Matrix: ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] dp = new int[row][col];
        for(int i=row-1; i>=0; i--) {
            for(int j=col-1; j>=0; j--) {
                if(i == row-1 && j == col-1) {
                    dp[i][j] = Character.getNumericValue(matrix[i][j]);
                } else if(i == row-1) {
                    dp[i][j] = Character.getNumericValue(matrix[i][j]);
                } else if(j == col-1) {
                    dp[i][j] = Character.getNumericValue(matrix[i][j]);
                } else {
                    if(matrix[i][j] == '0')
                        dp[i][j] = 0;
                    else {
                        int min = Math.min(dp[i][j+1], dp[i+1][j]);
                        min = Math.min(min, dp[i+1][j+1]);
                        dp[i][j] = min+1;
                    }
//                    if(dp[i][j] > ans)
//                        ans = dp[i][j];
                }
            }
        }

        ans = findMax(dp);

        System.out.println("DP Matrix: ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return ans;
    }

    public static int findMax(int[][] dp) {
        int max = dp[0][0];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        return max;
    }
}