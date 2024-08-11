package defaults;

public class trapping_Rainwater {
	
	public static int trapped(int height[]) {
		int n=height.length;
		
		int left[]=new int[n];
		left[0]=height[0];
		for(int i=1;i<n;i++) {
			left[i]=Math.max(height[i], left[i-1]);
			
		}
		int right[]=new int[n];
		right[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(height[i], right[i+1]);
			
		}
		
		int trappedWater=0;
		for(int i=0;i<n;i++) {
			int waterlevel=Math.min(left[i], right[i]);
			trappedWater+=waterlevel-height[i];
		}
		return trappedWater;
		
		
	}
		
	public static void main(String[] args) {
		
		int height[]= {4,1,0,6,3,2,5};
		System.out.println("Trapped Water is : "+trapped(height));
	}

}
