package defaults;

public class largestNumber {
	public static int getLargest(int number[]) {
		
			int largest=Integer.MIN_VALUE;  //Minus Infinity
			for(int i=0;i<number.length;i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
		}
		return largest;
	}
	
	
	public static void main(String[] args) {
		int number[]= {1,2,4,58,8,34,7};
		System.out.println("Largest Number is : "+getLargest(number));
		
		
		}
		
		
	}


