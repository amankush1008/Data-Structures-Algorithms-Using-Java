package queue;
import java.util.*;

public class DequeA {
	public static void main(String[] args) {
		Deque<Integer> deque=new LinkedList<>();
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		deque.addFirst(4); // 4 3 2 1
		deque.removeLast();
		System.out.println(deque);
		System.out.println("get first "+deque.getFirst());
		System.out.println("get Last "+deque.getLast());
		
		
	}

}
