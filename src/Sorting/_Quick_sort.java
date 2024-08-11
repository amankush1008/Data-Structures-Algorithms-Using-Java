package sorting;

public class _Quick_sort {
	
public static void quickSort(int arr[],int lower, int upper) {
	if (lower < upper) {
		int pivot, left, right;
		pivot = lower;
		left = lower + 1;
		right = upper;
		while (left <= right) {
			while (left <= right && arr[left] <= arr[pivot]) {
				left++;
			}
			while (right >= left && arr[right] > arr[pivot]) {
				right--;
			}
			if (left < right) {
				int t = arr[left];
				arr[left] = arr[right];
				arr[right] = t;
			}
		}
		int t = arr[pivot];
		arr[pivot] = arr[right];
		arr[right] = t;
		pivot = right;
		quickSort(arr,lower, pivot - 1);
		quickSort(arr,pivot + 1, upper);
	}
}

	public static void main(String[] args) {
		int arr[] = { 4, 56, 8, 2, 56, 14, 6, 5, 82, 56, 14, 5, 89, 1 };

		int len = arr.length;

		quickSort(arr,0, len-1);
		
		// printing the sorted array
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}