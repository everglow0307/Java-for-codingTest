package codingTest;

import java.util.Scanner;

public class JavaAlgorithm {

	public static void main(String[] args) {
		//문제1. 손익분기점
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 	// 고정비
		int B = sc.nextInt();	// 변동비
		int C = sc.nextInt();	// 판매비
		
		//최초로 이익이 발생하는 판매량 출력하기
		if(C<=B) {
			System.out.println(-1);
		}else {
			System.out.println(A/(C-B)+1);
		}
		
		//문제2. 벌집문제
		int N = sc.nextInt();
		int count = 1; //최소 루트
		int range = 2; //범위
		/*벌집은 육각형
		 * 2번째부터 7번째까지 2번 루트
		 * 8번째부터 13번째까지 3번 루트
		 *
		 * */
		
		if(N==1) {
			System.out.println(1);
		}
		else {
			while(range<=N) { 
				range = range+(6*count); //다음 벌집카운트의 최솟값으로 초기화
				count++;
			}
			System.out.println(count);
		}
		
	}
}
