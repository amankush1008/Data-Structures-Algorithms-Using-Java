package queue;
import java.util.*;
public class Reverse_first_K_elements {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		q.add(100);
		
		int k=5;
		
		// Q - 10,20,30,40,50,60,70,80,90,100
		
		Stack<Integer> s=new Stack<>();
		
		for(int i=0;i<k;i++) {
			s.push(q.poll());
		}
		
		// Q- 60,70,80,90,100
		
		while(!s.isEmpty()) {
			q.add(s.pop());
			
		}
		// Q - 60,70,80,90,100,50,40,30,20,10
		
		for(int i=k;i<q.size();i++) {
			int d=q.poll();
			q.add(d);
			
			
		}
		
		while(!q.isEmpty()) {
			System.out.print(q.poll()+" ");
		}
		
	}

}
