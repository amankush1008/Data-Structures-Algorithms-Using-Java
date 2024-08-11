package Recursion;

public class printNum_Increasing {
	public static void main(String[] args) {
		int n=10;
		printIncre(n);
	}
	
	public static void printIncre(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		printIncre(n-1);
		System.out.print(n+" ");
	}

}
