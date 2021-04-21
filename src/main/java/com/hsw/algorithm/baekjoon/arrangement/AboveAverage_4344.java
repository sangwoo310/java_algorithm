package com.hsw.algorithm.baekjoon.arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AboveAverage_4344 {
    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseCount = Integer.parseInt(br.readLine());
        int average = 0;
        int rate = 0;

        float[] result = new float[caseCount];

        for (int i=0; i<caseCount; i++) {
            average = 0;
            rate = 0;

            String classCase = br.readLine();

            String[] splitArr = classCase.split(" ");

            for (int k=1; k<splitArr.length; k++) {
                average += Integer.parseInt(splitArr[k]);
            }

            for (int k=1; k<splitArr.length; k++) {
                if (Integer.parseInt(splitArr[k])>average/Integer.parseInt(splitArr[0])) {
                    rate += 1;
                }
            }

            result[i] = rate/(float)Integer.parseInt(splitArr[0]) * 100;
        }

        for (int i=0; i<result.length; i++) {
            System.out.println(String.format("%.3f", result[i]) + "%");
        }
    }
}
