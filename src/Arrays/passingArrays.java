package defaults;
import java.util.*;
public class passingArrays {
	
	public static void update(int marks[],int nonChnageable) {
		nonChnageable=10;
		for(int i=0;i<marks.length;i++) { //har ek index pr jana 
			
			marks[i]=marks[i]+1;
			
		}
	}
	

	public static void main(String[] args) {
		int marks[]= {97,98,99};
		//update(marks);
		
		int nonChnageable=5;
		update(marks,nonChnageable);
		System.out.println(nonChnageable);
		
		//print marks
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		
	}

}
