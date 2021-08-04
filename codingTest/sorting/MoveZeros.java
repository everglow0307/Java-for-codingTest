package codingTest.sorting;

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = {0};
		
		for(int answer : solve(nums)) {
			System.out.print(answer+" ");
		}
	}
	
	public static int[] solve(int[] nums) {

		int n = nums.length;
		int index = 0;
		
		for(int i=0; i<n ; i++) {
			if(nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			}
		}
		
		while(index<n) {
			nums[index] = 0;
			index++;
		}
		
		return nums;
	}
}
