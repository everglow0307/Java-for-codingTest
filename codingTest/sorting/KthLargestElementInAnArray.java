package codingTest.sorting;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInAnArray {

	public static void main(String[] args) {
		int[] nums = {2,3,1,5,6,4};
		int k = 2;
		
		System.out.println(solve_pq(nums, k));
	}
	
	public static int solve(int[] nums, int k) {
	
		Arrays.sort(nums);
		return nums[nums.length-k];
	}
	
	
	public static int solve_pq(int[] nums, int k ) {
		
		//ds
		Queue<Integer> pq = new PriorityQueue<>();
		
		/**
		 * ť������ FIFO�ε� priority Queue�� �켱������ ���� ������Ʈ�� ���� ������ �ڷᱸ��. 
		 * */
		for(int i: nums) {
			pq.offer(i);
			
			if(pq.size()>k) {
				pq.poll();
			}
		}
		
		return pq.peek();
	}

}
