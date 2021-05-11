package com.hsw.algorithm.baekjoon.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EscapeFromRectangle_1085 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] arr = new int[4];
        arr[0] = x;
        arr[1] = w - x;
        arr[2] = y;
        arr[3] = h - y;

        Arrays.sort(arr);

        /*
        // 더 좋은 방법 Math.min 함수 사용
        int x_min = Math.min(x, w-x);	// x축 최소거리
		int y_min = Math.min(y, h-y);	// y축 최소거리

		// x와 y축 최소거리 중 가장 작은 값
		System.out.println(Math.min(x_min, y_min));
         */

        System.out.println(arr[0]);
    }
}
