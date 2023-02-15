import java.util.Scanner;

public class reverseString {
//		static String r = "";
	
		static String reversestring (String s, String r,int i) {	
			
		if(i<0) {
			return r;
		}else {
		 r = reversestring(s,r+s.charAt(i), i-1);	
		}
		return r;
		}
		
		static boolean palindrome() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = scan.next();
		String p = reversestring(s,"", s.length()-1);
		System.out.println(p);
		if(s.equals(p)) {
		System.out.println("palindrome");
		return true;
	    }else {
	    	
		System.out.println("Not palindrome");
		return false;
	    }		
		}
		
	public static void main(String[] args) {
		
//		reverseString a = new reverseString();
		System.out.println(reversestring("prachi", "","prachi".length()-1 ));
		System.out.println(palindrome());
	}
	}
