package codingTest.string;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {
		String jewels = "z";
		String stones = "ZZ";
		
		int answer = solve(jewels, stones);
		System.out.println(answer);
	}
	
	public static int solve(String jewels, String stones) {
		
		char[] jewel = jewels.toCharArray();
		Set<Character> set = new HashSet<>();
		
		for(char je : jewel) {
			set.add(je);
		}
		
		int count = 0;
		
		for(int i=0; i<stones.length(); i++) {
			char c = stones.charAt(i);
			if(set.contains(c)) {
				count++;
			}
		}
		
		return count;
	}
}
