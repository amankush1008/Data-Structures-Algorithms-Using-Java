package sorting;

public class bubbleSort {
	public static void bubble(int arr[]) {
		for(int turn=0;turn<arr.length-1;turn++) {
			int swaps=0;
			for(int j=0;j<arr.length-1-turn ;j++) {
				
				if(arr[j]>arr[j+1]) {
					//swapping
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					//swaps++;
					
				}
				
			}
			
		}
		
	}
	public static void printarr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		bubble(arr);
		printarr(arr);
	}

}
