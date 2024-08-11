package Recursion;

public class fibnacci {
	public static void main(String[] args) {
		int n=3;
		System.out.println(fib(n));
		
	}
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int fnm1=fib(n-1);
		int fnm2=fib(n-2);
		int fibN=fnm1+fnm2;
		return fibN;
		
	}

}
