package com.hsw.algorithm.baekjoon.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlphabet_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int totalCount = str.length();
        int croatiaCount = 0;

        for (int i = totalCount - 1; i >= 0; i--) {
            if (str.charAt(i) == '=') {
                if (i - 2 >= 0 && str.charAt(i - 1) == 'z' && str.charAt(i - 2) == 'd') {
                    croatiaCount++;
                }
                croatiaCount++;
            } else if (str.charAt(i) == '-') {
                croatiaCount++;
            } else if (str.charAt(i) == 'j') {
                if (i - 1 >= 0 && (str.charAt(i - 1) == 'l' || str.charAt(i - 1) == 'n')) {
                    croatiaCount++;
                }
            }
        }

        System.out.println(totalCount - croatiaCount);
    }
}
