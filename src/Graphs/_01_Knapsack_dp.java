package graphs;

public class _01_Knapsack_dp {
	public static int knapsack(int val[],int wt[],int capacity,int n) {
		if(capacity==0 || n==0) {
			return 0;
		}
		if(wt[n-1]<=capacity) {
			//include
			int ans1=val[n-1]+knapsack(val,wt,capacity-wt[n-1],n-1);
			
			//exlude
			int ans2=knapsack(val,wt,capacity,n-1);
			return Math.max(ans1, ans2);
		}
		else {
			return knapsack(val,wt,capacity,n-1);
		}
	}
	
	public static void main(String[] args) {
		int[]wt= {2,4 ,6,3};
		int [] val= {2,3,3,12};
		int capacity=8;
		
		System.out.println(knapsack(val,wt,capacity,val.length));
	}

}
