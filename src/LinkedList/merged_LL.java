package LinkedList;


public class merged_LL {
	public static class Node{
		int data;
		Node next;
		
		// constructor
		public Node(int data) {
			this.data=data;
			this.next=null;
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
	public Node getMid(Node head) {
		Node slow=head;
		Node fast=head.next;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
		return slow;
				
	}
	private Node merge(Node head1,Node head2) {
		Node mergeLL=new Node(-1);
		Node temp=mergeLL;
		while(head1!=null && head2!=null) {
			if(head1.data<=head2.data) {
				temp.next=head1;
				head1=head1.next;
				temp=temp.next;
			}
			else {
				temp.next=head2;
				head2=head2.next;
				temp=temp.next;
			}
		}
		while(head1!=null) {
			temp.next=head1;
			head1=head1.next;
			temp=temp.next;
		}
		while(head2!=null) {
			temp.next=head2;
			head2=head2.next;
			temp=temp.next;
		}
		return mergeLL.next;
				
	}
	public Node mergeSort(Node head) {
		
		// base cse
		if(head==null || head.next==null) {
			return head;
		}
		//find mid
		Node mid=getMid(head);
		// left & rught  ms
		Node righthead=mid.next;
		mid.next=null;
		Node newLeft=mergeSort(head);
		Node newRight=mergeSort(righthead);
		
		// merge
		return merge(newLeft,newRight);
	}
	
	
	// find zig zag
	
	public void zigZag() {
		//find Mid
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
		Node mid=slow;
		
		
		
		// reverse 2nd half
		Node curr=mid.next;
		mid.next=null;
		Node prev=null;
		Node next;
		while(curr!=null) {
			
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
		
		}
		Node left=head;
		Node right=prev;
		Node nextL , nextR;
		
		// alternate merge - zig zag merge
		while(left!=null && right!=null) {
			nextL=left.next;
			left.next=right;
			nextR=right.next;
			right.next=nextL;
			
			right=nextR;
			left=nextL;
			
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		merged_LL ll =new merged_LL();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.printLL();
		
		ll.zigZag();
		
		System.out.println("Zig Zag Fashion");
		ll.printLL();
		
		
		
		 
	}
	
		
	}


