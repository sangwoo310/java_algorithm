package com.hsw.algorithm.baekjoon.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Theorem_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int count = 0;
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }

            for (int i = num + 1; i <= num * 2; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
