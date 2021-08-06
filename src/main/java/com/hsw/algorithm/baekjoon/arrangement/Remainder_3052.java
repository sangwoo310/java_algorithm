package com.hsw.algorithm.baekjoon.arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Remainder_3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        boolean flag;

        for (int i = 0; i < 10; i++) {
            flag = false;
            int remainder = Integer.parseInt(br.readLine()) % 42;

            if (list.size() == 0) {
                list.add(remainder);
            }

            for (Integer integer : list) {
                if (integer == remainder) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }

            if (flag) {
                list.add(remainder);
            }
        }

        System.out.println(list.size());
    }
}
