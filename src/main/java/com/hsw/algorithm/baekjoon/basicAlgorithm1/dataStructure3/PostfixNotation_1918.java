package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure3;

import java.io.*;
import java.util.Stack;

/**
 * 후위 표현식으로 바꾸는것은 차량기지 알고리즘의 대표적인 문제(https://ko.wikipedia.org/wiki/%EC%B0%A8%EB%9F%89%EA%B8%B0%EC%A7%80_%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98)
 * 기호는 스택에 넣고 숫자는 그냥 바로 글자로 출력이 기본 개념
 * <p>
 * 1. 기호의 우선순위를 두어야한다 '(' 는 가장 낮은 순위 '+','-' 그 다음순위 '*','/' 의 순위로 결정
 * 2. 글자가 나오면 출력
 * 3. ')'를 제외한 기호가 나오면 스택에 저장, ')' 는 닫는 기호이기때문에 '(' 가 나올때까지 스택의 값을 빼서 출력하고 '(' 기호는 스택에서 빼기만하여 제거
 * 4. 사칙연산이 나오면 우선순위에 비교를 진행
 * - 현재의 글자가 스택의 맨 마지막의 글자와의 우선순위보다 높다면 현재 글자를 출력하고 스택에서 나머지를 빼서 출력
 * - 사칙연산에 의해 곱셈 나눗셈이 후위 연산자에서 앞으로 가야하기때문 '(' 는 시작기호이기때문에 무시하기 위하여 우선순위가 가장 낮다
 * 5. 위 과정이 끝나면 마지막에 스택에 남은 값을 출력
 */

public class PostfixNotation_1918 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char now = str.charAt(i);

      switch (now) {
        case '+':
        case '-':
        case '*':
        case '/':
          while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
            bw.append(stack.pop());
          }
          stack.push(now);
          break;
        case '(':
          stack.push(now);
          break;
        case ')':
          while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
              stack.pop();
              break;
            }
            bw.append(stack.pop());
          }
          break;
        default:
          bw.append(now);
      }
    }

    while (!stack.isEmpty()) {
      bw.append(stack.pop());
    }

    bw.flush();
  }

  static private int priority(char value) {
    if (value == '(') return 0;
    else if (value == '+' || value == '-') return 1;
    else return 2;
  }
}
