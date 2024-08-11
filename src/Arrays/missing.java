package defaults;
import java.util.*;
public class missing {
	public static int findMissing(int arr[]) {
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
			
		}

		int sum2=0;
		for(int i=1;i<=7;i++) {
			sum2=sum2+i;
			
		}
		return sum2-sum1;
		
		
	}
	public static void main(String[] args) {
		int arr[]= {1,3,7,5,6,2};
		
//		int sum1=0;
//		for(int i=0;i<arr.length;i++) {
//			sum1=sum1+arr[i];
//			
//		}
//
//		int sum2=0;
//		for(int i=1;i<=5;i++) {
//			sum2=sum2+i;
//			
//		}
//		System.out.println(sum2-sum1);
		System.out.println(findMissing(arr));
	}

}
