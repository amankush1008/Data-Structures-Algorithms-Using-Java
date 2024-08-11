package Arrays;

import java.util.Arrays;

public class Freq_SortedArray {
	static void freq(int arr[],int n) {
		Arrays.sort(arr);
		int freq=1;
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[i-1]) {
				freq++;
			}
			else {
				System.out.println("Frequency of "+arr[i-1]+" is "+freq);
				//update Frew
				freq=1;
			}
			
		}
		System.out.println("Frequency of "+arr[n-1]+" is "+freq);
	}
	public static void main(String[] args) {
		int arr[]= { 1, 1, 1, 2, 3, 3, 5, 5,
                8, 8, 8, 9, 9, 2,10 ,10};
		int n=arr.length;
		freq(arr,n);
	}

}
