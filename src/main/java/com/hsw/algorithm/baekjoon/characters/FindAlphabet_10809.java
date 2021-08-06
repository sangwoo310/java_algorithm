package com.hsw.algorithm.baekjoon.characters;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindAlphabet_10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i) - 97] == -1) {
                arr[str.charAt(i) - 97] = i;
            }
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}
