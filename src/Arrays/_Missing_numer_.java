package defaults;

import java.util.Scanner;

public class _Missing_numer_ {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array size:");
//		int n=sc.nextInt();
//		int []arr=new int[n];
//		System.out.println("Enter array elements:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextInt();
//		}
		int arr[]= {13,10,11,14};
		
		
		int actualSum=0;
		for(int x:arr) {
			actualSum += x;
		}
		
		int min=arr[0];
		for(int x:arr) {
			if(x<min) {
				min=x;
			}
		}
		//{ 13,10,11,14 }->   min=10
		int expectedSum=min;
		for(int x=1;x<=arr.length;x++) {
			expectedSum = expectedSum +(min+x);
		}
		
		int missingValue=expectedSum-actualSum;
		System.out.println("Missing value: "+missingValue);
	}

}
