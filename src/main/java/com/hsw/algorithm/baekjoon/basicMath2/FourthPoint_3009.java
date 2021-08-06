package com.hsw.algorithm.baekjoon.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourthPoint_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] point1 = br.readLine().split(" ");
        String[] point2 = br.readLine().split(" ");
        String[] point3 = br.readLine().split(" ");

        int x = 0;
        int y = 0;


        for (int i = 0; i < 3; i++) {
            if (point1[0].equals(point2[0])) {
                x = Integer.parseInt(point3[0]);
            } else if (point1[0].equals(point3[0])) {
                x = Integer.parseInt(point2[0]);
            } else {
                x = Integer.parseInt(point1[0]);
            }
        }

        for (int i = 0; i < 3; i++) {
            if (point1[1].equals(point2[1])) {
                y = Integer.parseInt(point3[1]);
            } else if (point1[1].equals(point3[1])) {
                y = Integer.parseInt(point2[1]);
            } else {
                y = Integer.parseInt(point1[1]);
            }
        }

        System.out.println(x + " " + y);
    }
}
