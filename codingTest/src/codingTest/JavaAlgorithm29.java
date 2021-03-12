package codingTest;

import java.util.Scanner;

public class JavaAlgorithm29 {

	public static void check(int arr[]) {
		boolean aFlag = true;
		boolean bFlag = true;
		
		if(arr[0]!=1) {
			aFlag=false;
		}
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]-arr[i+1]!=-1) {
				aFlag = false;
				break;
			}
		}
		
		if(arr[0]!=8) {
			bFlag = false;
		}
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]-arr[i+1]!=1) {
				bFlag =false;
				break;
			}
		}
		if(aFlag) {
			System.out.println("ascending");
		}else if(bFlag) {
			System.out.println("descending");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		//문제1. 오름차순 / 내림차순 / 순서없음 확인하는 알고리즘 
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[8];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		check(arr);
		
		
	}
}
