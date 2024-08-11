package string;

public class functions {
	public static void main(String[] args) {
		String s1="Tony";
		String s2="Tony";
		String s3=new String("Tony");
		
		if(s1==s2) {
			System.out.println("Strings are equals");
		}
		else {
			System.out.println("Strings are not equals");
		}
		
		if(s1==s3) {
			System.out.println("Strings are equals");
		}
		else {
			System.out.println("Strings are not equals");
		}
		
		//we use Equals function for string 
		if(s1.equals(s3)) {
			System.out.println("Strings are equals");
		}
		else {
			System.out.println("Strings are not equals");
		}
	}

}
