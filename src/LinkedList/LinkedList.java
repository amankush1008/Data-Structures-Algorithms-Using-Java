package LinkedList;

import LinkedList.Linked_List.Node;

	public class LinkedList {
		public static class Node{
			int data;
			Node next;
			
			// constructor
			public Node(int data) {
				this.data=data;
				this.next=null; // reference variables
			}
		}
		
		public static Node head;
		public static Node tail;
		// Detect loop/ cycle in a LL
		// Flyod's Cycle Finding Algo
		public static void removeCycle() {
			// detect cycle
			Node slow=head;
			Node fast=head;
			boolean cycle=false;
			
			while(fast!=null && fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
				if(slow==fast) {
					cycle=true;
					break;
				}
			}
			// find meeting point
			slow=head;
			Node prev= null;
			while(slow!=fast) {
				prev=fast;
				slow=slow.next;
				fast=fast.next;
			}
			prev.next=null;
		}
		public static boolean detectCycle(Node head) {
			Node slow=head;
			Node fast=head;
			while(fast!=null && fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
				
				if(slow==fast) {
					return true;
				}
			}
			return false;
		}
		
		public static void main(String[] args) {
//			head=new Node(1);
//			head.next=new Node(2);
//			head.next.next=new Node(3);
//			head.next.next.next=head.next;
//			System.out.println(detectCycle(head));
//			removeCycle();
//			System.out.println(detectCycle(head));
			LinkedList ll=new LinkedList();
			
		}
	}