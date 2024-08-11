package DSA_Array;

import java.util.Stack;

public class reverseString {
	static String reverse(String str) {
		String newStr="";
		for(int i = str.length()-1; i>=0;i--) {
			newStr+=str.charAt(i);
		}
		return newStr;
	}
	public static String stringrev(String str) {
		Stack<Character>s1=new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			s1.push(str.charAt(i));
			
		}
		String rev="";
		while(!s1.isEmpty()) {
			rev+=s1.pop();
		}
		return rev;
	}
	public static void main(String[] args) {
		String str="Aman Kushwaha";
		
		System.out.println(stringrev(str));
	}

}
