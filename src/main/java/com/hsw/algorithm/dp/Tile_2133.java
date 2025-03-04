package com.hsw.algorithm.dp;

import java.io.IOException;
import java.util.Scanner;

public class Tile_2133 {
  public static void main(String[] args) throws IOException {
    /**
     *
     *   1  2  3  4  5  6  7  8  9  10
     *   0  3  0  11 0  41 0 153 0
     *
     */
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    if (N % 2 == 1) {
      System.out.println(0);
      return;
    }

    int[] tile = new int[N + 1];

    /**
     *
     * 점화식을 잘 찾아보자 (https://january-diary.tistory.com/entry/BOJ-2133-%ED%83%80%EC%9D%BC-%EC%B1%84%EC%9A%B0%EA%B8%B0-JAVA)
     *
     * dp[4] = dp[2] * dp[2] + 2 = dp[2] * 3 + 2 = 11
     * dp[6] = dp[4] * dp[2] + dp[2] * 2 +2 = dp[4] * 3 + dp[2] * 2 +2
     * dp[8] = dp[6] * 3 + (dp[6] * 2 + dp[4] * 2) + 2
     *
     * 타일이 6일때 6을 보지말고 4, 2 로 구분지어서 생각하면서 점화식을 추가
     *
     */
    tile[2] = 3;
    for (int i = 4; i <= N; i += 2) {
      tile[i] = tile[i - 2] * 3 + 2;
      for (int j = i - 2; j >= 4; j -= 2) {
        tile[i] += tile[i - j] * 2;
      }
    }

    System.out.println(tile[N]);
  }
}
