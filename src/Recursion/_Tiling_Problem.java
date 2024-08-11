package Recursion;

public class _Tiling_Problem {
	public static int tilingProblem(int n) {//2x n floor
		// Base case
		if(n==0 || n==1) {
			return 1;
		}
		
		// kaam 
		//vertical choice ways
//		int fnm1=tilingProblem(n-1);
//		
//		//horizontal choice  ways
//		int fnm2=tilingProblem(n-2);
//		
//		//Total Ways
//		int total_Ways=fnm1+fnm2;
		
		return tilingProblem(n-1)+tilingProblem(n-2);
		
	}
	public static void main(String[] args) {
		System.out.println(tilingProblem(4));
	}

}
