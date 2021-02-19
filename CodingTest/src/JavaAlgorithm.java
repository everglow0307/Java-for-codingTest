import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaAlgorithm {

	public static void main(String[] args) throws IOException {

		//문제1. 세자리수 2개 입력받고, 자리수를 거꾸로 해서 크기 비교하기
		/* 734  893 
		 * 
		 * 437 398 -> 437출력
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		N = Integer.parseInt(new StringBuilder().append(N).reverse().toString());
		M = Integer.parseInt(new StringBuilder().append(M).reverse().toString());
		
		/*StringBuilder().append(N)하면 int 타입의 N을 StringBuilder타입으로 변환. 
		 * StringBuilder에는 reverse()라는 메소드가 있음. 
		 * toString()을 통해 StringBuilder타입을 문자열로 변환해줌.
		 *그리고 나서 Integer.parseInt()로 int형으로 변환.
		 * */
		System.out.println(N>M?N:M);

		//문제1 방법2. BuffredReader이용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(A>B?A:B);
		
		//문제2. 백준 5622번 다이얼
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
	    int k = s.length();
	    int count = 0;
	    
	    for(int i=0;i<k;i++) {
	    	
	    	switch(s.charAt(i)) {
	    	
	    	case 'A': case 'B': case 'C':
	    	count += 3;
	    	break;
	    	
	    	case 'D': case 'E': case 'F':
	    	count += 4;
	    	break;
	    	
	    	case 'G': case 'H': case 'I':
	    	count += 5;
	    	break;
	    	
	    	case 'J': case 'K': case 'L':
	    	count += 6;
	    	break;
	    	
	    	case 'M': case 'N': case 'O':
	    	count += 7;
	    	break;
	    	
	    	case 'P': case 'Q': case 'R': case 'S':
	    	count += 8;
	    	break;
	    	
	    	case 'T': case 'U': case 'V':
	    	count += 9;
	    	break;
	    	
	    	case 'W': case 'X': case 'Y': case 'Z':
	    	count += 10;
	    	break;
	    	}
	    }
	    System.out.println(count);
		
	}

}
