import java.util.Scanner;

public class JavaAlgorithm4 {

	public static void main(String[] args) {

		//문제1. 입력된 수가 소수인지 판별하기
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//flag변수 선언
		boolean check = false;
		
		//소수인지 판별할 때 자기 자신의 수의 반을 넘어갔을 때 나누는 건 무의미 
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				check=true;
			}
		}
		
		if(check) {
			System.out.println(num+"은 소수가 아닙니다.");
		}else {
			System.out.println(num+"은 소수입니다.");
		}
		
		//문제2.입력된 수의 팩토리얼 구하기
		//5 입력받으면 5*4*3*2*1 = 120이 나오도록
		
		//입력숫자받기
		int num2 = sc.nextInt();
		
		//곱한 값을 저장할 변수
		int temp = 1;
		
		for(int i=1;i<=num2;i++) {
			temp *= i;
		}
		System.out.println(temp);
		
	}

}
