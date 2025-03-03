package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCount_10808 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int[] alphabetArr = new int[26];

    for (int i = 0; i < str.length(); i++) {
      int alphabet = str.charAt(i);
      alphabetArr[alphabet - 97] += 1;
    }

    StringBuilder sb = new StringBuilder();
    for (int i : alphabetArr) {
      sb.append(i).append(" ");
    }
    System.out.print(sb);
  }
}
