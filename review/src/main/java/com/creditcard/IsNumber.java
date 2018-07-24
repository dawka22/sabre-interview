package main.java.com.creditcard;

public class IsNumber {
	
	public static boolean check(String number) {
		
		for(char ch : number.toCharArray()) {
			if(!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;	
	}
}
