package com.hsw.algorithm.baekjoon.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Filip_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String input1 = st.nextToken();
        String input2 = st.nextToken();

        String val1 = "";
        String val2 = "";

        for (int i = 2; i >= 0; i--) {
            val1 += Character.toString(input1.charAt(i));
            val2 += Character.toString(input2.charAt(i));
        }

        if (Integer.parseInt(val1) - Integer.parseInt(val2) > 0) {
            System.out.println(val1);
        } else {
            System.out.println(val2);
        }
    }

    /*
    // 삼항연산자 + reverse 함수 사용으로 훨씬 더 간편하게
    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

		System.out.print(A > B ? A:B);

	}
     */
}
