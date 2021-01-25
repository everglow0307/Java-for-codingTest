
public class SequenceMain {

	public static void main(String[] args) {

	//알고리즘 2. 피보나치 수열 문제	
		
		//방법1. 배열이용하여 풀기
		int []arr = new int[100];
		
		//An = An-1 + An-2; n>=3
		//a1 =1, a2 =1
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<100 ;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i=1; i<=10; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//방법2. 
		int prevPrevNum = 1; //An-2
		int prevNum = 1;	//An-1
		System.out.print(prevPrevNum+" ");
		System.out.print(prevNum+" ");
		
		for(int i=3;i<=10;i++) {
			int nNum = prevPrevNum+prevNum;
			System.out.print(nNum+" ");
			
			prevPrevNum=prevNum;
			prevNum=nNum;
		}
		
	}

}
