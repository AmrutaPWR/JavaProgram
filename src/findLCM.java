import java.util.Scanner;

public class findLCM {
	
	static int lcm(int i, int j) {
		int res = Math.max(i, j);
		try {
		while(true) {
			if(res%i==0 && res%j==0) {
			break;
		}
			res++;
		}
		return res;
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return res = -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = scan.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = scan.nextInt();
		int res = lcm(a,b);
		System.out.print("result " + res);
		
	}

}
