import java.util.Arrays;
import java.util.Scanner;

public class BaekjoonString {

	public static void main(String[] args){
		
		//문제1.알파벳찾기
		/*알파벳 소문자로 이루어진 단어 s가 주어진다. 
		 * 각각의 알파벳에 대해 단어에 포함되어 있으면 처음 등장하는 위치를 반환하고,
		 * 포함되어 있지 않은 경우에는 -1을 출력 
		 * */
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		//배열 사용하기! -1값으로 초기화하기(알파벳수:26)
		int arr[] = new int[26];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
		
		//word를 charAt()으로 char에 집어넣고, 인덱스를 char-'a'를 사용해 알파벳 위치를 가리키게 한다.
		// 배열값에는 단어에서 해당 알파벳이 위치한 값을 넣는다.
		for(int i=0;i<word.length();i++) {
			char alph = word.charAt(i);
			
			//단어안에 똑같은 알파벳이 있을 수 있기 때문에 -1일 경우만 입력
			if(arr[alph-'a']==-1) {
				arr[alph-'a']=i;
			}
		}
		
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
		//문제2.테스트 수를 입력받고, 테스트 케이스 수만큼. 
		/*반복할 횟수와 반복할 문자열을 입력받는다.
		 *반복횟수에 맞게 문자열의 각 문자들을 반복해서 출력한다.
		 * */
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			
			//반복횟수 입력
			int repeat = scan.nextInt();
			String some = scan.next(); //nextLine()은 안됨.
			
			for(int j=0;j<some.length();j++) {
				for(int k=0;k<repeat;k++) {
					System.out.print(some.charAt(j));	
				}
			}
			System.out.println();
			
		}
	}

}
