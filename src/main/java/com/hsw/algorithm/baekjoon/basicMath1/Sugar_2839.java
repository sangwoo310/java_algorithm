package com.hsw.algorithm.baekjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar_2839 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int bag5 = N / 5;
        int left = N % 5;

        if (left == 0) {
            System.out.println(bag5);
        } else {
            while (true) {

            }
        }
    }
}
