package com.hsw.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PadovanSequence_9461 {
  static Long[] p;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    for (int i=0; i<N; i++) {
      int n = Integer.parseInt(br.readLine());

      p = new Long[Math.max(n+1, 4)];
      Long result = padovan(n);

      System.out.println(result);
    }
  }

  // P(N) = P(N-2) + P(N-3)
  public static Long padovan(int n) {
    p[1] = 1L;
    p[2] = 1L;
    p[3] = 1L;

    for (int i=4; i<=n; i++) {
      p[i] = p[i-2] + p[i-3];
    }

    return p[n];
  }
}
