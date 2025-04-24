package com.hsw.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoo_1309 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    /**
     *
     * dp[0] = 1, dp[1] = 1 + 2 = 3, dp[2] = 1 + 4 + 2 = 7, dp[3] = 1 + 6 + 12 + 2 = 21, dp[4] = 1 + 8 + 18 + 10 + 2 = 41
     * 12 + 2 +
     *
     *
     */
    int[][] dp = new int[3][N+1];

    for (int i=2; i<=N; i++) {
      dp[0][i] = (dp[0][i-1] + dp[1][i-1] + dp[2][i-1]) % 9901;
      dp[1][i] = (dp[2][i-1] + dp[0][i-1]) % 9901;
      dp[2][i] = (dp[1][i-1] + dp[0][i-1]) % 9901;
    }
    int sum = 0;
    for(int i =0; i<3; i++){
      sum+=dp[i][N];
    }
    System.out.println(sum%9901);
  }
}
