import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekjoonN {

	public static void main(String[] args) throws IOException {
		
		//문제1. 자연수 n을 입력받고, n부터 1까지 한 줄에 하나씩 출력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=N;i>0;i--) {
			System.out.println(i);
		}
		
		//문제2. 두 정수 A와 B를 입력받은 다음, A+B를 출력(테스트횟수 입력받고!)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//텍스트 횟수 입력받기
		int n = Integer.parseInt(br.readLine());
		
		//StringBuilder이용
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
		//두 정수 입력받고, StringTokenizer로 공백기준으로 구분해서 StringBuilder에 저장
		for(int i=1;i<n+1;i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
		}
		
		br.close();
		
		//StringBuilder에 저장된 값 출력
		System.out.println(sb);
	}

}
