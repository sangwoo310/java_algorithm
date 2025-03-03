package com.hsw.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin2_2294 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] info = br.readLine().split(" ");

    int N = Integer.parseInt(info[0]);
    int K = Integer.parseInt(info[1]);

    int[] coin = new int[N];
    for (int i = 0; i < N; i++) {
      coin[i] = Integer.parseInt(br.readLine());
    }

    /**
     *  ** 15 **
     *     1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20
     *  1  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20
     *  5  1  2  3  4  1  2  3  4  5  2  3  4  5  6  3  4  5  6  7  4
     *  12 1  2  3  4  1  2  3  4  5  2  3  1  2  3  3  4  2  3  4  4
     *
     *  dp[i] = min ( dp[i], dp[i - coin] + 1 )
     */
    int[] dp = new int[K + 1];
    dp[0] = 0;
    for (int i = 1; i <= K; i++) {
      dp[i] = Integer.MAX_VALUE - 1;
    }

    for (int i = 0; i < N; i++) {
      for (int j = coin[i]; j <= K; j++) {
        dp[j] = Math.min(dp[j], (dp[j - coin[i]] + 1));
      }
    }

    if (dp[K] == Integer.MAX_VALUE - 1) {
      System.out.println(-1);
    } else {
      System.out.println(dp[K]);
    }
  }
}
