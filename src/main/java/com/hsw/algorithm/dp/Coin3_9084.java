package com.hsw.algorithm.dp;

import java.io.IOException;
import java.util.Scanner;

public class Coin3_9084 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int testCase = 0; testCase < T; testCase++) {
      int N = sc.nextInt();
      int[] coin = new int[N];
      for (int i = 0; i < N; i++) {
        coin[i] = sc.nextInt();
      }
      int M = sc.nextInt();

      /**
       *
       *     1  2  3  4  5  6  7  8  9  10 11 12 13
       *  1  1  1  1  1  1  1  1  1  1  1  1  1  1
       *  5  1  1  1  1  2  2  2  2  2  3  3  3  3
       *  10 1  1  1  1  1  1  1  1  1  2  2  2  2
       *
       */

      int[] dp = new int[M + 1];
      dp[0] = 1;

      for (int i = 0; i < coin.length; i++) {
        for (int k = coin[i]; k <= M; k++) {
          dp[k] = dp[k] + dp[k - coin[i]];
        }
      }

      System.out.println(dp[M]);
    }
  }
}
