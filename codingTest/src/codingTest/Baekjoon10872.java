package codingTest;

import java.util.Scanner;

public class Baekjoon10872 {

	public static int factorial(int i) {
		if(i<=0) return 1;
		return i*(factorial(i-1));
		
	}
	
	public static int fibonachi(int N) {
		if(N==0) return 0;
		if(N==1) return 1;
		return fibonachi(N-1)+fibonachi(N-2);
	}
	public static void main(String[] args) {

		//문제1. 팩토리얼 복습
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(factorial(i));
		
		//문제2. 피보나치 수열- 그림 그려서 이해하기
		int n = sc.nextInt();
		System.out.println(fibonachi(n));
	}

}
