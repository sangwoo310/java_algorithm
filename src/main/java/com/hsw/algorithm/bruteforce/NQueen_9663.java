package com.hsw.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NQueen_9663 {
  static int N;
  static int[][] chessBoard;
  static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    chessBoard = new int[N][N];
    for (int[] row : chessBoard) {
      Arrays.fill(row, 0);
    }

    nQueen(0);

    System.out.println(count);
  }

  public static void nQueen(int depth) {
    if (depth == N) {
      count++;
    }

    for (int i = 0; i < N; i++) {
      if (isPromising(depth, i)) {
        chessBoard[depth][i] = 1;
        nQueen(depth + 1);
        chessBoard[depth][i] = 0;
      }
    }
  }

  public static boolean isPromising(int row, int col) {
    // 같은 열 체크
    for (int i = 0; i < row; i++) {
      if (chessBoard[i][col] == 1) {
        return false;
      }
    }

    // 대각선 왼쪽 상단 체크
    int i = row;
    int k = col;
    while (i >= 0 && k >= 0) {
      if (chessBoard[i][k] == 1) {
        return false;
      }
      i--;
      k--;
    }

    // 대각선 우측 상단 체크
    i = row;
    k = col;
    while (i >= 0 && k < N) {
      if (chessBoard[i][k] == 1) {
        return false;
      }
      i--;
      k++;
    }

    return true;
  }
}
