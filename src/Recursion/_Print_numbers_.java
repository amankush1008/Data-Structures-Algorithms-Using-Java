package Recursion;
//Print numbers from to n to 1 in decreasing orders using recusrion
public class _Print_numbers_ {
	public static void main(String[] args) {
		int n=10;
		printdec(n);
	}
	
	public static void printdec(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
		System.out.print(n+" ");
		printdec(n-1);
	}

}
