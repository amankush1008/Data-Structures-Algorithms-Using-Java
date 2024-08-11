package queue;
import java.util.*;
public class QueueB {
	public static void main(String[] args) {
	//	Queue<Integer> q=new LinkedList<>(); //ArrayDeque
		Queue<Integer> q=new ArrayDeque<>();
		q.add(1);
		q.add(2);
		q.add(9);
		q.add(5);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		
	}

}
