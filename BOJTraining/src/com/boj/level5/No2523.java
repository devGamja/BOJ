package com.boj.level5;

import java.util.Scanner;

/**
 * 
 * @author POTATO 
 * 		   [문제] 별 찍기 - 13
 * 		   예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 
 *         [입력] 
 *         첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 *         [출력] 
 *         첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 *
 */

public class No2523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) { // 1 ~ N
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = N - 1; i > 0; i--) { // N+1 ~ 2N-1
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
