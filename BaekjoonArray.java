import java.util.Scanner;

public class BaekjoonArray {

	//문제2. 정수 n개가 주어졌을 때, n개의 합을 구하는 함수구현 
	
	public long sum(int[] a) {
		long sum = 0; // a배열 정수 합 변수
		
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	//문제3. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의.
	public static int d(int number) {
		int sum = number;
		
		while(number!=0) {
			sum = sum + (number % 10); //첫째 자리수
			number = number/10;			//10을 나누어 첫 째 자리를 없앤다.
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		//문제1. 첫째줄에는 테스트 케이스의 개수가 주어짐
		/*둘째 줄 부터는 학생 수를 입력받고, 그에 맞게 점수가 주어진다.
		 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째자리까지 출력한다.
		*/
		
		Scanner scan = new Scanner(System.in);
	
		int[] arr;
		
		//테스트 케이스의 개수를 입력받기
		int testcase = scan.nextInt();
		
		for(int i=0;i<testcase;i++) {
			int students = scan.nextInt(); //학생 수 입력받기
			arr = new int[students];
			
			double sum = 0; //성적 누적 합 변수
			
			//성적 입력부분
			for(int j=0;j<students;j++) {
				int score = scan.nextInt(); //성적 입력
				arr[j]=score;
				sum+=score; //성적 누적 합
			}
			
			double avg = (sum/students);
			double count = 0; //평균 넘는 학생 수 변수
			
			//평균 넘는 학생 비율 찾기
			for(int j=0;j<students;j++) {
				if(arr[j]>avg) {
					count++;
				}
			}
			
			//%출력할때 %%두개써줘야 한다. (소수f, 정수d)
			System.out.printf("%.3f%%\n",(count/students)*100);
		}
		scan.close();
	
		//문제3. 
	
		boolean[] check = new boolean[10001]; //1부터 10000까지이므로
		
		
		for(int i=1;i<100001;i++) {
			int n = d(i);
			
			//10000이 넘는 수는 필요가 없음.
			if(n<10001) {
				check[n]=true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<10001;i++) {
			if(!check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

}
