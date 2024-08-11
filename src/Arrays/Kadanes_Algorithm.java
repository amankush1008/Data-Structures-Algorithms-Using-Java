package DSA_Array;

public class Kadanes_Algorithm {
	static int max(int[]arr) {
		int maxSoFar=Integer.MIN_VALUE;
		int maxEndinghere=0;
		
		for(int i =0;i <arr.length;i++) {
			maxEndinghere+=arr[i];
			if(maxSoFar < maxEndinghere) {
				maxSoFar=maxEndinghere;
			}
			if(maxEndinghere < 0) {
				maxEndinghere=0;;
			}
		}
		return maxSoFar;
	}
	public static void main(String[] args) {
		int[]arr= {-1, -2, -3, -4};
		
		System.out.println(max(arr));
		
	}

}
