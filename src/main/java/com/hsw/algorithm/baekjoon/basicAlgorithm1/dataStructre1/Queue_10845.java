package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructre1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue_10845 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());

    Queue<String> queue = new LinkedList<>();
    String lastStr = "";

    for (int i = 0; i < N; i++) {
      StringTokenizer command = new StringTokenizer(br.readLine());
      String cmd = command.nextToken();

      switch (cmd) {
        case "push":
          String str = command.nextToken();
          queue.add(str);
          lastStr = str;
          break;
        case "pop":
          if (!queue.isEmpty()) {
            bw.write(queue.poll());
            bw.newLine();
          } else {
            bw.write("-1");
            bw.newLine();
          }
          break;
        case "size":
          /*
          * bufferedWriter 는 버퍼로 저장되기 int 값을 넣게 되면 값이 다른값이 저장됨
          */
          bw.write(queue.size() + "");
          bw.newLine();
          break;
        case "empty":
          if (queue.isEmpty()) {
            bw.write("1");
            bw.newLine();
          } else {
            bw.write("0");
            bw.newLine();
          }
          break;
        case "front":
          if (!queue.isEmpty()) {
            bw.write(queue.peek());
            bw.newLine();
          } else {
            bw.write("-1");
            bw.newLine();
          }
          break;
        case "back":
          if (!queue.isEmpty()) {
            bw.write(lastStr);
            bw.newLine();
          } else {
            bw.write("-1");
            bw.newLine();
          }
          break;
        default:
          break;
      }
    }
    bw.flush();
    bw.close();
  }
}
