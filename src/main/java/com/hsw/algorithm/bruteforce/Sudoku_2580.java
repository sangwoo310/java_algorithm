package com.hsw.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sudoku_2580 {
  static int[][] board = new int[9][9];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    for (int i = 0; i < 9; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 9; j++) {
        board[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    sudoku(0, 0);

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  /**
   * 백트래킹인데 이전정보를 되돌리지 않기때문에 실패케이스가 존재
   * 이것의 가정은 처음 설정된 정보가 완벽하다는 가정하에 동작
   */
//  public static void sudoku(int row, int col) {
//    if (row >= 9) {
//      return;
//    }
//
//    for (int i = col; i < 9; i++) {
//      if (board[row][i] == 0) {
//        for (int candidateNumber = 1; candidateNumber <= 9; candidateNumber++) {
//          if (isPromising(candidateNumber, row, i)) {
//            board[row][i] = candidateNumber;
//            break;
//          }
//        }
//      }
//    }
//
//    sudoku(row + 1, 0);
//  }

  public static boolean sudoku(int row, int col) {
    if (row == 9) {
      return true;
    }

    if (col == 9) {
      return sudoku(row+1, 0);
    }

    if (board[row][col] == 0) {
      for (int candidateNum=1; candidateNum<=9; candidateNum++) {
        if (isPromising(candidateNum, row, col)) {
          board[row][col] = candidateNum;
          if (sudoku(row, col+1)) {
            return true;
          }
          board[row][col] = 0;
        }
      }
      return false;
    } else {
      return sudoku(row, col+1);
    }
  }

  public static boolean isPromising(int candidateNum, int row, int col) {
    // 3*3 위치 체크
    int startRow = (row / 3) * 3;
    int endRow = (row / 3) * 3 + 2;
    int startCol = (col / 3) * 3;
    int endCol = (col / 3) * 3 + 2;

    for (int i = startRow; i <= endRow; i++) {
      for (int j = startCol; j <= endCol; j++) {
        if (board[i][j] == candidateNum) {
          return false;
        }
      }
    }

    // 같은 행 체크
    for (int i = 0; i < 9; i++) {
      if (board[row][i] == candidateNum) {
        return false;
      }
    }

    // 같은 열 체크
    for (int i = 0; i < 9; i++) {
      if (board[i][col] == candidateNum) {
        return false;
      }
    }

    return true;
  }
}

/**
 * 반례
 * 5 3 0 0 7 0 0 0 0
 * 6 0 0 1 9 5 0 0 0
 * 0 9 8 0 0 0 0 6 0
 * 8 0 0 0 6 0 0 0 3
 * 4 0 0 8 0 3 0 0 1
 * 7 0 0 0 2 0 0 0 6
 * 0 6 0 0 0 0 2 8 0
 * 0 0 0 4 1 9 0 0 5
 * 0 0 0 0 8 0 0 7 9
 */
