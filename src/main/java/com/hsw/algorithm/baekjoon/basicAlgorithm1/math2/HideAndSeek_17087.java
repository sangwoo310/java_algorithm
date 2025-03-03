package com.hsw.algorithm.baekjoon.basicAlgorithm1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/***
 * GCD 유클리드 호제법을 활용한 문제
 * 문제 의미 자체를 해석하는데 집중해야한다! X+D 의미는 D 의 크기는 하나이기때문에 여러 값들의 1*D, 2*D, 3*D 가 되기 때문에 최대공약수이다!
 * 각 지접에 대한 gcd 가 아니라 나의 지점과 다른 사람의 지점간의 거리에 대한 gcd 여야한다!
 *
 * gcd 초기값은 0이면 안된다! => 최대공약수가 이상해진다
 */
public class HideAndSeek_17087 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    long S = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());

    long[] arr = new long[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Math.abs(S - Long.parseLong(st.nextToken()));
    }

    long gcdVal = arr[0];
    for (long v : arr) {
      gcdVal = gcd(gcdVal, v);
    }

    System.out.println(gcdVal);
  }

  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }

    return gcd(b, a % b);
  }
}
