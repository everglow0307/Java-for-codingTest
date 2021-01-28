import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekjoonSum2 {

	public static void main(String[] args) throws IOException {

		//문제1. 두 정수를 입력받은 다음,  0을 입력받을 때까지 합을 출력한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			if(num1==0&&num2==0) {
				break;
			}else {
				sb.append(num1+num2).append("\n");
			}
		}
		System.out.println(sb);
		
		
		//문제2. 종료조건이 없이, 두 정수를 입력받고 합을 출력하기
		//입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때를 End of FIle(EOF)
		//일반 Scanner로 받으면 데이터를 입력안하면 NoSuchElementException예외 발생
		/*방법1. Scanner의 hasNextInt()메소드를 사용한다.
		 * - 그러나 이는 공백이나 엔터값을 받아도 예외가 발생하지 않음.
		 * - 문자열을 입력했을 때 InputMismatchException발생
		 * */
		
		//방법1. Scanner의 hasNextInt()
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
		scan.close();
		
		//방법2. BufferedReader에서 readLine으로 받고 null일 때 처리
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb2 = new StringBuilder();
		StringTokenizer st2;
		String str;
		
		while((str=br2.readLine())!=null) {
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb2.append(a+b).append("\n");
		}
		System.out.println(sb2);
		
		/*문제3. 0<=x<=99 x가 10보다 작으면 앞에 0붙여서 두 자리수 만들고, 각 자리의 숫자를 더한다.
		그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 
		26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 
		8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
		위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
		N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		*/
		Scanner scan2 = new Scanner(System.in);
		int num = scan2.nextInt();
		int tmp=num;
		int cnt =0;
		do {
			num = ((num%10)*10)+(((num/10)+(num%10))%10);
			cnt++;
		}while(tmp!=num);
		
		System.out.println(cnt);
	}

}
