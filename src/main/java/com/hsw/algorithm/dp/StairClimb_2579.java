package com.hsw.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StairClimb_2579 {
  static int[] stairPoint;
  static int[][] score;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    stairPoint = new int[N+1];
    score = new int[N+1][2];

    for (int i=1; i<=N; i++) {
      stairPoint[i] = Integer.parseInt(br.readLine());
    }

    score[1][0] = stairPoint[1];
    score[1][1] = 0;

    if (N>=2) {
      score[2][0] = stairPoint[1] + stairPoint[2];
      score[2][1] = stairPoint[2];
    }

    if (N>=3) {
      stepUp();
    }

    System.out.println(Math.max(score[N][0], score[N][1]));

  }

  public static void stepUp() {
    for (int i=3; i<stairPoint.length; i++) {
      score[i][0] = Math.max(score[i-1][1], Math.max(score[i-2][0], score[i-2][1])) + stairPoint[i];
      score[i][1] = Math.max(score[i-2][0], score[i-2][1]) + stairPoint[i];
    }
  }
}
