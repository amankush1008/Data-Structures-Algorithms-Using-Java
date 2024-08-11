package Recursion;

public class power_XN_logn {
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
//		if(n%2==0) {
//			return (power(x,n/2))*(power(x,n/2));
//		}
//		else {
//			return x*(power(x,n/2))*(power(x,n/2));
//		}
		
		int halfPowerSq=power(x,n/2)*power(x,n/2);
		
		if(n%2!=0) {
			halfPowerSq=x*halfPowerSq;
		}
		
		return halfPowerSq;
	}
	public static void main(String[] args) {
		System.out.println(power(2,10));
	}

}
