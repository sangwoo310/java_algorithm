package com.hsw.algorithm.baekjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HotelACM_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        String[] result = new String[count];

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int floor = N % H;
            int number = N / H;

            if (floor == 0) {
                floor = H;
            } else {
                number++;
            }

            result[i] = floor + padding(W, number);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static String padding(int w, int number) {
        String paddingStr = "";

        int paddingCount = (int) Math.log10(w) + 1;
        int originCount = (int) Math.log10(number) + 1;

        for (int i = 0; i < paddingCount - originCount; i++) {
            paddingStr += "0";
        }
        paddingStr += number;

        if (paddingStr.length() == 1) {
            paddingStr = "0" + paddingStr;
        }

        return paddingStr;
    }

    /*
    // 더 좋은 방법
    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int H = Integer.parseInt(st.nextToken());
			st.nextToken();			// W 는 그냥 버린다.
			int N = Integer.parseInt(st.nextToken());

			if (N % H == 0) {
				sb.append((H * 100) + (N / H)).append('\n');

			} else {
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
			}
		}
		System.out.print(sb);

	}
    */
}
