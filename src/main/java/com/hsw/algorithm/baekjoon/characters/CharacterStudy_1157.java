package com.hsw.algorithm.baekjoon.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CharacterStudy_1157 {
    /*
    // 메모리 초과로 실패
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        boolean flag = false;

        String topStr = "";
        String tempStr = "";

        int topCount = 0;
        int tempCount = 0;

        for (int i=0; i<str.length(); i++) {
            if (topCount == tempCount) {
                flag = true;
            } else if (topCount < tempCount) {
                topStr = tempStr;
                topCount = tempCount;
                flag = false;
            }

            tempStr = Character.toString(str.charAt(i));
            tempCount = 0;

            if(str.length() == 1) {
                topStr = tempStr;
                break;
            }

            for (int k=i+1; k<str.length(); k++) {
                if (tempStr.equals(Character.toString(str.charAt(k)))) {

                    tempCount += 1;
                }
            }
        }

        if (flag) {
            System.out.println("?");
        } else {
            System.out.println(topStr);
        }
    }
    */

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte []strByte = br.readLine().toUpperCase().getBytes();
        Arrays.sort(strByte);

        String topStr = "";
        String tempStr = "";

        int topCount = 0;
        int tempCount = 0;

        for (int i=0; i<strByte.length; i++) {
            if (topStr.equals(Character.toString((char) strByte[i]))) {
                tempCount++;
            } else {
                topStr +=
            }

        }
    }
}
