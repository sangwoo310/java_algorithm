package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Josephus_1158 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= N; i++) {
      queue.add(i);
    }

    StringBuilder sb = new StringBuilder();
    sb.append("<");

    /**
     * queue 를 이용하여 큐를 뒤로 넘김으로써 K 번째 수를 뽑아내는 방식으로 문제를 풀어야함
     * k-1 번째의 값이 뽑아낼 값이기에 for 문에서 k-1 번째까지만 루프를 돌림
     */
    while (queue.size() != 1) {
      for (int i = 0; i < K - 1; i++) {
        queue.add(queue.poll());
      }
      sb.append(queue.poll()).append(", ");
    }

    sb.append(queue.poll()).append(">");

    System.out.println(sb);
  }
}
