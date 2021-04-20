package com.hsw.algorithm.baekjoon.Arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinMax_10818 {
    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int index = 0;

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());

            index++;
        }

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[n-1]);
    }
}
