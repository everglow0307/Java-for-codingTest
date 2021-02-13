package codingTest;

public class JavaAlgorithm15 {

	public static void main(String[] args) {

		//문제1.n을 입력받아 별 출력하기
		int N = 5;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		//문제2. 
		/* *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 * */
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=N;k>i;k--) {
				System.out.print("*");
			}System.out.println();
		}
		
		//문제3. 
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i<N-(j+1))
				System.out.print(" ");
				else
				System.out.print("*");
			}System.out.println();
		}
	}

}
