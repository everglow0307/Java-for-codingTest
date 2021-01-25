import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekjoonSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//백준 for문 
		
		//문제1
		//n값을 입력받고, 1부터 n까지 합을 출력한다.
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<n+1 ;i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		//문제2
		//빠른 입출력
		//첫줄에는 테스트 횟수를 입력받고, 그 이후부터는 두 정수를 입력받아
		// 두 정수의 합을 출력한다.
		//빠른 입출력을 할 때는 Scanner대신에 BufferedReader/BufferedWriter사용
		//Scanner는 정규식을 사용해서 알고리즘을 구현하기 때문에 속도가 느림.
		//BufferedReader로 직접 parsing하는 것이 속도가 빠르다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
	
	}

}
