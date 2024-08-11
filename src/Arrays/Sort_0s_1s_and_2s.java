package DSA_Array;

import java.util.Arrays;

public class Sort_0s_1s_and_2s {
	
	static void sort(int[] arr,int n) {
		
		int c0=0;
		int c1=0;
		int c2=0;
		
		for(int i =0; i <arr.length;i++) {
			if(arr[i]==0)c0++;
			if(arr[i]==1)c1++;
			if(arr[i]==2)c2++;
		}
		
		for(int i = 0; i < n;i++) {
			if( i < c0)arr[i]=0;
			
			else if( i >= c0 && i <= c0+c1 )arr[i]=1;
			
			else {arr[i]=2;}
		}
		
		
	}
	public static void main(String[] args) {
		int arr[]= {0,2,1,2,0};
		int n=arr.length;
		
		sort(arr,n);
		
		for(int i =0;i<n;i++) {
		System.out.print(arr[i]+ " ");
	}
	
	}
}
