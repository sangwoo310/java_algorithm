package com.hsw.algorithm.baekjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chairman_2775 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[16][15];

        for (int i=0; i<arr.length; i++) {
            for (int k=0; k<arr[i].length; k++) {
                if (i == 0) {
                    arr[0][k] = k+1;
                } else if (k == 0) {
                    arr[i][0] = 1;
                } else {
                    arr[i][k] = arr[i][k-1] + arr[i-1][k];
                }
            }
        }

        for (int i=0; i<testCount; i++) {
            int floor = Integer.parseInt(br.readLine());
            int number = Integer.parseInt(br.readLine());

            sb.append(arr[floor][number-1]).append("\n");
        }

        System.out.println(sb);
    }
}
