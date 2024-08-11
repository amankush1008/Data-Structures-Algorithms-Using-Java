package string;

import java.util.Arrays;

public class arnagrams {
	public static void main(String[] args) {
		String str1="earth";
		String str2="heart";
		
		//convert into lowrcase
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		//first check if the lengths are the same
		if(str1.length()==str2.length()) {
			//convert strings into char array
			char[] str1charArray=str1.toCharArray();
			char[] str2charArray=str2.toCharArray();
			//sort the char array
			Arrays.sort(str1charArray);
			Arrays.sort(str2charArray);
			
			boolean result=Arrays.equals(str1charArray, str2charArray);
			if(result) {
				System.out.println(str1 + " and "+str2 +" are anagrams of each other.");
				
				}
			else {System.out.println(str1 + " and "+str2 +" are not anagrams of each other.");
			
				
			}
			
		}
		//in case lengths are not equal
		else {
			System.out.println(str1 + " and "+str2 +" are not anagrams of each other.");
			
			
			
		}
	
}

}

