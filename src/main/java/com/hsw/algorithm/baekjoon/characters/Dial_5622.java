package com.hsw.algorithm.baekjoon.characters;

import java.io.IOException;

public class Dial_5622 {
    public static void main(String[] args) throws IOException {
        int time = 0;
        int count = 0;

        int[] alphabetArr = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};

        while (true) {
            int input = System.in.read();
            if (input == 10) {
                break;
            }

            time += alphabetArr[input - 65];
            count++;
        }

        System.out.println(time + count);

    }
}
