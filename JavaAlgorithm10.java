import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaAlgorithm10 {

	public static void main(String[] args) throws IOException {

		//문제1. 입력된 수 n만큼 n행 n열의 형태로 아래와 같이 출력하시오.
		/* n = 4
		 * 
		 * 1 5  9 13
		 * 2 6 10 14
		 * 3 7 11 15
		 * 4 8 12 16
		 * 
		 * */
		int n = 4;
		int arr[][] = new int[n][n];
		
		
		for(int i=0;i<n;i++) {
			int num = i+1;
			for(int j=0;j<n;j++) {
				arr[i][j]=num;
				num+=4;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%4d",arr[i][j]);
			}System.out.println();
		}
		
		//문제2. 숫자사각형
		/*입력된 수 n만큼 n행 n열의 형태로 아래와 같이 출력
		 * 4 
		 * 
		 * 1 2  3 4
		 * 2 4  6 8
		 * 3 6  9 12
		 * 4 8 12 16
		 * */
		
		int N = 4;
		int arr2[][] = new int[n][n];
		
		
		for(int i=0;i<N;i++) {
			int num2=i+1;
			for(int j=0;j<N;j++) {
				arr2[i][j]=num2;
				num2+=i+1;
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.printf("%4d",arr2[i][j]);
			}System.out.println();
		}
		
		
	}

}
