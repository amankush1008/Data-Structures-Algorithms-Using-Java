package LinkedList;

public class Linked_List {
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
	public static int size;
	
	// Insert Node
	public void addFirst(int data) {
	//step1 create new node
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
			
		}
		
		//step2 newNode next=head
		newNode.next=head; // Linking Step
	
		//step3 head=newNode
		head=newNode;
	}
	//insert at the end
	public void addLast(int data) {
		//step1 -- create newNode
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		//step2
		tail.next=newNode;
		tail=newNode;
	}
	//add in Middle
	public void addMiddle(int idx,int data) {
		if(idx==0) {
			addFirst(data);
			return;
		}
		Node newNode=new Node(data);
		size++;
		Node temp=head;
		int i=0;
		while(i<idx-1) {
			temp=temp.next;
			i++;
		}
		
		//i=idx; temp=temp.next
		newNode.next=temp.next;
		temp.next=newNode;
		
		
	}
	
	//remove first
	public int removeFirst() {
		int val=head.data;
		if(size==0) {
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		}
		else if(size==1) {
			head=tail=null;
			size=0;
			return val;
			
		}
		
		head=head.next;
		size--;
		return val;
	}
	// remove last
	public int removeLast() {
		int val=head.data;
		if(size==0) {
			System.out.println(" LL is  empty");
			return Integer.MAX_VALUE;
			
		}
		else if(size==1) {
			head=tail=null;
			size =0;
			return val;
		}
		
		// prev : i= size-2
		Node prev=head;
		for(int i=0;i<size-2;i++) {
			prev=prev.next;
		}
		//i= size -2
		int val1=prev.next.data;
		prev.next=null;
		tail=prev;
		size--;
		return val;
		
		
	}
	
	public int itrsearch(int key) {
		int i=0;
		Node temp=head;
		while(temp!=null) {
			if(temp.data==key) {
				return i;
			}
			temp=temp.next;
			i++;
		}
		return -1;
	}
	
	//Search Recursive
	public int helper(Node head,int key) {
		//base Case
		if(head==null) {
			return -1;
		}
		if(head.data==key) {
			return 0;
		}
		int idx=helper(head.next,key); // recursive call
		if(idx==-1) {
			return -1;
		}
		return idx+1;
	}
	public int recSearch(int key) {
		return helper(head,key);
	}
	
	// Reverse Linked List
	public void reverse() {
		Node prev=null;
		Node curr=tail=head;
		Node next;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	// Delete From Nth Node
	public void deleteNthNode(int n) {
		int sz=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			sz++;
		}
		
		if(sz==n) {
			head=head.next; // remove first
			return;
		}
		int i=1;
		Node prev=head;
		int itoFind=sz-n;
		while(i<itoFind) {
			prev=prev.next;
			i++;
		}
		prev.next=prev.next.next;
		return;
	}
	
	// find Middle Node 
	public Node midNode(Node head) {  // helper function
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
		return slow; // slow is my Mid Node
	}
	
	public boolean checkPalindrome() {
		if(head==null || head.next==null) {
			return true;
			
		}
		// step-1 find Mid Node
		Node midNode=midNode(head);
		
		// step-2 reverse 2nd half
		Node prev=null;
		Node curr=midNode;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		Node right=prev; // right half head
		Node left=head;
		
		
		// step-3 check 1st ==2nd half
		while(right!=null) {
			if(left.data!=right.data) {
				return false;
			}
			left=left.next;
			right=right.next;
		}
		return true;
	}
	
	// Detect loop/ cycle in a LL
	// Flyod's Cycle Finding Algo
	
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
	
	// delete nth node from the front
	
	public static void deleteSpecific(int locationValue) {
	// Checks if the list is empty
			if (head == null) {
				System.out.println("Nothing to delete.");
			} else if (head.data == locationValue) {
				head = head.next;
			} else {
				Node currentNode = head;
				Node locationNode = null;
				Node previousNode = null;
				//int count=0;
				while (currentNode != null) {
					if (currentNode.data == locationValue) {
						locationNode = currentNode;
					
					}
					previousNode = currentNode;
					currentNode = currentNode.next;
				}
				if (locationNode == null) {
					System.out.println("Location Value does not exist.");
				} else {
					previousNode.next = locationNode.next;
					if (locationNode == tail) {
						tail = previousNode;
					}
				}
			}
		}
	
	
	
	// Print a LinkedList
	public static void printLL() {
		if(head==null) {
			System.out.println("LL is empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"  -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Linked_List ll=new Linked_List();
		
		
		
//		ll.addFirst(2);
//		
//		ll.addFirst(1);
//		
//		ll.addLast(3);
//		
//		ll.addLast(4);
//		ll.addFirst(23);
//		ll.addMiddle(2, 9);
//		ll.printLL();
//		ll.removeFirst();
//		ll.printLL();
//		ll.removeLast()	;
//		//Size of ll
//		ll.printLL();
		
//		ll.addFirst(1);
//		ll.addFirst(10);
//		ll.addLast(34);
//		ll.addFirst(11);
//		ll.addFirst(89);
//		ll.addLast(74);
//		ll.printLL();
		
//		System.out.println(ll.size);
//		
//		//Search
//		System.out.println("Index of key is "+ll.itrsearch(34));
//		
//		System.out.println("Index of key is "+ll.recSearch(34));
//		
//		ll.reverse();
//		ll.printLL();
//		ll.deleteNthNode(3);
//		ll.printLL();
		
//		ll.addLast(1);
//		ll.addLast(2);
////		ll.addLast(1);
////		ll.addLast(1);
//		ll.printLL();
//		ll.reverse();
//		
//		ll.printLL();
//		
//		head=new Node(1);
//		head.next=new Node(2);
//		head.next.next=new Node(3);
//		head.next.next.next=head;
//		System.out.println(detectCycle(head));
		
		//System.out.println(ll.checkPalindrome());
		
		
		
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(7);
		ll.addFirst(3);
		ll.addLast(7);
		ll.addFirst(4);
		ll.addFirst(5);
		ll.addFirst(8);
		ll.addLast(7);
		ll.printLL();
		ll.deleteSpecific(7);
		ll.printLL();
		
		 
		
		
	}

}
