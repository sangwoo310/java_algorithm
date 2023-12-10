package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure3;

import java.util.Scanner;

public class Rot13_11655 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();

    char[] ch = str.toCharArray();

    for (char c : ch) {
      if (c >= 'A' && c <= 'Z') {
        c += 13;
        if (c > 'Z') {
          c -= 26;
        }
      } else if (c >= 'a' && c <= 'z') {
        c += 13;
        if (c > 'z') {
          c -= 26;
        }
      }
      System.out.print(c);
    }
  }
}
