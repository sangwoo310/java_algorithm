package com.hsw.algorithm.baekjoon.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepeatingCharacters_2675 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());

        for (int i=0; i<testCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = "";

            while (st.hasMoreTokens()) {
                int loopCount = Integer.parseInt(st.nextToken());
                String input = st.nextToken();

                for (int k=0; k<input.length(); k++) {
                    for (int t=0; t<loopCount; t++) {
                        str += input.charAt(k);
                    }
                }
            }

            System.out.println(str);
        }
    }
}
