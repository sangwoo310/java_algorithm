package com.hsw.algorithm.baekjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlyToAlphaCentauri_1011 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int moveCount = 0;
        for (int i=0; i<count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            int crossPoint = (Y - X - 1) / 2;

            while (true) {
                if ((moveCount*moveCount + moveCount) > Y-X-1) {
                    break;
                }
                moveCount ++;
            }
        }
        System.out.println(moveCount);
    }
}
