package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AlphabetSearch_10809 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int[] alphabetArr = new int[26];
    Arrays.fill(alphabetArr, -1);

    for (int i=0; i<str.length(); i++) {
      int alphabet = str.charAt(i);

      if(alphabetArr[alphabet - 97] == -1) {
        alphabetArr[alphabet - 97] = i;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int a: alphabetArr) {
      sb.append(a).append(" ");
    }

    System.out.println(sb);
  }
}
