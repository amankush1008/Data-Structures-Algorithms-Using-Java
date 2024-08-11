package queue;

class Node{
	int data;
	Node next;
	
	public Node() {
		this.data=data;
		this.next=null;
		
	}
}
public class queue {
	private Node front,rear;
	public queue() {
		this.front=this.rear=null;
		
	}
	
	public boolean isEmpty() {
		return front==null;
		
	}
	
	public void enqueue(int data) {
		Node newNode=new Node();
		if(isEmpty()) {
			rear=front=newNode;
			
		}
		else {
			rear.next=newNode;
			rear=newNode;
		}
		System.out.println(data+" Enqueue to the queue");
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty cannot dequeue");
			return;
		}
		int dequeueValue=front.data;
		front=front.next;
		System.out.println(dequeueValue+" dequeue from the queue");
		if(front==null) {
			rear=null;
		}
		
	}
	public void peek() {
		System.out.println(front.data);
	}
	public static void main(String[] args) {
		queue q=new queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
	}

}
