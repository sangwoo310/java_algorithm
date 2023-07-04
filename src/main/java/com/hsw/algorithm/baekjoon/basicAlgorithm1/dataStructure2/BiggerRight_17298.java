package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure2;

import java.io.*;
import java.util.*;

public class BiggerRight_17298 {

  // Q: 아래 코드의 시간복잡도가 얼마야?
  // A: O(N^2)
  // Q: 이유는?
  // A: N개의 수를 입력받고, N개의 수를 비교하기 때문에 N^2이다.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    Deque<Integer> deque = new ArrayDeque<>();
    while (st.hasMoreTokens()) {
      deque.add(Integer.parseInt(st.nextToken()));
    }

    int largestNum = -1;
    for (int i=N; i>0; i--) {
      int baseNum = deque.getFirst();
      largestNum = -1;

      for(int j=0; j<i-1; j++) {
        int compareNum = deque.pollLast();
        if(baseNum < compareNum) {
          largestNum = compareNum;
        }
        deque.addFirst(compareNum);
      }
      bw.write(largestNum + " ");
      deque.pollLast();
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
