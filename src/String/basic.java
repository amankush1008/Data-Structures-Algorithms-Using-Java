package string;

import java.util.Scanner;

public class basic {
	
	public static void printLetters(String str3) {
		for(int i=0;i<str3.length();i++) {
			System.out.print(str3.charAt(i)+"");
			
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str="XYX";
		//System.out.println(str);
		String str2=new String("XYX");
		//System.out.println(str2);
		String firstname="Aman";
		//System.out.println(firstname);
		String lastname="Kushwaha";
		
		// concetenation
		String str3=firstname +" "+lastname; 
		System.out.println(str3);
		//lenght fucntion
		System.out.println(str3.length());
		//charAt function
		System.out.println(str3.charAt(3));
		System.out.println();
		
		printLetters(str3);
		
		
		

		
		
	}
	

}
