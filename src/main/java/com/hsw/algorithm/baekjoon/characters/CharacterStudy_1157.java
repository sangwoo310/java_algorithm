package com.hsw.algorithm.baekjoon.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterStudy_1157 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        boolean flag = false;

        String topStr = "";
        String tempStr = "";

        int topCount = 0;
        int tempCount = 0;

        for (int i=0; i<str.length(); i++) {
            if(str.length() == 1) {
                topStr = Character.toString(str.charAt(0));
                break;
            }

            tempStr = Character.toString(str.charAt(i));

            if (topCount == tempCount) {
                flag = true;
            } else if (topCount < tempCount) {
                topStr = tempStr;
                topCount = tempCount;
                flag = false;
            }

            tempCount = 0;

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
}
