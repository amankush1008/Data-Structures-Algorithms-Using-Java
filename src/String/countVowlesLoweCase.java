package string;

public class countVowlesLoweCase {
	public static int vowels(String str) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='e'||ch=='a'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
//			if(str.charAt(i)=='a') {
//				count++;
//			}
//			if(str.charAt(i)=='e') {
//				count++;
//			}
//			else if(str.charAt(i)=='i') {
//				count++;
//			}
//			else if(str.charAt(i)=='o') {
//				count++;
//			}
//			else if(str.charAt(i)=='u') {
//				count++;
//			}
		}
		return count;
		
		
	}
	public static void main(String[] args) {
		String str="aiouaiou";
		System.out.println(vowels(str));
		
		
	}

}
