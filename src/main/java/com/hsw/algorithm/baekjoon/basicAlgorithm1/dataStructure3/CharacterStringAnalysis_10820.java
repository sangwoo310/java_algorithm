package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure3;

import java.io.*;

/**
 * 문제는 쉬운데 EOF 에러 문제 를 처음 봤음
 * EOF(End Of File): 데이터가 없을때 끝내야할때 처리를 해야한다
 * 참고 아래 코드는 정상인데 정답을 얻고도 프로그램은 계속 돌게되는데 정상! 따라서 출력문을 while 문 안에서 처리해줘야한다
 *
 * 처리방법
 * 1. BufferedReader 사용시 while((S = br.readLine()) != null) {} 방법으로 처리
 * 2. Scanner 사용시 while(sc.hasNext()) {} 방법으로 처리
 */
public class CharacterStringAnalysis_10820 {
  public static void main(String[] args) throws IOException {
//    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = "";
    while ((str = br.readLine()) != null) {

      int upper = 0;
      int lower = 0;
      int integer = 0;
      int blank = 0;

      for (int i=0; i<str.length(); i++) {
        int c = str.charAt(i);

        if(c >= 65 && c <= 90) {
          upper += 1;
        }

        if(c >= 97 && c <= 122) {
          lower += 1;
        }

        if(c >= 48 && c <= 57) {
          integer += 1;
        }

        if(c == 32) {
          blank += 1;
        }
      }

      bw.write(lower + " " + upper + " " + integer + " " + blank);
      bw.write("\n");
      bw.flush();
    }
  }
}
