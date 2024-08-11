package defaults;

public class linearSearch {
	public static int ls(int numbers[],int key) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==key) {
				return i;
			}
		}
	
		return -1;
	}
	
	public static void main(String[] args) {
		int numbers[]= {2,4,6,8,10,12,14,16};
		int key=15;
		int index=ls(numbers,key);
		if(index==-1) {
			System.out.println("Key Not found");
		}
		else {
		System.out.println("Index of "+key +" is "+index);
		
	}

}
}
