package com.hsw.algorithm.baekjoon.basicAlgorithm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Editor_1406 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder base = new StringBuilder(br.readLine());
    int n = Integer.parseInt(br.readLine());

    int cursor = base.length();

    while (n-- > 0) {
      StringTokenizer command = new StringTokenizer(br.readLine());
      String cmd = command.nextToken();

      if (cmd.equals("L")) {
        if(cursor != 0) {
          cursor--;
        }
      } else if(cmd.equals("D")) {
        if (cursor != base.length()) {
          cursor++;
        }
      } else if(cmd.equals("B")) {
        if (cursor != 0) {
          base.deleteCharAt(cursor-1);
          cursor--;
        }
      } else if(cmd.equals("P")) {
        String add = command.nextToken();
        base.insert(cursor, add);
        cursor++;
      }
    }

    System.out.println(base);
  }
}
