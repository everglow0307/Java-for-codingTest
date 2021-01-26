
public class JavaAlgorithm2 {

	public static void main(String[] args) {
		//문제. 10진수를 2진수로 변환하시오
		
		//2진수로 변환할 10진수 값
		int inputNum = 19;
		//나머지 값을 저장할 배열 선언
		int bln[] = new int[100];
		
		/*
		 * 19/2  9...1
		 * 9/2   4...1
		 * 4/2   2...0
		 * 2/2   1...0
		 * 1/2   0...1
		 * 
		 * 010011 => 19
		 * */
		
		int i=0;
		int mok = inputNum;
		
		//몫이 0이 될때까지 배열에 나머지값 저장
		while(mok>0) {
			bln[i] = mok%2;
			mok /= 2;
			i++;
		}
		
		//마지막 나머지값을 저장하고, 인덱스값이 1++됐기 때문에 빼줘야함.
		//bln[i]값에는 아무값도 없기때문에
		i--;
		
		//가장 마지막에 저장한 나머지값부터 차례대로 출력
		for(;i>=0;i--) {
			System.out.print(bln[i]);
		}
	}

}
