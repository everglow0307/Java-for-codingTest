import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BaekjunAlgorithm4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//문제1. 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에
		//0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램
		Scanner scan = new Scanner(System.in);
		int result = (scan.nextInt()*scan.nextInt()*scan.nextInt());
		
		//정수를 문자열로 변환하는 메서드 Integer.toString()
		String result2 = Integer.toString(result);
		
		//0부터 9까지의 숫자 구하기
			//result2.charAt(j)-'0'해야 하는 이유: 0을 안빼주면 아스키코드 그대로 나오기 때문에
		for(int i=0;i<10;i++) {
			int count =0;
			for(int j=0; j<result2.length();j++) {
				if(result2.charAt(j)-'0'==i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		//문제1. BufferedReader 사용해서 속도향상
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		
		//계산한 결과값을 문자열로 변환하기
		String str = Integer.toString(val);
		
		int arr2[] = new int[10];
		
		
		for(int i=0;i<str.length();i++) {
			arr2[str.charAt(i)-'0']++;
		}
		
		for(int a : arr2) {
			System.out.println(a);
		}
		
		
		//문제2. 수 10개를 입력받은 뒤 42로 나누고, 나머지가 다른 수의 개수를 출력하기
		//HashSet 이용하기 
		/* 중복원소 허용X, hashset은 순서개념이 없다. 그래서 Collections.sort()사용불가. 
		 * 정렬을 하고 싶다면 리스트로 변환 후 정렬가능
		 * */
		Scanner sc = new Scanner(System.in);
		
		//서로 다른 나머지 값만 저장할 Hashset객체 선언
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		//중복없는 나머지 값 저장
		for(int i=0;i<10;i++) {
			set.add(sc.nextInt()%42);
		}
		
		//서로 다른 나머지 개수 출력
		System.out.println(set.size());
	}
		
}
