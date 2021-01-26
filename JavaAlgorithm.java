import java.util.Scanner;

public class JavaAlgorithm {

	public static void main(String[] args) {
		
		//문제1. 최빈수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 숫자값 10번 무작위로 입력 받기
		int []inputNum = new int[10];
		for(int i=0;i<10;i++) {
			inputNum[i]=sc.nextInt();
		}
		
		//사용자 input
		// 1 2 2 3 1 4 2 2 4 3
		//1: 2번
		//2: 4번  ->최빈수
		//3: 2번
		//4: 2번
		
		int []mode = new int[10];
		
		//index -> 출현한 수
		//index값 -> index(출현한수)가 몇번나왔는지 저장하는 용도
		
		//mode[3] = 5, => 3번 숫자가, 5번 출현했다.
		
		//inputNum => 1 2 2 3 1 4 2 2 4 3
		//inputNum[0]~inputNum[9]의 값들이
		//mode의 인덱스(사용자가 입력한 숫자)가 되고
		//mode의 값이 (사용자가 입력한 숫자)의 횟수가 된다.
		for(int i=0;i<10;i++) {
			mode[inputNum[i]]++;
		}
		
		int modeNum = 0; //최빈수
		int modeCnt = 0; //최빈수가 나온 횟수
		
		for(int i=0;i<10;i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는 "+modeNum+"이고, cnt:"+modeCnt);
		
		
	}

}
