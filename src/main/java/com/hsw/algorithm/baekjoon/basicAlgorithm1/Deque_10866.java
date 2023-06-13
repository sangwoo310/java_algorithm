package com.hsw.algorithm.baekjoon.basicAlgorithm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * 덱
 * deque.pop 과 deque.poll 은 같은 기능이지만 deque 가 비어있을경우 pop 은 에러를 poll 은 null 을 리턴
 * pop 과 poll 이 같은것은 둘다 의미가 큐와 스택의 첫 데이터를 제거 따라서 실제 stack.pop 은 맨 뒤의 요소를 제거하지만 그 의미는 가장 최근에 들어온 데이터를 제거한다는 의미
 */
public class Deque_10866 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Deque<Integer> deque = new java.util.LinkedList<Integer>();

    StringBuilder sb = new StringBuilder();

    while(N-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      switch (st.nextToken()) {
        case "push_front":
          deque.addFirst(Integer.parseInt(st.nextToken()));
          break;
        case "push_back":
          deque.addLast(Integer.parseInt(st.nextToken()));
          break;
        case "pop_front":
          if (deque.isEmpty()) {
            sb.append(-1).append("\n");
          } else {
            sb.append(deque.poll()).append("\n");
          }
          break;
        case "pop_back":
          if (deque.isEmpty()) {
            sb.append(-1).append("\n");
          } else {
            sb.append(deque.pollLast()).append("\n");
          }
          break;
        case "size":
          sb.append(deque.size()).append("\n");
          break;
        case "empty":
          if (deque.isEmpty()) {
            sb.append(1).append("\n");
          } else {
            sb.append(0).append("\n");
          }
          break;
        case "front":
          if (deque.isEmpty()) {
            sb.append(-1).append("\n");
          } else {
            sb.append(deque.peekFirst()).append("\n");
          }
          break;
        case "back":
          if (deque.isEmpty()) {
            sb.append(-1).append("\n");
          } else {
            sb.append(deque.peekLast()).append("\n");
          }
          break;
        default:
          break;
      }
    }
    System.out.println(sb);
  }
}
