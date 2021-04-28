package com.hsw.algorithm.baekjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionNum_1193 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int count = 0;
        int range = 0;

        if (X == 1) {
            System.out.println(1 + "/" + 1);
        } else {
            while (range < X) {
                range = range + count + 1;
                count++;
            }
            int dif = range - X;

            if (count % 2 == 1) {
                System.out.println((1+dif) + "/" + (count-dif));
            } else {
                System.out.println((count-dif) + "/" + (1+dif));
            }
        }
    }
}
