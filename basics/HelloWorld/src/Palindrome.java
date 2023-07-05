import java.util.*;

public class Palindrome {
	String s1, s2;
	
	Palindrome(String s1, String s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	
	boolean isPalindrome() {
		String reverse = "";
		int n = s1.length();
		
	    for (int i = n - 1; i >= 0; i-- ) {
	    	reverse = reverse + s1.charAt(i);  
	    }
	    return s2.equals(reverse);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter s1: ");
		String s1 = sc.next();
		System.out.print("Enter s2: ");
		String s2 = sc.next();
		
		Palindrome p1 = new Palindrome(s1, s2);
		System.out.println(p1.isPalindrome());
	}
}
