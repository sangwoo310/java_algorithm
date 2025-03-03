package com.hsw.algorithm.dp;

import java.util.Scanner;

public class Fibonacci {
  static int count = 0;
  static int countDpMemoization = 0;
  static int countDpTabulation = 0;
  static Integer[] f;


  static int fib(int n) {
    count++;
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }

  static int fib_dp_memoization(int n) {
    if (n <= 1) {
      return n;
    }
    if (f[n] == null) {
      f[n] = fib_dp_memoization(n - 1) + fib_dp_memoization(n - 2);
      countDpMemoization++;
    }

    return f[n];
  }

  static int fib_dp_tabulation(int n) {
    if (n <= 1) return n;

    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
      countDpTabulation++;
    }
    return dp[n];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    f = new Integer[n + 1];

    System.out.println(fib(n) + " " + count);
    System.out.println(fib_dp_memoization(n) + " " + countDpMemoization);
    System.out.println(fib_dp_memoization(n) + " " + countDpTabulation);
  }
}
