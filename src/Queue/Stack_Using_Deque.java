package queue;
import java.util.*;
public class Stack_Using_Deque {
	static class Stack{
		static Deque<Integer> dq=new LinkedList<>();
		
		//empty
		public static boolean isEmpty() {
			return dq.size()==0;
		}
		
		//push
		public static void push(int data) {
			dq.addLast(data);
		}
		
		//pop
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			return dq.removeLast();
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return dq.getLast();
		}
		
		public static void main(String[] args) {
			Stack s=new Stack();
			s.push(1);
			s.push(2);
			s.push(3);
			
			while(!s.isEmpty()) {
				System.out.println(s.peek());
				s.pop();
			}
		}
	}

}
