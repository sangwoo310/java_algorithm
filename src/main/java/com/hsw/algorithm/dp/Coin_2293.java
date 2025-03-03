package com.hsw.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin_2293 {

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
     *      1   2   3   4   5   6   7   8   9   10
     * 1    1   1   1   1   1   1   1   1   1   1
     * 2    0   1   1   2   2   3   3   4   4   5
     * 5    0   0   0   0   1   1   2   2   3   4
     * sum  1   2   2   3   4   5   5   7   8   10
     */

    int[] dp = new int[K + 1];
    dp[0] = 1;

    for (int i = 0; i < N; i++) {
      for (int j = coin[i]; j <= K; j++) {
        System.out.println("i: " + i + ", j: " + j + ", dp[j] : " + dp[j]);
        dp[j] = dp[j] + dp[j - coin[i]];
      }
    }

    System.out.println(dp[K]);
  }
}
