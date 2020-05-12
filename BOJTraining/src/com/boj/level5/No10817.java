package com.boj.level5;

import java.util.Scanner;

/**
 * 
 * @author POTATO 
 * 		   [문제] 세 수
 * 		   세 정수 A, B, C가 주어진다. 
 * 		   이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
 * 
 *         [입력] 
 *         첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. 
 *         (1 ≤ A, B, C ≤ 100)
 * 
 *         [출력] 
 *         두 번째로 큰 정수를 출력한다.
 *
 */

public class No10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = 0;

		if (a >= b || a >= c) {
			num = a;
		} else if (b >= a || b >= c) {
			num = b;
		} else {
			num = c;
		}
		System.out.println(num);
		sc.close();

	}

}
