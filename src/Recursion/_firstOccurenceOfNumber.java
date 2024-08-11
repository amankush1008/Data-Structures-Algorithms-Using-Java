package Recursion;

public class _firstOccurenceOfNumber {
	public static void main(String[] args) {
		int arr[]= {1,4,7,12,13,9,34,5,24,6,11,23};
		System.out.println(FirstOcc(arr,24,0));
	}
	public static int FirstOcc(int arr[],int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
		return FirstOcc(arr,key,i+1);
	}

}
