package codingTest.string;

public class LicenseKeyFormatting {
	
	public static void main(String[] args) {
		String s = "8F3Z-2e-9-w"; 
		int k=4;
		
		System.out.println(solve(s,k));
	}

	public static String solve(String s, int k) {
	
		s = s.replace("-", "");
		s = s.toUpperCase();
		
		StringBuilder sb = new StringBuilder(s);
		int len = sb.length();
		
		for(int i=k; i<len ; i=i+k) {
			sb.insert(len-i, '-');
		}
		
		return sb.toString();
	}
}
