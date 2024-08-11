package graphs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Graphhhhh {

	private LinkedList<Integer> edges[];
	

	public Graphhhhh(int v) {
		edges = new LinkedList[v];
		for (int i = 0; i < edges.length; i++) {
			edges[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int source, int destination) {
		edges[source].add(destination);
		edges[destination].add(source);
	}
	
	public void traverse(){
		int v=0;
		for(LinkedList<Integer> x: edges) {
			System.out.print(v++ +": ");
			for(Integer y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	void countEdge() {
		int t=0;
		for(LinkedList<Integer> x: edges) {
			t = t +x.size();
		}
		System.out.println("Total Edges: "+ t/2);
	}
	void printEdge() {
		//Your Logic
	}
	
	
	public void bfsTraversal(int source) {
//		int source=0;
		boolean visited[]= new boolean[edges.length];
		Queue<Integer> q=new LinkedList<>();
		visited[source]=true;
		
		while(!q.isEmpty()) {
			int current=q.poll();
			System.out.print(current+" ");
			
			for(int neighbour:edges[current]) {
				
				if(!visited[neighbour]) {
					visited[neighbour]=true;
					q.add(neighbour);
					
				}
			}
		}
	}
}

public class DSA_GraphCreation {
	public static void main(String[] args) {
		
		//Create the Graph using keyboard
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of vertices and edges");
//		int v = sc.nextInt();
//		int e = sc.nextInt();
//
//		Graphhhhh graph = new Graphhhhh(v);
//		System.out.println("Enter the edges");
//		for (int i = 0; i < e; i++) {
//			int source = sc.nextInt();
//			int destination = sc.nextInt();
//
//			graph.addEdge(source, destination);
//		}
//		
//		sc.close();

		
		//Create the Graph without keyboard
        int v = 9;
        Graphhhhh graph = new Graphhhhh(v);
 
        graph.addEdge(0, 1);
        graph.addEdge(0, 7);
        graph.addEdge(1, 2);
        graph.addEdge(1, 7);
        graph.addEdge(2, 3);
        graph.addEdge(2, 8);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);
        graph.addEdge(6, 8);
        graph.addEdge(7, 8);
        
        graph.traverse();
        
//        graph.countEdge();
//        
//        graph.printEdge();
//       graph.bfsTraversal(0);
	}
}
