package stack;

import java.util.*;
public class stacka {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	static class Stack1{
		static Node head=null;
		
		//is empty
		public static boolean isEmpty() {
			return head==null;
		}
		
		//push function
		public static void push(int data) {
			Node newNode=new Node(data);
			if(isEmpty()) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
			
		}
		
		// pop functions
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top =head.data;
			head=head.next;
			return top;
		}
		
		//peek functin
		public static int peek() {
			if(isEmpty()) {
				return  -1;
			}
			return head.data;
		}
	}
	public static void main(String[] args) {
		Stack1 s=new Stack1();
		s.push(1);
		s.push(2);
		s.push(3);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}
	
}
