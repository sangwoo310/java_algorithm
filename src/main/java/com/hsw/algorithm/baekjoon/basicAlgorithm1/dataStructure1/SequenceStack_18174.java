package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SequenceStack_18174 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    Stack<Integer> stack = new Stack<Integer>();
    StringBuilder sb = new StringBuilder();

    int startNum = 0;
    while (n-- > 0) {
      int num = Integer.parseInt(br.readLine());

      if(num > startNum) {
        for(int i=startNum+1; i<=num; i++) {
          sb.append("+").append("\n");
          stack.push(i);
        }
        startNum = num;
      } else if(stack.peek() != num) {
        System.out.println("NO");
        return;
      }

      stack.pop();
      sb.append("-").append("\n");
    }

    System.out.println(sb);
  }
}
