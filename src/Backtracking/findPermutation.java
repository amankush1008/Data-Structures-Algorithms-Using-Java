package backtracking;

public class findPermutation {
	public static void perm(String str,String ans) {
		//base case
		if(str.length()==0) {
			System.out.println(ans);
			return;
			
		}
		//recurion
		for(int i=0;i<str.length();i++) {
			char curr=str.charAt(i);
			//remove i char
			String Newstr=str.substring(0,i)+str.substring(i+1);
			perm(Newstr,ans+curr);
		}
				
		
	}
	public static void main(String[] args) {
		String str="abc";
		perm(str,"");
		
	}

}
