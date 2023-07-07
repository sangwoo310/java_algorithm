package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure2;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 오큰수 문제는 스택을 활용하는 아주 좋은 문제로 생각됨
 * 중요한점은 값을 직접 사용하는게 아니라 배열의 인덱스 값을 가지고 활용하는게 문제의 핵심
 *
 * 1. 스택에 기본값의 인덱스를 푸시
 * 2. 스택에 마지막 값의 인덱스로 배열의 값과 현재 검색하고있는 값을 비교하여 현재의 값이 더 크다면 스택에 있는 인덱스의 배열의 값을 현재의 값으로 세팅 -> 아래의 30라인의 while 문에 해당하는 로직
 * 3. 모든값을 순회하고 스택에 남아 있는 인덱스는 자동으로 더 큰값이 없는 인덱스이기에 해당 인덱스의 배열값을 -1 로 세팅
 */
public class BiggerRight_review_17298 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] seq = new int[N];
    for (int i=0; i<N; i++) {
      seq[i] = Integer.parseInt(st.nextToken());
    }

    Stack<Integer> stack = new Stack<>();

    for (int i=0; i<seq.length; i++) {
      while (!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
        seq[stack.pop()] = seq[i];
      }
      stack.push(i);
    }

    while (!stack.isEmpty()) {
      seq[stack.pop()] = -1;
    }

    for (int v : seq) {
      bw.append(String.valueOf(v)).append(" ");
    }

    bw.flush();
  }
}
