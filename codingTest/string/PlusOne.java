package codingTest.string;

public class PlusOne {

	public static void main(String[] args) {
	
		int[] digits = {1, 2, 3};
		int[] answer = solve(digits);
		for(int result: answer) {
			System.out.print(result+" ");
		}
	}
	
	public static int[] solve(int[] digits) {
		
		int n = digits.length-1;
		
		for(int i=n ; i>=0; i--) {
			digits[i]++;
			if(digits[i]<10) {
				return digits;
			}
			digits[i]=0;
		}
		
		int[] answer = new int[n+2];
		answer[0] = 1;
		
		return answer;
	}
}
