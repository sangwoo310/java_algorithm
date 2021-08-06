package com.hsw.algorithm.baekjoon.arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberCount_2577 {
    public static void main(String[] args) throws Exception {
        /*
        // 일반적이지만 느리다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int calc = 1;
        for (int i=0; i<3; i++) {
            calc = calc * Integer.parseInt(br.readLine());
        }

        String calcStr = Integer.toString(calc);

        int count = 0;

        for (int i=0; i<10; i++) {
            count = 0;
            for (int k=0; k<calcStr.length(); k++) {
                if (i == Integer.parseInt(String.valueOf(calcStr.charAt(k)))) {
                    count++;
                }
            }
            System.out.println(count);
        }
        */

        // 더 빠른 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(val);

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - 48)]++;
        }

        for (int v : arr) {
            System.out.println(v);
        }
    }
}
