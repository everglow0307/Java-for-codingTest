import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		//문제1. 별찍기 문제
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		//문제2. 별찍기 문제2
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
		
		//문제3. 정수 N개로 이루어진 수열에서 정수 X보다 작은 수 출력하기
		//정수 N과 X는 입력받는다.
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		//수열저장할 배열 
		int nums[] = new int[N];
		
		//수열 입력받기
		for(int i=0;i<N;i++) {
			nums[i]=scan.nextInt();
		}
		
		scan.close();
		
		//X보다 작은 값 출력
		for(int i=0;i<N;i++) {
			if(X>nums[i]) {
				System.out.println(nums[i]+" ");
			}
		}
		
	}

}
