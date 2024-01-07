package com.hsw.algorithm.baekjoon.basicAlgorithm1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GcdSum_9613 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    for (int i=0; i<t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      long sum = 0;

      int[] candidateArr = new int[n];
      for (int k=0; k<n; k++) {
        candidateArr[k] = Integer.parseInt(st.nextToken());
      }

      for (int k=0; k<n; k++) {
        for (int j=k+1; j<n; j++) {
          sum += gcd(candidateArr[k], candidateArr[j]);
        }
      }

      System.out.println(sum);
    }
  }

  public static int gcd(int a, int b) {
    if(b == 0) {
      return a;
    }

    return gcd(b, a%b);
  }
}
