package DSA_Array;

import java.util.Arrays;

public class MoveNegativeEnd {
	static void move(int []arr) {
        int []temp=new int[arr.length];
        
        int j=0;
        
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] >= 0) {
                temp[j++]=arr[i];
            }
        }
        
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] < 0) {
                temp[j++]=arr[i];
            } 
        }
        
        for(int i = 0 ;i<arr.length;i++) {
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int []arr= {1, -1, 3, 2, -7, -5, 11, 6};
        move(arr);
        
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}


