
public class GCDorHCF {

	static int gcd(int i, int j) {
		int min = Math.min(i, j);
		for(int a =min; a>=1; a++) {
			if(i%a==0 && j%a==0) {
				return a;
			}
		}
		return 1;
		
	}
	public static void main(String[] args) {
		System.out.println(gcd(0, 10));
	}

}
