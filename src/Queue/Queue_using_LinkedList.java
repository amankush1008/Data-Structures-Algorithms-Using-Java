package queue;

public class Queue_using_LinkedList {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
		static class Queue{
			static Node head=null;
			static Node tail=null;
			
			//is EMpty
			
			public static boolean isEmpty() {
				return head==null & tail==null;
			}
			
			//add 
			public static void add(int data) {
				Node newNode=new Node(data);
				if(isEmpty()) {
					head=tail=newNode;
				}
				tail.next=newNode;
				tail=newNode;
			}
			
			//remove
			public static int remove() {
				if(isEmpty()) {
					return -1;
				}
				int front=head.data;
				if(tail==head) {
					tail=head=null;
				}
				else{
					head=head.next;
				}
				return front;
			
			}
			
			//peek
			public static int peek() {
				if(isEmpty()) {
					return -1;
				}
				return head.data;
						
			}

			
		}
		public static void main(String[] args) {
			Queue q1=new Queue();
			q1.add(1);
			q1.add(2);
			q1.add(3);
			q1.add(5);
			
			while(!q1.isEmpty()) {
				System.out.println(q1.peek());
				q1.remove()
;                                                            			}
		}
		
	}
	
}


