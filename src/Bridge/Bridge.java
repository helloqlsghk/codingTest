package Bridge;

import java.util.Scanner;

public class Bridge {
    static int[][] dp = new int[30][30];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 조합 미리 계산
        for (int i = 0; i < 30; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        System.out.print("N 입력:");
            int N = sc.nextInt();
        System.out.print("M 입력:");
            int M = sc.nextInt();
            System.out.println(dp[M][N]);


        sc.close();


    }

}



