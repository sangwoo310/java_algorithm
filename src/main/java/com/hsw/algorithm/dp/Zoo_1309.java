package com.hsw.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Zoo_1309 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    /**
     *
     * N[1] = 3, N[2] = 7, N[3] = 17, N[4] = 41
     * dp 를 이차배열로 하여 0 일때는 없을떄 1은 왼쪽 2는 오른쪽에 배치를 선택
     * dp[1][0] = 1
     * dp[1][1] = 1
     * dp[1][2] = 1
     * dp[2][0] = 3
     * dp[2][1] = 2
     * dp[2][2] = 2
     * dp[3][0] = 7
     * dp[3][1] = 5
     * dp[3][2] = 5
     *
     * dp[N][0] = dp[N-1][0] + dp[N-1][1] + dp[N-1][2]
     * dp[N][1] = dp[N-1][0] + dp[N-1][2]
     * dp[N][2] = dp[N-1][0] + dp[N-1][1]
     *
     */

    int[][] dp = new int[N + 1][3];
    Arrays.fill(dp[1], 1);

    for (int i = 2; i < N + 1; i++) {
      dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
      dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
      dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
    }

    int result = 0;
    for (int i = 0; i < 3; i++) {
      result += dp[N][i];
    }

    System.out.println(result % 9901);
  }
}
