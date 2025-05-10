package com.hsw.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Fail! try again later
public class Passcode_2011 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();

    int[] dp = new int[N.length() + 1];
    dp[1] = 1;

    /**
     *
     * dp[1] = 1
     * dp[2] = 1 or 2
     * dp[3] =
     *
     * dp[N] = dp[N-1] + if(substring[N.length-1, N.length] <= 26) 1 or 0
     *
     * 123
     */

    for (int i=2; i<N.length()+1; i++) {
      int t = Integer.parseInt(N.substring(N.length() - 2)) <= 26 ? 1 : 0;

      if (i == 2) {
        dp[i] = t+1;
      } else {
        dp[i] = (dp[i-1] + t) % 1000000;
      }
    }

    System.out.println(dp[N.length()]);
  }
}
