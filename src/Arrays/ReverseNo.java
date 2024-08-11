package DSA_Array;

public class ReverseNo {
	static int revNum(int num) {
		int rev=0;
		while(num > 0) {
			int rem=num%10;
			rev=rev * 10 + rem;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int num=98754;
		
		System.out.println(revNum(num));
		
	}

}
