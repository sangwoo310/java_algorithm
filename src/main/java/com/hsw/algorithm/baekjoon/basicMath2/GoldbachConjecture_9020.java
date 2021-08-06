package com.hsw.algorithm.baekjoon.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachConjecture_9020 {

    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        getPrime();

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int primeNum1 = n / 2;
            int primeNum2 = n / 2;

            while (true) {
                if (!prime[primeNum1] && !prime[primeNum2]) {
                    System.out.println(primeNum1 + " " + primeNum2);
                    break;
                }

                primeNum1--;
                primeNum2++;
            }
        }
    }

    // 에라토스테네스의 체 알고리즘을 활용하여 소수 판별
    // 에라토스테네스의 체 :  k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다
    private static boolean getPrime() {
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(10000); i++) {

            // 이미 체크된 배열이면 다음 반복문으로 skip
            if (prime[i] == true) {
                continue;
            }

            // i 의 배수들을 걸러주기 위한 반복문
            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }

        return true;
    }
}
