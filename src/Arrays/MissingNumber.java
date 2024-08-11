package DSA_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class MissingNumber {
	static int missing(int []arr) {
		HashSet<Integer> set= new HashSet<Integer>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		int min = Collections.min(set);
		int max=Collections.max(set);
		
		for(int i = min; i <=max;i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		return -1;
	}
	
	//xor
	
	public static int findMissingNumber(int[] arr) {
	    int xor = 0;
	    for (int num : arr) {
	        xor ^= num;
	    }
	    for (int i = 1; i <= arr.length + 1; i++) {
	        xor ^= i;
	    }
	    return xor;
	}
	
	//math formula
	public static int MissingNumber(int[] arr) {
	    int n = arr.length + 1;
	    int sum = (n * (n + 1)) / 2;
	    int actualSum = 0;
	    for (int num : arr) {
	        actualSum += num;
	    }
	    return sum - actualSum;
	}
	
	public static void main(String[] args) {
		int []arr= {3, 4, 5, 6, 7, 8, 10};
		
//		System.out.println(missing(arr));
		System.out.println(MissingNumber(arr));
	}
}
