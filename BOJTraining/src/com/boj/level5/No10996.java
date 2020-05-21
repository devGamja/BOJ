package com.boj.level5;

import java.util.Scanner;

/**
 * 
 * @author POTATO 
 *         [문제] 별 찍기 - 21
 *         예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 
 *         [입력] 
 *         첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 *         [출력] 
 *         첫째 줄부터 차례대로 별을 출력한다.
 *
 */

public class No10996 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 2 * n; i++) {

			if (i % 2 == 1) {
				for (int j = 1; j <= n; j++) {
					if (j % 2 == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}

			else {
				for (int j = 1; j <= n; j++) {
					if (j % 2 == 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");

		}

	}
}