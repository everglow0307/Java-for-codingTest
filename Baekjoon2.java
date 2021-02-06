import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon2 {

	public static void main(String[] args) throws IOException {

		//문제1. 아스키코드로 변환하기
		Scanner scan = new Scanner(System.in);
		
		char something = scan.next().charAt(0);
		System.out.println(something);
		
		//2번째 방법
		/*java는 String을 처리할 때 내부에서 utf-16 be인코딩으로 문자열을 저장하고,
		 * 송수신에서 직렬화가 필요한 경우 utf-8을 사용하여 문자열을 입출력할 때에만 사용자가
		 * 지정한 인코딩 값 또는 운영체제의 기본인코딩 값으로 문자열을 인코딩한다.
		 * 
		 * -utf-8과 utf-16은 bute구성 방식에 차이가 있다.
		 * utf-8의 경우 영어의 경우 1byte, 한글의 경우 3byte를 사용한다. 
		 * 그러나 utf-16은 거의 모든 문자가 2byte로 구성된다.
		 * 
		 *System.in에서 in은 System클래스에서 inputStream 타입의  필드이다.
		 *read()메소드는 데이터를 입력받을 때 1바이트 단위로 읽어들인다.
		 *때문에 2byte이상으로 구성되있는 인코딩을 사용할 경우 1byte값만 읽어들이고, 나머지는
		 *스트림에 남아있는다.
		 *
		 * */
		int a = System.in.read();
		System.out.print(a);
		
		//문제2. 첫째줄에는 숫자개수가 주어지고,
		/*둘째줄에는 개수에 맞는 숫자들이 공백없이 주어진다. 
		 * 출력값은 이 숫자들을 모두 더한 값이 된다. 
		 * */
		int num = scan.nextInt();
		String nums = scan.next();
		
		int sum=0;
		
		for(int i=0;i<num;i++) {
			sum += nums.charAt(i)-'0';
		}
		
		System.out.println(sum);
		
		//문제2-방법2.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); // N입력만 받기
		
		int sum2 = 0;
		
		//getBytes()는 문자열을 byte배열로 반환!!
		for(byte value: br.readLine().getBytes()) {
			sum2 += (value = '0');
		}
		System.out.print(sum2);
	}

}
