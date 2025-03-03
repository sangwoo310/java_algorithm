package com.hsw.algorithm.dp;

import java.io.IOException;
import java.util.Scanner;

public class Stickers_9465 {
  static int[][] stickers;
  static int[][] point;

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < N; i++) {
      int size = sc.nextInt();
      stickers = new int[2][size + 1];
      point = new int[2][size + 1];

      for (int j = 0; j < 2; j++) {
        for (int k = 1; k <= size; k++) {
          stickers[j][k] = sc.nextInt();
        }
      }

      if (size == 1) {
        point[0][1] = stickers[0][1];
        point[1][1] = stickers[1][1];
        System.out.println(Math.max(point[0][1], point[1][1]));
        continue;
      }

      point[0][1] = stickers[0][1];
      point[1][1] = stickers[1][1];
      point[0][2] = point[1][1] + stickers[0][2];
      point[1][2] = point[0][1] + stickers[1][2];

      if (size >= 3) {
        for (int t = 3; t <= size; t++) {
          point[0][t] = Math.max(point[1][t - 1], Math.max(point[0][t - 2], point[1][t - 2])) + stickers[0][t];
          point[1][t] = Math.max(point[0][t - 1], Math.max(point[0][t - 2], point[1][t - 2])) + stickers[1][t];
        }
      }

      System.out.println(Math.max(point[0][size], point[1][size]));
    }
  }
}
