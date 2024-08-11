package DSA_Array;

import java.util.Arrays;

public class Kth_Smallest {
//	Given an array arr[] and an integer k where k is smaller than 
//	the size of the array, the task is to find the kth smallest 
//	element in the given array. It is given that all array elements are distinct.
	
	static int kthSmallest(int[]arr,int k,int start,int end) {
		int count=0;
		int min=Integer.MIN_VALUE;
		Arrays.sort(arr,start,end+1);
		
		for(int i =start;i <= end;i++) {
			
			if(arr[i] > min){
				min=arr[i];
				count++;
				
				if(count == k) {
					break;
				}
			}
			
		}
		return min;
	}
	public static void main(String[] args) {
		int []arr= {7,10,4,20,15};
		int k=4;
		int start=0,end=4;
		System.out.println(kthSmallest(arr,k,start,end));
	}
}
