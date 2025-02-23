package com.hsw.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * BackTracking
 * <p>
 * N*N 체스열에 N 개의 퀸이 서로 공격할 수 없도록 배치하는 문제가 대표적
 */
public class BackTracking {
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

    System.out.println("total combinations: " + count);
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
    for (int i = 0; i < row; i++) {
      if (chessBoard[i][col] == 1) {
        return false;
      }
    }

    // 왼쪽 위 대각선 확인
    int i = row;
    int j = col;
    while (i >= 0 && j >= 0) {
      if (chessBoard[i][j] == 1) {
        return false;
      }
      i--;
      j--;
    }

    // 오른쪽 위 대각선 확인
    i = row;
    j = col;
    while (i >= 0 && j < N) {
      if (chessBoard[i][j] == 1) {
        return false;
      }
      i--;
      j++;
    }

    return true;
  }
}
