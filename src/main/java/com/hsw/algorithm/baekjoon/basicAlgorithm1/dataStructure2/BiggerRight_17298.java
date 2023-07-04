package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BiggerRight_17298 {
  /**
   * 이 문제는 seq 와 stack 을 적절히 사용하는건데 이해하기가 어려움...
   * seq 를 stack 에 저장하여 기록을 남기고 stack 에 저장된값 이전에는 전부다 큰값으로 바꾸면서 처리
   * stack 에 저장된 seq 를 큰값으로 바꾸게 되면 자동으로 정렬이 된다
   *
   * 참고자료: https://st-lab.tistory.com/196
   */
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] seq = new int[N];
    for(int i=0; i<N; i++) {
      seq[i] = Integer.parseInt(st.nextToken());
    }

    Stack<Integer> stack = new Stack<>();

    for(int i=0; i<N; i++) {
      while (!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
        seq[stack.pop()] = seq[i];
      }

      stack.push(i);
    }

    while (!stack.isEmpty()) {
      seq[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < N; i++) {
      sb.append(seq[i]).append(' ');
    }

    System.out.println(sb);
  }
}
