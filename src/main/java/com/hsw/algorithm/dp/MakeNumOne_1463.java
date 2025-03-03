package com.hsw.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeNumOne_1463 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] num = new int[N + 1];
    num[1] = 0;

    for (int i = 2; i <= N; i++) {
      num[i] = num[i - 1] + 1;

      if (i % 3 == 0) {
        num[i] = Math.min(num[i], num[i / 3] + 1);
      }

      if (i % 2 == 0) {
        num[i] = Math.min(num[i], num[i / 2] + 1);
      }
    }

    System.out.println(num[N]);
  }
}
