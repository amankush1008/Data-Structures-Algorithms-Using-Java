package graphs;

import java.util.ArrayList;

//class Edge implements Comparable<Edge> {
//	
//	int src,dest,wt;
//	
//	public Edge(int src,int dest,int wt) {
//		this.src=src;
//		this.dest=dest;
//		this.wt=wt;
//		
//	}
//	
//	public int CompareTo(Edge that) {
//		return this.wt-that.wt;
//	}
//	
//}

class graph3{
	
	private static ArrayList<Edge>edges;
	
	static int parent[];
	
	public graph3() {
		edges=new ArrayList<Edge>();
	}
	
	public void addEdge(int source,int destination,int w) {
		edges.add(new Edge(source,destination,w));
	}
	
	//Find Function
	int find(int i) {
		if(parent[i]==i)return i;
		
		return find(parent[i]);
		
	}
	
	void union(int a,int b) {
		if(a!=b) {
			parent[b]=a;
		}
	}
	
	void kruskal(int v) {
		parent=new int[v];
		for(int i=0;i<v;i++) {parent[i]=i;}
		int MST=0;
		for(Edge edge:edges) {
			int rx=find(edge.src);
			int ry=find(edge.dest);
			
			if(rx!=ry) {
				System.out.print(edge.src+","+edge.dest+":"+edge.wt+"\t");
				union(rx,ry);
				MST+=edge.wt;
			}
				
			}
		System.out.println("\nMST VALUE : "+MST);
		}
}

public class Kruskal_Algo {
	public static void main(String[] args) {
		int v=4;
		graph3 graph =new graph3();
		
		graph.addEdge(0, 1, 10);
		graph.addEdge(0, 2, 15);
		graph.addEdge(0, 3, 30);
		graph.addEdge(1, 3, 40);
		graph.addEdge(2, 3, 50);
		
		graph.kruskal(v);
	}
	

}
