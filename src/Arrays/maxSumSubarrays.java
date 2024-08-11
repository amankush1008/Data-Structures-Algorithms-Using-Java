package defaults;

public class maxSumSubarrays {
	public static void sub(int numbers[]) {
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++) {
			int start=i;
			for(int j=i;j<numbers.length;j++) {
				currSum=0;
				int end=j;
				for(int k=start;k<=end;k++) {
					currSum+=numbers[k];
				}
				
				System.out.println(currSum);
				if(maxSum<currSum) {
					maxSum=currSum;
				}
				
			}
			System.out.println();
			
			
		}
		System.out.println("Max Sum Sub-Arrays : "+maxSum);
		
	}
	public static void main(String[] args) {
		int numbers[]= {1,-2,6,-1,3};
		sub(numbers);
	}

}