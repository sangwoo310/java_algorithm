package com.hsw.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Down_2096 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[][] borad = new int[N][3];

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 3; j++) {
        borad[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int[] maxDp = new int[3];
    int[] minDp = new int[3];

    for (int i = 0; i < 3; i++) {
      maxDp[i] = borad[0][i];
      minDp[i] = borad[0][i];
    }

    for (int i = 1; i < N; i++) {
      maxDp[0] += Math.max(borad[i][0], borad[i][1]);
      maxDp[1] += Arrays.stream(borad[i]).max().getAsInt();
      maxDp[2] += Math.max(borad[i][1], borad[i][2]);

      minDp[0] += Math.min(borad[i][0], borad[i][1]);
      minDp[1] += Arrays.stream(borad[i]).min().getAsInt();
      minDp[2] += Math.min(borad[i][1], borad[i][2]);
    }

    System.out.println(Arrays.stream(maxDp).max().getAsInt() + " " + Arrays.stream(minDp).min().getAsInt());
  }
}
