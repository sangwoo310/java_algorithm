package com.hsw.algorithm.baekjoon.basicAlgorithm1.dataStructure1;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Editor_1406 {
  /*
   * 시간복잡도에 의해 실패 (시간초과) => O(n^2)
   * insert() 메소드는 O(n)의 시간복잡도를 가지고 있고, delete() 메소드는 O(n)의 시간복잡도를 가지고 있기 때문
   */
  public static void Editor_Fail(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder base = new StringBuilder(br.readLine());
    int n = Integer.parseInt(br.readLine());

    int cursor = base.length();

    while (n-- > 0) {
      StringTokenizer command = new StringTokenizer(br.readLine());
      String cmd = command.nextToken();

      if (cmd.equals("L")) {
        if(cursor != 0) {
          cursor--;
        }
      } else if(cmd.equals("D")) {
        if (cursor != base.length()) {
          cursor++;
        }
      } else if(cmd.equals("B")) {
        if (cursor != 0) {
          base.deleteCharAt(cursor-1);
          cursor--;
        }
      } else if(cmd.equals("P")) {
        String add = command.nextToken();
        base.insert(cursor, add);
        cursor++;
      }
    }

    System.out.println(base);
  }

  /*
   * BufferedWriter 를 사용안하고 94번째 라인에서 System.print()를 사용하면 시간초과가 발생한다.
   * 이유는 BufferedWriter 는 버퍼를 사용하기 때문에 한번에 출력을 하기 때문에 시간을 단축시킬 수 있다.
  */
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String baseStr = br.readLine();
    int n = Integer.parseInt(br.readLine());

    Stack<String> leftStack = new Stack<>();
    Stack<String> rightStack = new Stack<>();

    for (int i = 0; i < baseStr.length(); i++) {
      leftStack.push(String.valueOf(baseStr.charAt(i)));
    }

    for(int i = 0; i < n; i++) {
      StringTokenizer command = new StringTokenizer(br.readLine());
      String cmd = command.nextToken();

      switch (cmd) {
        case "L":
          if(!leftStack.empty()) {
            rightStack.push(leftStack.pop());
          }
          break;
        case "D":
          if(!rightStack.empty()) {
            leftStack.push(rightStack.pop());
          }
          break;
        case "B":
          if (!leftStack.empty()) {
            leftStack.pop();
          }
          break;
        case "P":
          leftStack.push(command.nextToken());
        default:
          break;
      }
    }

    while (!leftStack.empty()) {
      rightStack.push(leftStack.pop());
    }

    while (!rightStack.empty()) {
      bw.write(rightStack.pop());
    }

    bw.flush();
    bw.close();
  }
}
