package com.hsw.algorithm.baekjoon.basicAlgorithm1.math2;

import java.io.*;

public class GoldbachPartition_17103 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    boolean[] primeNumArr = new boolean[1000000];
    for (int i = 0; i < primeNumArr.length; i++) {
      if (isPrime(i + 1)) {
        primeNumArr[i] = true;
      }
    }

    for (int i = 0; i < T; i++) {
      int value = Integer.parseInt(br.readLine());
      int count = 0;

      for (int k = 1; k <= value / 2; k++) {
        if (primeNumArr[k - 1] && primeNumArr[value - k - 1]) {
          count++;
        }
      }
      bw.write(count + "\n");
    }

    bw.flush();
  }

  private static boolean isPrime(int number) {
    if (number == 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }
}
