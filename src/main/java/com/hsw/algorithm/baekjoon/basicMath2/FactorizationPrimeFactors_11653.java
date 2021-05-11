package com.hsw.algorithm.baekjoon.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorizationPrimeFactors_11653 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (true) {
            if (N == 1) {
                break;
            }

            for (int i=2; i<=N; i++) {
                if (N%i == 0) {
                    System.out.println(i);
                    N = N/i;
                    break;
                }
            }
        }
    }

    /*
    // 더 효율적인 방법으로 루트를 사용 => 다음부터 소인수분해과정은 필히 루트를 통해 진행

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();

		int N = in.nextInt();

		for (int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
			while (N % i == 0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}
		if (N != 1) {
			sb.append(N);
		}
		System.out.println(sb);
	}
     */
}
