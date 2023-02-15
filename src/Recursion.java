import java.util.Scanner;

public class Recursion {
	
	static String reverse(String s, String r, int i) {
		if(i<0) {
			return r;
		}else {
			return reverse(s, r+s.charAt(i), i-1);
		}
	}
	
	static boolean isPalindrome(String s, int i, int j) {
		if(s.charAt(i) != s.charAt(j)) {
			return false;
		}
		if(j<=i) {
			return true;
		}
		return isPalindrome(s, i+1, j-1);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = scan.next();
		System.out.println(reverse(s, "", s.length()-1));
		System.out.println(isPalindrome(s,0, s.length()-1));

	}

}
