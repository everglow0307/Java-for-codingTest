package codingTest.sorting;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin {

	public static void main(String[] args) {

		int[][] points = {{3,3},{5,-1},{-2,4}};
		int k = 2;
		
		int[][] answer = solve(points, k);
		
		int m = answer.length;
		int n = answer[0].length;
		
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(" [" + i + "][" + j + "] " + answer[i][j]);
				}
			}
	}

	public static int[][] solve(int[][] points, int k){
		
		
		Queue<int[]> q = new PriorityQueue<>((a,b) -> (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));
		
		int[][] res = new int[k][2];
		
		int index = 0;
		
		for(int[] point: points) {
			q.offer(point);
		}

		while(index<k) {
			res[index] = q.poll();
			index++;
		}
		
		return res;
	}
}
