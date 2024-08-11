package DSA_Array;

public class MinimumJumps {
	static int jumps(int []arr,int n) {
		int jump=0;
		int sum=0;
		for(int i = 0; i < n;i++) {
			if(sum <= n) {
				sum+=arr[i];
				jump++;
			}
		}
		return jump;
	}
	public static void main(String[] args) {
		int []arr= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n=arr.length;
		
		System.out.println(jumps(arr,n));
	}

}
