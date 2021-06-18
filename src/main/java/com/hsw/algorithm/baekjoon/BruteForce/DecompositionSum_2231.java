package com.hsw.algorithm.baekjoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecompositionSum_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i<N; i++) {
            int number = i;
            int temp = 0;

            while (number != 0) {
                temp += number % 10;
                number /= 10;
            }

            if (N == i + temp) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
