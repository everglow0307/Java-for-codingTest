import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon {

	public static void main(String[] args) throws IOException {
		
		 // 문제1.
		/*첫째줄에는 시험과목개수가 입력되고, 둘째줄에는 시험점수가 입력 된다.
		 * 이들 중 최고점수가 M이라고 했을 때, 모든 점수를/M*100으로 고쳐서 
		 * 평균을 출력한다.*/
		Scanner sc = new Scanner(System.in);
	
		//과목개수를 입력받고 시험점수를 저장할 배열 선언(오차범위를 위해 double형)
		double avg[] = new double[sc.nextInt()];
		
		for(int i=0;i<avg.length;i++) {
			avg[i]=sc.nextDouble();
		}
		sc.close();
		
		//최댓값을 찾기 위해 배열을 정렬하고, 합을 구하기 위해 변수 선언
		double sum = 0;
		Arrays.sort(avg);
		
		
		for(int i=0;i<avg.length;i++) {
			sum += ((avg[i]/avg[avg.length-1])*100);
		}
		System.out.print(sum/avg.length);
		
		//방법2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1;
		double sum2=0.0;
		
		for(int i=0;i<N;i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value>max) {
				max = value;
			}
			sum+=value;
		}
		System.out.println(((sum/max)*100.0)/N);
		
		//문제2. 첫째줄에 테스트 케이스의 개수가 주어짐.
		/* 각 테스트들은 한 줄로 이루어져 있고, O와 X만으로 이루어진 문자열로 점수를 구하는 프로그램
		 * O가 연속적일 경우 1+2+3..으로 합이 구해진다.
		 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		 * */
		
		//테스트 케이스 개수 만큼 문자열 배열 선언
			//배열 이용하기!
		String arr[] = new String[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next(); 
		}
		sc.close();
		
		
		for(int i=0; i<arr.length ;i++) {
			int cnt = 0; //연속횟수
			int sum3 = 0; //누적 합산
			
			//문자열 배열에 저장된 값을 charAt으로 가져와 아스키코드로 비교할 수 있도록!
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum3 += cnt;
			}
			System.out.println(sum3);
		}
	}

}
