package com.hsw.algorithm.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * dfs 를 활용해야함 -> dfs 공부 하고 다시 풀기
 */
public class DownHill_1520 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();

    int[][] board = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        board[i][j] = sc.nextInt();
      }
    }

    /**
     *
     * dp[0][0] = 1
     * dp[0][1] = 1
     * dp[0][2] = 1
     * dp[0][3] = 1
     * dp[0][4] = 1
     * dp[1][0] = 1
     * dp[1][1] = 0
     * dp[1][2] = 0
     * dp[1][3] = 2
     * dp[1][4] = 1
     *
     */
    int[][] dp = new int[row][col];
    dp[0][0] = 1;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (i == 0 && j == 0) {
          continue;
        }
        int path = 0;

        if (i - 1 >= 0) {
          if ((board[i - 1][j] > board[i][j]) && (dp[i - 1][j] != 0)) path += dp[i - 1][j];
        }
        if (i + 1 < row) {
          if ((board[i + 1][j] > board[i][j]) && (dp[i + 1][j] != 0)) path += dp[i + 1][j];
        }
        if (j - 1 >= 0) {

          if ((board[i][j - 1] > board[i][j]) && (dp[i][j - 1] != 0)) path += dp[i][j - 1];
        }
        if (j + 1 < col) {
          if ((board[i][j + 1] > board[i][j]) && (dp[i][j + 1] != 0)) path += dp[i][j + 1];
        }

        dp[i][j] = path;
      }
    }
    System.out.println(Arrays.deepToString(dp));
    System.out.println(dp[0][2]);
    System.out.println(dp[3][3]);

    System.out.println(dp[row - 1][col - 1]);
  }
}
