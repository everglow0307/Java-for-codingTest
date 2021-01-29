import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BaekjunAlgorithm3 {

	public static void main(String[] args) {
		//문제1. 출력할 정수 개수 N입력받고, N개의 최솟값과 최댓값을 공백으로 구분해 출력
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = scan.nextInt();
		}
		
		//배열에 저장된 원소를 오름차순으로 정렬. -> Arrays.sort(arr);
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[N-1]);
	}
	
		//문제2. 9개의 정수를 입력받고 최댓값과 최댓값이 나온 순서를 출력
		//방법1.배열사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr2= new int[9];
		
		for(int i=0; i<9 ;i++) {
			arr2[i] = Integer.parseInt(br.readLine());
		}
		
		//최댓값 저장할 변수와, 최댓값 인덱스 저장할 변수 선언
		int max = 0;
		int index =0;
		
		//최댓값 인덱스 구하기
		int count = 0;
		
		for(int value : arr2) {
			count++;
			if(value>max) {
				max=value;
				index=count;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
		//방법2. 배열쓰지 않는 방법
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		int max2 = 0;
		int index2 = 0;
		for(int j=0;i<9;j++) {
			int val = Integer.parseInt(br.readLine());
			
			if(val>max) {
				max = val;
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
}
		
}
