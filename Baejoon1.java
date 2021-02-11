package codingTest;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baejoon1 {

	public static void main(String[] args) {

		//문제1. 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된
		/*알파벳이 무엇인지 알아내는 프로그램 작성하시오.
		 * */
		Scanner in = new Scanner(System.in);
		int arr[] = new int[26]; //영문자 개수 26
		String s = in.next();
		
		//65는 A,90은 Z, 97은 a, 122은 z
		for(int i=0;i<s.length();i++) {
			if(65<=s.charAt(i)&&s.charAt(i)<=90) { //대문자일 경우
				arr[s.charAt(i)-65]++;  //해당 인덱스의 값 1 증가
				//s.charAt(i)-65을 해주는 이유:
				/*예를 들어 s.charAt(i)==B일경우,
				 * 66-65하면 1로 B알파벳이 1번째에 있음을 알려주기 위함.(0번째는 A)
				 * */
			}else { //소문자일 경우
				arr[s.charAt(i)-97]++;
			}
		}
		
		int max = 0;  //가장 많은 알파벳 수 저장
		char ch = '?'; //해당 알파벳 저장
		
		for(int i=0;i<26;i++) {
			if(arr[i]>max) {
				max = arr[i];
				ch = (char)(i+65); //대문자로 출려해야 하니까 65더하기 또는 'A'더하기
			}else if(arr[i]==max) {
				ch='?';    //최댓값이 중복되는 알파벳이 여러개일 때
			}
		}
		
		System.out.println(ch);
		
		//문제2.
		/*영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어짐. 이 문자열에는 몇 개의 단어가 있을까?
		 * 공백 기준으로 단어 개수 세기
		 * */
		String sentence = in.nextLine();
		
		//st에 공백을 기준으로 나눈 토큰들을 st에 저장
		StringTokenizer st = new StringTokenizer(sentence," ");
		
		//countTokens()는 토큰의 개수를 반환
		System.out.println(st.countTokens());
	}

}
