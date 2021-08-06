package com.hsw.algorithm.baekjoon.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupCharacterChecker_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());

        int normalCount = 0;

        for (int i = 0; i < inputCount; i++) {
            byte[] strByte = br.readLine().getBytes();
            int[] arr = new int[26];
            int tempValue = -1;

            for (int k = 0; k < strByte.length; k++) {
                if (arr[strByte[k] - 97] > 0 && tempValue != strByte[k] - 97) {
                    normalCount++;
                    break;
                }
                arr[strByte[k] - 97]++;
                tempValue = strByte[k] - 97;
            }
        }

        System.out.println(inputCount - normalCount);
    }
}
