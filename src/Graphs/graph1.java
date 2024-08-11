package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

   class graph1 {
	
	private LinkedList<Integer> edges[];
	
	public graph1(int v) {
		edges=new LinkedList[v];
		for(int i=0;i<edges.length;i++) {
			edges[i]=new LinkedList<Integer>();
		}
		
	}
	
	public void addEdge(int source,int destination) {
		edges[source].add(destination);
		edges[destination].add(source);
	}
	public void traverse() {
		int v=0;
		for(LinkedList<Integer>x:edges) {
			System.out.print(v++ +": ");
			
			for(Integer y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public void countEdge() {
		int t=0;
		for(LinkedList<Integer> x:edges) {
			t=t+x.size();
		}
		System.out.println("Total Edges :"+t/2);
	}
	
	
	public void bfsTraversal(int source) {
		boolean visited[]=new boolean[edges.length];
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
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
	
	//to the destination
	public void bfsTraversal(int source,int destination) {
		boolean visited[]=new boolean[edges.length];
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		visited[source]=true;
		
		
		while(!q.isEmpty()) {
			int current=q.poll();
			System.out.print(current+" ");
			if(current==destination) {
				break;
			}
			
			for(int neighbour:edges[current]) {
				if(!visited[neighbour]) {
					visited[neighbour]=true;
					q.add(neighbour);
				}
			}
		}
	}
	
	
	//dfs traversal
	
	public void dfsTraversal(int source) {
		boolean visited[]=new boolean[edges.length];
		Stack<Integer> stack=new Stack<>();
		
		stack.push(source);
		visited[source]=true;
		
		while(!stack.isEmpty()) {
			int current=stack.pop();
			System.out.print(current+" ");
			
			for(int neighbour:edges[current]) {
				if(!visited[neighbour]) {
					visited[neighbour]=true;
					stack.push(neighbour);
				}
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		int v=9;
		graph1 graph=new graph1(v);
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
       
		
//		graph.traverse();
		graph.bfsTraversal(0);
		System.out.println();
		graph.bfsTraversal(0, 6);
		
		System.out.println();
		graph.dfsTraversal(0);
		
		
		
		
	}
	

}
