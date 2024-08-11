package hashing;
class MyHashTable{
	private Node hashTable[];
	
	MyHashTable(int size){
		hashTable=new Node[size];
	}
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void put(int value) {
		int index=value%hashTable.length;
		Node newNode=new Node(value);
		if(hashTable[index]==null) {
			hashTable[index]=newNode;
		}else {
			Node pos=hashTable[index];
			while(pos.next!=null) {
				pos=pos.next;
			}
			pos.next=newNode;
		}
	}
	
	public void traverse() {
		for(int x=0;x<=hashTable.length-1;x++) {
			if(hashTable[x]!=null) {
				Node pos=hashTable[x];
				while(pos!=null) {
					System.out.println(pos.data);
					pos=pos.next;
				}
			}
		}
	}
	
	public void search(int value) {
		int index=value%hashTable.length;
		if(hashTable[index]!=null ) {
			boolean flag=true;
			Node pos=hashTable[index];
			while(pos!=null) {
				if(pos.data==value) {
					System.out.println(value+" is present");
					flag=false;
					break;
				}
				pos=pos.next;
			}
			if(flag) {
				System.out.println(value+" is NOT present");
			}
		}else {
			System.out.println(value+" is NOT present");
		}
	}
	
	public void delete(int value) {
		int index=value%hashTable.length;
		if(hashTable[index]!=null ) {
			Node pos=hashTable[index];
			if(pos.data==value) {
				hashTable[index]=pos.next;
				System.out.println(value+" Deleted");
			}else {
				boolean flag=true;
				Node prev=pos;
				pos=pos.next;
				while(pos!=null) {
					if(pos.data==value) {
						prev.next=pos.next;
						System.out.println(value+" Deleted");
						flag=false;
						break;
					}
					prev=pos;
					pos=pos.next;
				}
				if(flag) {
					System.out.println(value+" is NOT present");
				}
			}
		}else {
			System.out.println(value+" is NOT present");
		}
	}
	public void deleteAll(int value) {
		//your logic
	}
}
public class HashingEx {

	public static void main(String[] args) {
		MyHashTable hashTable=new MyHashTable(10);
		hashTable.put(21);
		hashTable.put(14);
		hashTable.put(12);
		hashTable.put(32);
		hashTable.put(24);
		hashTable.put(1);
		hashTable.put(24);
		hashTable.traverse();
		hashTable.search(25);
		hashTable.search(32);
		hashTable.delete(24);
		hashTable.deleteAll(24);
		hashTable.traverse();
		
	}

}