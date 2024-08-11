package ArrayList;
import java.util.*;
public class _print_reverse_arrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		// add elemenet
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//print reverse
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+ " ");
		}
		
		
		
	}

}
