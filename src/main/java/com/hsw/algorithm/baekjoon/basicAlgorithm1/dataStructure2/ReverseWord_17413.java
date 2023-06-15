package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure2;

import java.io.*;
import java.util.*;

public class ReverseWord_17413 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String cmd = br.readLine();

    Stack<Character> stack = new Stack<>();

    boolean isTag = false;

    for (int i = 0; i < cmd.length(); i++) {
      char c = cmd.charAt(i);

      if (c == '<') {
        isTag = true;
        while (!stack.isEmpty()) {
          bw.write(stack.pop());
        }
        bw.write(c);
      } else if (c == '>') {
        isTag = false;
        bw.write(c);
      } else if (isTag) {
        bw.write(c);
      } else {
        if (c == ' ') {
          while (!stack.isEmpty()) {
            bw.write(stack.pop());
          }
          bw.write(c);
        } else {
          stack.push(c);
        }
      }
    }
    while (!stack.isEmpty()) {
      bw.write(stack.pop());
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
