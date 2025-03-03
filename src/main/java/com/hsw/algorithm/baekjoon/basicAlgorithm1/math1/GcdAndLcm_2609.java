package com.hsw.algorithm.baekjoon.basicAlgorithm1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 유클리드 호제법 (Euclidean algorithm)
 * <p>
 * 어떤 두 수의 최대공약수 GCD 는 r = a mod b 의 (b,r) 의 최대 공약수와 같다
 * => GCD(a, b) = GCD(b, r)
 * 최소공배수는 (a * b)/GCD(a, b) 이다
 */
public class GcdAndLcm_2609 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    int value = gcd(A, B);

    System.out.println(value);
    System.out.println((A * B) / value);
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
