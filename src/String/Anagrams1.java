package string;

import java.util.Arrays;

public class Anagrams1 {
	public static void main(String[] args) {
		String str1="qrace";
		String str2="careq";
		
		// convert into toLowercase
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		//check length of strings
		if(str1.length()==str2.length()) {
			//convert string into char ARray
			char[] str1CharArray=str1.toCharArray();
			char[] str2CharArray=str2.toCharArray();
			
			// sort the char array
			Arrays.sort(str1CharArray);
			Arrays.sort(str2CharArray);
			//
			//check the sorted char arrays are equal
			boolean result=Arrays.equals(str1CharArray, str2CharArray);
			if(result) {
				System.out.println(str1 +" and "+str2+" are Anagrams of the each other");
			}
			else {
				System.out.println(str1 +" and "+str2+" are not Anagrams of the each other");
				
			}
		}
		else {
			System.out.println(str1 +" and "+str2+" are not Anagrams of the each other");
			
		}
				
		
	}

}
