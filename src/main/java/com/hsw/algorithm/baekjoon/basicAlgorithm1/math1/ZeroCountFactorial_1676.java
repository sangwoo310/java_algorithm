package com.hsw.algorithm.baekjoon.basicAlgorithm1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Stack;

/***
 * 이 문제는 팩토리얼을 구하는게 중요한게 아니다
 * 소인수분해를 생각하여 문제를 풀면 bigInt 와 복잡한 코드 없이 풀 수 있다
 * 소인수를 활용한 풀이
 * n! 은 결국 곱의 연산 -> 0의 개수는 10이 몇번 곱해졌는지 세면 되는문제
 * 10의 곱은 2, 5의 곱으로 이루어 져있다 = 5*2 의 쌍이 몇개인지 확인하면 된다
 * 이때 2는 5보다 작은 수이므로 자연스럽게 5보다 많은 소인수를 가질수 밖에 없다 = 5의 갯수만 구하면 된다
 * ex) 10!
 *   10  *   9   *   8   * 7 *   6   * 5 *   4   * 3 * 2 * 1
 * (5*2) * (3^2) * (2^3) * 7 * (2*3) * 5 * (2^2) * 3 * 2 * 1
 * 5의 개수는 2개이고 뒤에 0의 자리가연속해서 나오는 개수는 2
 */
public class ZeroCountFactorial_1676 {
  /**
   * 소인수를 활용한 문제 풀이
   **/
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int count = 0;
    for (int i = 1; i <= N; i++) {
      int num = i;

      while (num % 5 == 0) {
        count++;
        num /= 5;
      }
    }

    System.out.println(count);
  }

  /**
   * BigInteger 를 활용한 문제 풀이
   **/
  public static void userBigInteger() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    BigInteger value = BigInteger.valueOf(1L);
    while (N > 0) {
      value = value.multiply(BigInteger.valueOf(N));
      N--;
    }

    Stack<Character> stack = new Stack<>();
    String strValue = String.valueOf(value);
    for (int i = 0; i < strValue.length(); i++) {
      stack.push(strValue.charAt(i));
    }

    int count = 0;
    while (!stack.isEmpty()) {
      if (Character.getNumericValue(stack.pop()) != 0) {
        break;
      }
      count++;
    }

    System.out.println(count);
  }
}
