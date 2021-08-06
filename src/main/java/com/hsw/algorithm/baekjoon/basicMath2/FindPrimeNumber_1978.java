package com.hsw.algorithm.baekjoon.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrimeNumber_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());
            if (number == 1) {
                continue;
            }

            count++;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count--;
                    break;
                }
            }

        }

        System.out.println(count);
    }
}
