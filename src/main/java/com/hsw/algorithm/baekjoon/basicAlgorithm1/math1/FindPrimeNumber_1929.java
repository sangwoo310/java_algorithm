package com.hsw.algorithm.baekjoon.basicAlgorithm1.math1;

import java.io.*;
import java.util.StringTokenizer;

public class FindPrimeNumber_1929 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    for (int i = M; i <= N; i++) {
      if (isPrimeNum(i)) {
        bw.write(i + "\n");
      }
    }

    bw.flush();
    bw.close();
  }

  private static boolean isPrimeNum(int a) {
    if (a == 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(a); i++) {
      if (a % i == 0) {
        return false;
      }
    }

    return true;
  }
}
