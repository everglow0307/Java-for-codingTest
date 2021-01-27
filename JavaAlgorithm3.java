import java.util.Scanner;

public class JavaAlgorithm3 {

	public static void main(String[] args) {
		
		//문제1.
		//대문자는 소문자로, 소문자는 대문자로
		String input = "helloWrolD";
		
		//문자열을 char배열로 만듦.
		char []arr;
		arr = input.toCharArray();
		System.out.println(arr);
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='a'&& arr[i]<='z') {
				arr[i]=(char)(arr[i]+('A'-'a')); //소문자~대문자
			}else if(arr[i]>='A'&&arr[i]<='Z') {
				arr[i] = (char)(arr[i]-('A'-'a'));
			}
		}
		System.out.println(arr);
		
		//문제2.
		//입력된 두 수의 최대공약수 구하기
		int num1, num2;
		num1 = 12;
		num2 = 18;
		
		int small;
		int big;
		
		if(num1>num2) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1; //최대공약수
		
		for(int i=1; i<=small ;i++) {
			if(big%i==0 && small%i ==0)
				gcd = i;
		}
		
		System.out.println(gcd);
	}
}
