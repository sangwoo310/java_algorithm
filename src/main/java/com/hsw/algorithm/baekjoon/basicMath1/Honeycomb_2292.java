package com.hsw.algorithm.baekjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb_2292 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        // 탐색 범위의 최대값
        int range = 1;
        int count = 1;

        if (number == 1) {
            System.out.println(1);
        } else {
            while (range < number) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
