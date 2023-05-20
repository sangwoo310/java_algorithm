package com.hsw.algorithm.baekjoon.basicAlgorithm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseWord_9093 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      while (st.hasMoreTokens()) {
        StringBuilder sb = new StringBuilder(st.nextToken());
        answer.append(sb.reverse() + " ");
      }
      answer.append("\n");
    }
    System.out.print(answer);
  }
}
