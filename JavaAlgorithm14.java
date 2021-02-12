package codingTest;

public class JavaAlgorithm14 {

	public static void main(String[] args) {

		//문제1.입력된 숫자의 개수 출력
		int n = 421314218;
		
		int arr[] = new int[10]; // 0~9입력된 수를 카운팅하는 배열
		
		//입력숫자를 하나씩 출력하기 위해선 10으로 나눈 나머지
		while(n>0) {
			arr[n%10]++;
			n/=10;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+": "+arr[i]);
		}
		
		//문제2. 구구단 시작 s부터 f단까지 입력받아 출력하기
		int s=2;
		int f=3;
		
			for(int j=1;j<10;j++) {
				for(int dan=s;dan<=f;dan++) {
					System.out.printf("%2d * %2d = %3d",dan,j,dan*j);	
				}
				System.out.println();
			}
		
	}

}
