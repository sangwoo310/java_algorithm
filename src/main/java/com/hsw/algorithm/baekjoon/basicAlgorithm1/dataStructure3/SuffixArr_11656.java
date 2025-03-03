package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SuffixArr_11656 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    String[] suffixStrArr = new String[str.length()];

    for (int i = 0; i < suffixStrArr.length; i++) {
      suffixStrArr[i] = str.substring(i, suffixStrArr.length);
    }

    Arrays.sort(suffixStrArr);

    for (String v : suffixStrArr) {
      System.out.println(v);
    }
  }
}
