package LinkedList;
import java.util.LinkedList;

public class LL_Java_Frame {
	public static void main(String[] args) {
		// create --Objects 
	LinkedList<Integer> ll=new LinkedList<>();
	ll.addLast(1);
	ll.addLast(2);
	ll.addFirst(0);
	
	//print
	System.out.println(ll);
	
	//Remove
	
	ll.removeFirst();
	System.out.println(ll);
	
	ll.removeLast();
	System.out.println(ll);
	
	
	
}
}
