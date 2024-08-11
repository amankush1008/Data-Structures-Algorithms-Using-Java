package DSA_Array;

public class rotateArrayby1 {
	//rotate array by one clockwise from end
	static void rotatebyOne(int[]arr) {
		int lastElement=arr[arr.length-1];
		
		for(int i = arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[0]=lastElement;

		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		rotatebyOne(arr);
	}
}
