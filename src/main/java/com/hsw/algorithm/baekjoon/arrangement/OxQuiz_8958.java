package com.hsw.algorithm.baekjoon.arrangement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OxQuiz_8958 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loopCount = Integer.parseInt(br.readLine());

        int count = 0;
        int totalScore = 0;
        int score = 0;

        int[] result = new int[loopCount];

        while (count < loopCount) {
            String quiz = String.valueOf(br.readLine());
            totalScore = 0;
            score = 0;

            for (int i = 0; i < quiz.length(); i++) {
                if (Character.toString(quiz.charAt(i)).equals("O")) {
                    score += 1;
                    totalScore += score;
                } else {
                    score = 0;
                }
            }
            result[count] = totalScore;
            count++;
        }

        for (int i = 0; i < loopCount; i++) {
            System.out.println(result[i]);
        }
    }
}
