package Recursion;

public class _factorial {
	public static void main(String[] args) {
		int n=5;
		System.out.println(fact(5));
	}
	public static int fact(int n) {
		
		if(n==0) {
			return 1;
		}
		int fnm1=fact(n-1);
		//int fn=
		return n*fact(n-1);
	}

}
