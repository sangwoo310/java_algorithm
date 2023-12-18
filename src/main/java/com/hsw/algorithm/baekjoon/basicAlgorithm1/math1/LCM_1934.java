package com.hsw.algorithm.baekjoon.basicAlgorithm1.math1;

import java.io.*;
import java.util.StringTokenizer;

public class LCM_1934 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    for(int i=0; i<N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      int bcd = bcd(a, b);

      bw.write((a * b)/bcd + "\n");
    }

    bw.flush();
  }

  public static int bcd(int a, int b) {
    if(b == 0) {
      return a;
    }

    return bcd(b, a%b);
  }
}
