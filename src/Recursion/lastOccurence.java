package Recursion;

public class lastOccurence {

	public static void main(String[] args) {
		int arr[]= {1,4,7,6,12,13,9,34,5,24,6,11,23};
		System.out.println(LastOcc(arr,6,0));
	}
	public static int LastOcc(int arr[],int key,int i) {
		
		if(i==arr.length) {
			return -1;
		}
		int isFound=LastOcc(arr,key,i+1);
		if(isFound ==-1 && arr[i]==key) {
			return i;
		}
		return isFound;
	}

}