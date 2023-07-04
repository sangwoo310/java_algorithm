package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class NGF_17299 {
  /**
   * 17298번을 활용한 문제로 시간초과 문제를 해결하기 위해서는 각 인자에 대한 갯수를 저장하는 배열을 만드는 부분이 중요
   * 아래 HashMap 을 활용한 코드 확인 필수!
   */
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int[] seq = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++) {
        seq[i] = Integer.parseInt(st.nextToken());
    }

    HashMap<Integer, Integer> countMap = new HashMap<>();
    int[] seqCount = new int[N];

    for (int i = 0; i < N; i++) {
      countMap.put(seq[i], countMap.getOrDefault(seq[i], 0) + 1);
    }

    for (int i = 0; i < N; i++) {
      seqCount[i] = countMap.get(seq[i]);
    }

    Stack<Integer> stack = new Stack<>();
    for(int i=0; i<N; i++) {
      while (!stack.isEmpty() && seqCount[i] > seqCount[stack.peek()]) {
        seq[stack.pop()] = seq[i];
      }
      stack.push(i);
    }

    while (!stack.isEmpty()) {
      seq[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for (int j : seq) {
      sb.append(j).append(" ");
    }

    System.out.println(sb);
  }
}
