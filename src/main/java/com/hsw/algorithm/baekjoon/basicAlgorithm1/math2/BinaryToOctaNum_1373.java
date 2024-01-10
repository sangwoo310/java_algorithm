package com.hsw.algorithm.baekjoon.basicAlgorithm1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BinaryToOctaNum_1373 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String S = br.readLine();

    //형변환을 해주면서 옆에 2를 적어주면 10진수로 바꿔준다.
    BigInteger N = new BigInteger(S, 2);

    //BigInteger.toString이 String으로 형변환 해주는 것이고, 옆에 괄호안에 원하는 진수를 적어주면 된다.
    String result = N.toString(8);

    System.out.println(result);
  }

  /**
   * copilot 이 작성한걸로 3자리씩 끊어서 처리하는 방법
   */
  /*
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String binaryNum = br.readLine();

    int binaryNumLen = binaryNum.length();
    int octaNumLen = binaryNumLen / 3;
    if (binaryNumLen % 3 != 0) {
      octaNumLen++;
    }

    int[] octaNumArr = new int[octaNumLen];
    int octaNumArrIdx = octaNumLen - 1;
    int binaryNumIdx = binaryNumLen - 1;
    int octaNum = 0;
    int binaryNumVal = 1;
    for (int i=0; i<binaryNumLen; i++) {
      if (binaryNum.charAt(binaryNumIdx) == '1') {
        octaNum += binaryNumVal;
      }

      binaryNumVal *= 2;
      binaryNumIdx--;

      if (binaryNumIdx < 0 || (i+1) % 3 == 0) {
        octaNumArr[octaNumArrIdx] = octaNum;
        octaNumArrIdx--;
        octaNum = 0;
        binaryNumVal = 1;
      }
    }

    for (int i=0; i<octaNumLen; i++) {
      System.out.print(octaNumArr[i]);
    }
  }
  */
}
