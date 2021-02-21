package codingTest;

import java.util.HashSet;
import java.util.Scanner;

public class Java {

	public static void main(String[] args) {

		//문제1. n의 m제곱 값 구하기
		int n = 5;
		int m = 3;
		int res = 1;
		
		// n *= n 하는게 아니라 다른 변수를 사용해야 반복문 횟수만큼 제곱함.
		for(int i=0;i<m;i++) {
			res *= n;
		}
		System.out.println(res);
		//문제2. 1~100까지 숫자가 입력될 때 한번이라도 입력되었으면 출력하기
		//inArr배열에 숫자를 입력받아서 저장함.
		
		boolean arr[] = new boolean[100];
		int inArr[] = new int[100];
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<5;i++) {
		set.add(scan.nextInt());
			//inArr[i]=scan.nextInt();
		}
		System.out.println(set);
		//한번이라도 입력받았다면 해당인덱스 값에 true를 저장. 
		for(int i=0;i<=100;i++) {
			 //arr[inArr[i]] = true;
		}
		
//		for(int i=0;i<=100;i++) {
//			if(arr[i]) {
//				System.out.print(arr[i]+" ");
//			}
//		}
		
	}

}
