package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis_9012 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    Stack<String> stack = new Stack<>();

    Boolean flag = true;

    for(int i=0; i<n; i++) {
      stack.clear();

      String str = br.readLine();

      for(int k=0; k<str.length(); k++) {
        Character charAt = str.charAt(k);

        if(charAt == '(') {
          stack.push("(");
        } else if (charAt == ')') {
          if(stack.empty()) {
            flag = false;
            break;
          } else {
            flag = true;
            stack.pop();
          }
        }
      }

      if (stack.empty() && flag) {
        sb.append("YES").append("\n");
      } else {
        sb.append("NO").append("\n");
      }
    }

    System.out.println(sb);
  }
}
