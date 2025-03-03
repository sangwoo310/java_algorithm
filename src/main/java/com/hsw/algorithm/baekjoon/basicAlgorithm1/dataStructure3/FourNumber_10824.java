package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 매우 쉬운문제인데 타입에 대해서 고민하자!
 * 자연수의 조건이 붙었고 자연수 + 자연수의 값은 int 타입의 범위를 넘는다!
 * 따라서 항상 타입 범위를 생각자
 * <p>
 * 아래 문제는 자연수 문자열 두개를 이어붙이기 때문에 int 타입으로는 범위가 넘는다
 * 따라서 Long 타입으로 전환해야함
 */
public class FourNumber_10824 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(bf.readLine());

    List<String> k = new ArrayList<String>();
    while (st.hasMoreTokens()) {
      k.add(st.nextToken());
    }

    Long v1 = Long.parseLong(k.get(0) + k.get(1));
    Long v2 = Long.parseLong(k.get(2) + k.get(3));

    System.out.println(v1 + v2);
  }
}
