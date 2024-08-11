package stack;

import java.util.ArrayList;

public class Stack_ArrayList {
	static class Stack1{
		static ArrayList<Integer> list=new ArrayList<>();
		//isEmpty
		public static boolean isEmpty() {
			return list.size()==0;
		}
		
		// Push Function
		
		public static void push(int data) {
			list.add(data);
		}
		
		//pop function
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1); // O(1)
			return top;
		}
		
		//peek operatin
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			return top;
		}
	}
	public static void main(String[] args) {
		Stack1 s=new Stack1();
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		
		while(!s.isEmpty()) {
		System.out.print(s.peek()+" ");
		s.pop();
	}
		System.out.println(s.peek());

	}
}
