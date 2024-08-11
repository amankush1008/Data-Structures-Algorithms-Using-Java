package ArrayList;
import java.util.ArrayList;
public class arrayList {
	public static void main(String[] args) {
		//java Collectuion Framework
		// Classname objectname= new ClassName();
		
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		ArrayList<Boolean> list3=new ArrayList<>();
		
		// Add Element -- O(1)
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// Add element in linear Time --- O(n)
		list.add(2,12);
		System.out.println(list);
		
		//Get element n -- O(1)
		int getELe=list.get(3);
		System.out.println(getELe);
		
		//delete function  -- O(n) -- Ek ek kark check krega konsa delete krna hai 
		
		list.remove(2);
		System.out.println(list);
		
		// Set Element -- O(n) ek ek krk chng krta hai
		
		list.set(3, 23);
		System.out.println(list);
		
		
		// Contains element if exits return True otheriwise False
		System.out.println(list.contains(8));
		
		// size method in Array List 
		
		System.out.println(list.size());
	}

}












































