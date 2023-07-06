package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class PostfixNotation_1935 {
  /**
   * 후위표현식은 Stack 을 통해 일반 숫자일경우 Push 연산자일경우 Pop 을 사용하여 계산
   * 여기서는 char 타입의 값을 처리하는 방법에 대해 잘 써야한다
   */
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Stack<Double> stack = new Stack<>();
    char[] operand = br.readLine().toCharArray();

    HashMap<Character, Double> hashMap = new HashMap<>();
    for(int i=0; i<N; i++) {
      hashMap.put((char)(65+i), Double.valueOf(br.readLine()));
    }

    for (char c : operand) {
      if ('A' <= c && c <= 'Z') {
        stack.push(hashMap.get(c));
      } else {
        double d1 = stack.pop();
        double d2 = stack.pop();
        double d3 = 0.0;
        switch (c) {
          case '+':
            d3 = d2 + d1;
            break;
          case '-':
            d3 = d2 - d1;
            break;
          case '*':
            d3 = d2 * d1;
            break;
          case '/':
            d3 = d2 / d1;
            break;
        }
        stack.push(d3);
      }
    }

    System.out.printf("%.2f", stack.pop());
  }
}

