package com.hsw.algorithm.baekjoon.basicAlgorithm1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 기존방식의 순회로 소수를 구하는 방식은 시간문제가 발생
 * 지금 문제처럼 대량의 소수를 한꺼번에 판별할때는 '에라토스테네스의 체' 를 사용해야한다
 *
 * 원리는 단순하게 소수가 되는 수의 배수를 지우면 남는 수가 소수이다!
 * 1. 순서대로 숫자를 판별
 * 2. 최초 2를 소수로 판별 및 2의 배수는 모두 소수가 아니다
 * 3. 3을 소수로 판별 2의 배수와 곂치지 않는 9, 12, ... 또한 소수가 아니다
 * 4. 위 방식을 지속하면 대량의 소수를 판별가능!
 */
public class GoldbachConjecture_6588 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> inputArr = new ArrayList<>();

    while (true) {
      int N = Integer.parseInt(br.readLine());
      if (N == 0) {
        break;
      }
      inputArr.add(N);
    }

    List<Integer> primeNum = new ArrayList<>();

    int[] numTable = new int[1000000];
    for (int i=0; i<numTable.length; i++) {
      numTable[i] = i+1;
    }

    for (int v: numTable) {
      if (v == 0) {
        continue;
      }

      if (isPrimeNum(v)) {
        primeNum.add(v);

        for (int k=2; v*k<=1000000; k++) {
          numTable[v*k-1] = 0;
        }
      }
    }

    for (int v: inputArr) {
      boolean checkFlag = true;

      for (int prime : primeNum) {
        if (numTable[v - prime - 1] != 0) {
          checkFlag = false;
          System.out.println(v + " = " + prime + " + " + (v - prime));
          break;
        }
      }

      if(checkFlag) {
        System.out.println("Goldbach's conjecture is wrong.");
      }
    }
  }

  private static boolean isPrimeNum(int a) {
    if (a == 1) {
      return false;
    }

    for (int i=2; i<=Math.sqrt(a); i++) {
      if (a % i == 0) {
        return false;
      }
    }

    return true;
  }
}
