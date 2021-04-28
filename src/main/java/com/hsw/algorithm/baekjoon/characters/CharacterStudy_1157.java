package com.hsw.algorithm.baekjoon.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterStudy_1157 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int top = 0;
        char topStr = '?';

        // byte 로 받을경우 2^8만 받을수있어서 문제 조건에서 100000가지 이상일경우이기에 overflow 발생으로 실패
        int[] alphabetArr = new int[26];

        for (int i=0; i<str.length(); i++) {
            alphabetArr[(byte)str.charAt(i) - 65]++;
        }

        for (int i=0; i<alphabetArr.length; i++) {
            if (alphabetArr[i] > top) {
                top = alphabetArr[i];
                topStr = (char)(i + 65);
            } else if (alphabetArr[i] == top) {
                topStr = '?';
            }
        }

        System.out.println(topStr);
    }

    /*
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; // 영문자의 개수는 26개임
        String s = br.readLine();


        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                arr[s.charAt(i) - 97]++;
            } else {
                arr[s.charAt(i) - 65]++;
            }
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {

            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
    */
}
