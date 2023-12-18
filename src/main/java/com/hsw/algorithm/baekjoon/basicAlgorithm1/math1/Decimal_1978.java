package com.hsw.algorithm.baekjoon.basicAlgorithm1.math1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 아래 방식 말고 제곱근을 활용한 방식으로 풀자!
 * 아래 방식은 시간복잡도가 O(N) 이지만
 * 제곱근을 활용하게되면 O(√N) 이 된다!
 *
 * 제곱근보다 높은수는 결국 약수이다 -> 반복문을 자신의 값만큼 돌리는게 아니라 제곱근까지 돌린다
 * for(int i=2; i<a; i++) -> for(int i=2; i<Math.sqrt(a); i++) 로 돌리면 된다!
 */
public class Decimal_1978 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();

    StringTokenizer st = new StringTokenizer(br.readLine());

    int count = 0;

    while (st.hasMoreTokens()) {
      if(isDecimal(Integer.parseInt(st.nextToken()))) {
        count++;
      }
    }

    System.out.println(count);
  }

  public static boolean isDecimal(int a) {
    if(a == 1) {
      return false;
    }

    for(int i=2; i<a; i++) {
      if(a % i == 0) {
        return false;
      }
    }

    return true;
  }
}
