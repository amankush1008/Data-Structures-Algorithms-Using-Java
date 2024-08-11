package hashing;
import java.util.*;
public class nonRepeating {
	
	public static int nonRepeating(int []arr, int n) {
		Map<Integer,Integer> freq=new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(freq.containsKey(arr[i])) {
			freq.put(arr[i], freq.get(arr[i])+1);
			}
			else {
				freq.put(arr[i], 1);
			}
		}
		
		//traverse
		int count=0;
		for(int i=0;i<n;i++) {
			if(freq.get(arr[i])==1) {
				count++;}
			}
		return count;
		
	}
	public static void main(String[] args) {
		int []arr= {1,1,2,2,3,3,4,5,6,7};
		int n=arr.length;
		System.out.println(nonRepeating(arr,n));
		
	}

}
