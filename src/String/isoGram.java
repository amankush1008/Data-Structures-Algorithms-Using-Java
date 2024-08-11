package string;

import java.util.Arrays;
import java.util.Scanner;

public class isoGram {
	public static boolean isIsogram(String str) {
		str=str.toLowerCase();
		int len=str.length();
		
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<len-1;i++) {
			if(arr[i]==arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String str=sc.nextLine();

		System.out.println(isIsogram(str));
	}
	
}
