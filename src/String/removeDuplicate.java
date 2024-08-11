package string;

public class removeDuplicate {
	static String removeString(String str) {
		int i=0;
		int j=0;
		
		String newStr="";
		while(j<str.length()) {
			if(str.charAt(i)==str.charAt(j)) {
				j++;
			}
			
			else if(str.charAt(j)!=str.charAt(i)|| j==str.length()-1) {
					newStr+=str.charAt(i);
					i=j;
					j++;

			}
		}
		newStr+=str.charAt(j-1);
		return newStr;
	}
	public static void main(String[] args) {
		String str="aabb";
		System.out.println(removeString(str));
	}

}
