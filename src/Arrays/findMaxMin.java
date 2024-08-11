package DSA_Array;

import java.util.Arrays;

public class findMaxMin {
	static void maxMin(int []arr) {
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i =0;i<arr.length;i++) 
		{
//			min=Math.min(min, arr[i]);
//			max=Math.max(max, arr[i]);
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Minimum Element : "+min);
		System.out.println("Maximum ELement : "+max);
	}
	public static void main(String[] args) {
		int []arr= {4,233,142,45,56,89};
		maxMin(arr);
	}

}
