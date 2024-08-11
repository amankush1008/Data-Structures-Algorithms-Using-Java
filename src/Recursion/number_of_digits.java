package Recursion;

public class number_of_digits {
	public static int countDigits(int n) {
		if(n==1) {
			return 1;
		}
		return 1+countDigits(n/10);
	}
	public static void main(String[] args) {
		int n=12345;
		System.out.println(countDigits(n));
		
	}

}
