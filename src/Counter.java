import java.util.Scanner;

public class Counter {
	
	static int countDigits(int n) {
		int count = 0;
		while(n>0) {
			n= n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = s.nextInt();
		System.out.println(countDigits(number));
		
	}

}
