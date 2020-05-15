package com.boj.level5;

import java.util.Scanner;

/**
 * 
 * @author POTATO 
 *            [문제] 별 찍기 - 9
 *            예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
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
        int n = sc.nextInt();
        sc.close();
        
        for(int p = 0; p<n; p++) {
            for(int q=0; q<p;q++) {
                System.out.print(" ");
            }
            for(int q=0; q<2*(n-p)-1;q++) {
                System.out.print("*");
            }
 
            System.out.println("");
        }
        
        for(int p = 1; p<n; p++) {
            for(int q=0; q<n-p-1;q++) {
                System.out.print(" ");
            }
            for(int q=0; q<2*p+1;q++) {
                System.out.print("*");
            }
 
            System.out.println("");
        }

    }

}