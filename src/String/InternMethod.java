package string;

public class InternMethod {
	public static void main(String[] args) {
		String str1=new String("Apna College");
		String str2=new String("Apna College");
		
		System.out.println(str1==str2); // This will Print False
		
		// Using Intern method
		String str3=new String("Apna College").intern();
		String s1="Apna College";
		String str4=new String("Apna College").intern();
		
		System.out.println(str3==s1); // This will Print True
	}

}
