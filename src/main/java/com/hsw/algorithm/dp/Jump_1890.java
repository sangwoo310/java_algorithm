package com.hsw.algorithm.dp;

import java.io.IOException;
import java.util.Scanner;

public class Jump_1890 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] board = new int[N][N];

    for (int i=0; i<N; i++) {
      for (int j=0; j<N; j++) {
        board[i][j] = sc.nextInt();
      }
    }

    long[][] dp = new long[N][N];
    dp[0][0] = 1;

    for (int i=0; i<N; i++) {
      for (int j=0; j<N; j++) {
        int jump = board[i][j];

        if (jump == 0) break;
        if (i+jump < N) dp[jump+i][j] += dp[i][j];
        if (j+jump < N) dp[i][jump+j] += dp[i][j];
      }
    }

    System.out.println(dp[N-1][N-1]);
  }
}
