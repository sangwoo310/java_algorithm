package com.hsw.algorithm.dp;

import java.util.Scanner;
import java.util.TreeSet;

public class Box_1965 {
  /**
   * 근시안적인 접근 -> 마지막 -1 번째까지만을 체크하는게 아니라 완전한 체크가 필요함
   */
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int N = sc.nextInt();
//    int[] box = new int[N + 1];
//
//    for (int i = 1; i <= N; i++) {
//      box[i] = sc.nextInt();
//    }
//
//    int[] order = new int[N + 1];
//    order[1] = box[1];
//    int cursor = 1;
//
//    for (int j = 2; j <= N; j++) {
//      //case1: box = 5 order = 2,4
//      if (box[j] > order[cursor]) {
//        order[cursor + 1] = box[j];
//        cursor += 1;
//        // case2: box = 5 order = 3,7
//      } else if (box[j] > order[cursor - 1]) {
//        order[cursor] = box[j];
//      }
//    }
//
//    System.out.println(Arrays.toString(order));
//    System.out.println(cursor);
//  }

  /**
   * TreeSet 을 만들어 ceiling 함수(자신보다 큰 값이 첫번째)로 데이터를 추출하여 계속하여 작은 순서대로 배열을 생성
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] box = new int[N];

    for (int i = 0; i < N; i++) {
      box[i] = sc.nextInt();
    }

    TreeSet<Integer> lisSet = new TreeSet<>();

    for (int i = 0; i < N; i++) {
      Integer higherOrEqual = lisSet.ceiling(box[i]);
      System.out.println("box[" + i + "] : " + box[i]);
      System.out.println(lisSet);
      System.out.println(higherOrEqual);
      System.out.println("=======================");
      if (higherOrEqual != null) {
        lisSet.remove(higherOrEqual);
      }
      lisSet.add(box[i]);
    }

    System.out.println(lisSet.size());
  }

  /**
   * LIS(Longest Increasing Subsequence) 를 활용한 문제풀이가 기본 O(2^N)
   * 위 TreeSet 은 LIS 를 자료구조로 쉽게 풀이한 방법
   */
  public static void LIS(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] box = new int[N];

    for (int i = 0; i < N; i++) {
      box[i] = sc.nextInt();
    }

    int[] dp = new int[N + 1];
    dp[0] = 1;

    int max = 1;

    for (int i=1; i<N; i++) {
      dp[i] = 1;
      for (int j=0; j<=i; j++) {
        if (box[j] < box[i]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
      max = Math.max(max, dp[i]);
    }

    System.out.println(max);
  }
}
