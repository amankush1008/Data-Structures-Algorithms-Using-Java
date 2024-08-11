package stack;

import java.util.Stack;

public class _Push_at_Bottom_of_the_Stack {
	public static void pushBottom(Stack<Integer> s,int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top=s.pop();
		pushBottom(s,data);
		s.push(top);
		
			
	}
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		pushBottom(s,5);
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
	}

}
