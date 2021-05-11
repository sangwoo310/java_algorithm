package com.hsw.algorithm.baekjoon.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber_2581 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int min = 0;
        int total = 0;

        for (int i=M; i<=N; i++) {
            if (isPrime(i)) {
                if (min == 0) {
                    min = i;
                }

                total += i;
            }
        }

        if (min == 0) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(min);
        }
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i=2; i<num; i++) {
            if (num%i == 0) {
                return false;
            }
        }

        return true;
    }
}
