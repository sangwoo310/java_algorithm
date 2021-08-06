package com.hsw.algorithm.baekjoon.function;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArithmeticSequence_1065 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputData = Integer.parseInt(br.readLine());
        if (inputData == 1000) {
            inputData = 999;
        }

        int count = 0;

        for (int i = 1; i <= inputData; i++) {
            if (mathFunc(i)) {
                count += 1;
            }
        }

        System.out.println(count);
    }

    public static boolean mathFunc(int n) {
        if (n < 100) {
            return true;
        }

        int number = n;
        int dif = 0;
        int num1 = 0;
        int num2 = 0;
        int count = 0;

        while (number != 0) {
            num2 = num1;
            num1 = number % 10;

            if (count == 2 && num2 - num1 != dif) {
                return false;
            }

            dif = num2 - num1;
            number = number / 10;
            count++;
        }

        return true;
    }

    /*
    // 더 좋은 방법
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));

    }

    public static int arithmetic_sequence(int num) {
        int cnt = 0; // 한수 카운팅

        if (num < 100) {
            return num;
        }

        else {
            cnt = 99;
            if (num == 1000) { // 예외처리 필수
                num = 999;
            }

            for (int i = 100; i <= num; i++) {
                int hun = i / 100; // 백의 자릿수
                int ten = (i / 10) % 10; // 십의 자릿수
                int one = i % 10;

                if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면
                    cnt++;
                }
            }
        }

        return cnt;
    }
    */
}
