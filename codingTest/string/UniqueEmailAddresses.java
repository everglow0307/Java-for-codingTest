package codingTest.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class UniqueEmailAddresses {
	
	public static void main(String[] args) {
		String[] emails = {"test.email+james@coding.com", "test.e.mail+toto.jane@coding.com", "testemail+tom@cod.ing.com", "test.email+james@coding.com"};
		
		int answer = solve(emails);
		
		System.out.println(answer);
	
		
		
	}
	
	public static int solve(String[] emails) {
		
		Set<String> test = new HashSet<>();
		
		for(String email : emails) {
			
			String local = localCheck(email);
			String domain = domainCheck(email);
			
			test.add(local+"@"+domain);
		}
				
		return test.size();
	}
	
	public static String localCheck(String email) {
	
		//规过1.
//		email = email.substring(0, email.indexOf("@"));
//		email = email.replace(".", "");
//		if(email.contains("+")) {
//			email = email.substring(0,email.indexOf("+"));
//		}
//		return email;
		
		
		//规过2
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<email.length(); i++) {
			
			if(email.charAt(i)=='.') 
				continue;
			if(email.charAt(i)=='+' || email.charAt(i)=='@') {
				break;
			}
			
			sb.append(email.charAt(i));
			
		}
		
		return sb.toString();
	}
	
	public static String domainCheck(String email) {
		return email.substring(email.indexOf("@")+1);
	}

}
