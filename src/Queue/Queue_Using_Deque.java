package queue;

import java.util.Deque;
import java.util.LinkedList;

import queue.Stack_Using_Deque.Stack;

public class Queue_Using_Deque {

	static class Queue{
		static Deque<Integer> dq=new LinkedList<>();
		
		//empty
		public static boolean isEmpty() {
			return dq.size()==0;
		}
		
		//push
		public static void add(int data) {
			dq.addLast(data);
		}
		
		//pop
		
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			return dq.removeFirst();
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return dq.getFirst();
		}
		
		public static void main(String[] args) {
			Queue q=new Queue();
			q.add(1);
			q.add(2);
			q.add(3);
			
			System.out.println("Peek "+q.peek());
			System.out.println(q.remove());
			System.out.println(q.remove());
			System.out.println(q.remove());
		}
	}

}
