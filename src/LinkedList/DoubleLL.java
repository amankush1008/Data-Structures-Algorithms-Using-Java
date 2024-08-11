package LinkedList;

public class DoubleLL {
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
			
		}
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	// add first
	public void addFirst(int data) {
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}
	
	//add Last
	public void addLast(int data) {
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
			
		}
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
		newNode.next=null;
	}
	//remove First
	public int removeFirst() {
		if(head==null) {
			System.out.println("DLL is empty");
			return Integer.MIN_VALUE;
		}
		if(size==1) {
			int val=head.data;
			head=null;
			tail=null;
			size--;
			return val;
		}
		int val=head.data;
		head=head.next;
		head.prev=null; // line error
		size--;
		return val;
	}
	//remove last
	public int removeLast() {
		if(head==null) {
			System.out.println("DLL is Empty");
			return Integer.MIN_VALUE;
		}
		if(size==1) {
			head=tail=null;
			size--;
			int val=tail.data;
		}
		int val=tail.data;
		tail=tail.prev;
		tail.next=null;
		size--;
		return val;
	}
	//print
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" <-> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	// reverse doubly 
	public void reverse() {
		Node curr=head;
		Node prev=null;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			
			prev=curr;
			curr=next;
			
		}
		head=prev;
	}
	public static void main(String[] args) {
		DoubleLL ll=new DoubleLL ();
//		ll.addFirst(1);
//		ll.addFirst(2);
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.print();
		//ll.removeFirst();
		//ll.removeLast();
		//ll.print();
	//	System.out.println(size);
		ll.reverse();
		ll.print();
	}
}
