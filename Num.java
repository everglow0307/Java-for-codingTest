
public class Num {
	
	public static int getNum(int i) {
		int j=0;
		
		while(i>0) {
			if((i%10==3)||(i%10==6)||(i%10==9)) {
				j++;      // 일의자리 확인
				i /= 10;  // 십의자리 확인
			}
		}
		return j;
	}

	public static void main(String[] args) {

		//문제1. 입력된 수 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형 출력
		//4를 입력받은 경우
		/*1 2 3 4
		 *5 6 7 8
		 *9 10 11 12
		 *13 14 15 16
		 * */
		
		int inputNum = 4;
		
		for(int j=0;j<inputNum;j++) {
			for(int i=0;i<inputNum;i++) {
				System.out.printf("%3d",(i+1)+(j*inputNum));
			}System.out.println();
		}
		
		//문제2. 입력된 수 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형
		/*1  2  3  4
		 *8  7  6  5
		 *9  10 11 12
		 *16 15 14 13 
		 * 
		 * */
		int num = 4;
		int arr[][] = new int[num][num];
		
		for(int i=0;i<num;i++) {
			if(i%2==0) {
				for(int j=0;j<num;j++) {
					arr[i][j]=i*num+j+1;
				}
			}else {
				for(int j=0;j<num;j++) {
					arr[i][j]=i*num+num-j;
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		
		//문제3. 삼육구 게임
		//100까지 3,6,9가 들어가는 숫자는 짝을 출력
		//33일경우에는 짝짝 출력
		
		for(int i=1;i<=100;i++) {
			//3,6,9 몇번 들어가는지 구하는 static 메소드
			int cnt = getNum(i);
			
			//3,6,9가 안들어가면 그냥 숫자 출력하고,
			// 들어가면 짝출력
			if(cnt==0) {
				System.out.print(i+" ");
			}else {
				for(int j=0;j<cnt;j++) {
					System.out.print("짝");
				}
				System.out.print(" ");
			}
		}
		
		
		
		
	}

}
