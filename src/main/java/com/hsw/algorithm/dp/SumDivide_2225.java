package com.hsw.algorithm.dp;

import java.io.IOException;
import java.util.Scanner;

public class SumDivide_2225 {
  public static void main(String[] args) throws IOException {
    int MOD = 1000000000;

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    /**
     * DP[K][N] = DP[K][N-1] + DP[K-1][N]
     */

    int[][] dp = new int[N + 1][K + 1];
    for (int i = 0; i <= N; i++) {
      dp[i][0] = 0;
      dp[i][1] = 1;
    }

    for (int i = 0; i <= K; i++) {
      dp[1][i] = i;
    }

    for (int i = 2; i <= N; i++) {
      for (int j = 2; j <= K; j++) {
        dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
      }
    }

    System.out.println(dp[N][K]);
  }
}