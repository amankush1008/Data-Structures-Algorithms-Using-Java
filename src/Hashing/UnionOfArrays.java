package hashing;


import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    public static int findUnionSize(int []a,int []b) {
    	Set<Integer> UnionSet=new HashSet<>();
    	
    	//add elements from array a
    	for(int num:a) {
    		UnionSet.add(num);
    	}
    	
//    	add elements from array b if they are not present in unionset
    	for(int num:b) {
    		if(!UnionSet.contains(num)) {
    			UnionSet.add(num);
    		}
    	}
    	return UnionSet.size();
    	
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};

        int unionSize = findUnionSize(a, b);
        System.out.println("Number of elements in the union: " + unionSize); // Output: 5
    }
}
