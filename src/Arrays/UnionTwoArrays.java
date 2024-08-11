package DSA_Array;

import java.util.HashSet;

public class UnionTwoArrays {
	static void union(int []arr1,int[]arr2) {
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int num:arr1) {
			set.add(num);
		}
		for(int num :arr2) {
			if(!set.contains(num)) {
				set.add(num);
			}
		}
		System.out.println("Union of Two Arrays Operations : "+ set.size());
		System.out.println("All Distinct Element : "+set.toString()+" ");
	}
	
	//intersection
	static void intersection(int []arr1,int[]arr2) {
		HashSet<Integer> set1=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();
		
		HashSet<Integer> intersection=new HashSet<Integer>();


		for(int num:arr1) {
			set1.add(num);
		}
		for(int num:arr2) {
			set2.add(num);
		}
		int count=0;
		for(int x:set1) {
			if(set1.contains(x) && set2.contains(x)) {
				intersection.add(x);
			}
		}
		System.out.println("Number of Elements : "+intersection.size());
		System.out.println("Elements Present in both "+intersection.toString());

	}
	
	//Union & Intersection
	static void UnionInter(int[]arr1,int[] arr2) {
		HashSet<Integer> set1=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();
		
		for(int num:arr1) {
			set1.add(num);
		}
		for(int num:arr2) {
			set2.add(num);
		}
		
		HashSet<Integer> union=new HashSet<Integer>(set1);
		union.addAll(set2);
		
		System.out.println("Union : "+union);
		
		HashSet<Integer> intersection=new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		
		System.out.println("intersection : "+intersection);
		
	}
	
	public static void main(String[] args) {
		int []arr1= {85, 25,1,1, 33,32, 54, 6,69};
		int []arr2= {85, 23,1 ,25};
		
//		union(arr1,arr2);
//		System.out.println();
//		intersection(arr1,arr2);
//		System.out.println();
		UnionInter(arr1,arr2);
	}

}
