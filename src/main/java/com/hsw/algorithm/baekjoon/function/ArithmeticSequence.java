package com.hsw.algorithm.baekjoon.function;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArithmeticSequence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputData = Integer.parseInt(br.readLine());
        int count = 0;

//        for (int i=1; i<=inputData; i++) {
//            if(mathFunc(i)) {
//                count += 1;
//            }
//        }

        mathFunc(100);

        System.out.println(count);
    }

    public static boolean mathFunc(int n) {
        if (n<100) {
            return true;
        }

        int number = n;
        int dif = 0;
        int num1 = 0;
        int num2 = 0;

        while (number != 0) {
            System.out.println("!!!");
            num2 = num1;
            num1 = number%10;

            System.out.println("1 : "+Math.abs(num2-num1));
            System.out.println("2 : "+dif);

            if (dif != 0 && Math.abs(num2-num1) != dif) {
                System.out.println(n);
                return false;
            }

            dif = Math.abs(num2 - num1);
            number = number/10;

//            System.out.println(num1);
//            System.out.println(num2);
            System.out.println(dif);
//            System.out.println(number);
        }

        return true;
    }

}
