package graphs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Edge implements Comparable<Edge> {
    int src, dest, wt;
    
    public Edge(int src, int dest, int wt) {
		this.src = src;
		this.dest = dest;
		this.wt = wt;
	}

	public int compareTo(Edge that) {
        return this.wt - that.wt;
    }
}

class Graphhhhhhhhh{
	private ArrayList<Edge> edges;
	static int parent[];

	public Graphhhhhhhhh() {
		edges = new ArrayList<Edge>();
	}
	public void addEdge(int source, int destination, int w)
    {
		edges.add(new Edge(source,destination, w));
    }
	
	
	//Kruskal's Algo
	int find(int i) {
        if (parent[i] == i) 
        	return i;
        else 
        	return find(parent[i]);
    }
	void union(int a, int b) {
       if(a!=b) {
        	parent[b] = a;
       }
    }
	public void KruskalMST(int v) {
		parent=new int[v];
		for(int i=0;i<v;i++) { parent[i]=i;  }
		Collections.sort(edges);
		int MST=0;
		for(Edge edge:edges) {
			int rootX=find(edge.src);
			int rootY=find(edge.dest);
			
//			System.out.println("rootx "+rootX);
//			System.out.println("rooty "+rootY);

			if(rootX != rootY) {
		    	   	System.out.print(edge.src+","+edge.dest+":"+edge.wt+"\t");
				union(rootX, rootY);
				MST += edge.wt;
			}
		}
		System.out.println("\nMST value: "+MST);
	}
}



public class DSA_Kruskal {
	public static void main(String[] args) {
		//Create the Graph using keyboard
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of vertices and edges");
//		int v = sc.nextInt();
//		int e = sc.nextInt();
//
//		Graphhhhhhhhh graph = new Graphhhhhhhhh(v);
//		System.out.println("Enter the edges with weight");
//		for (int i = 0; i < e; i++) {
//			int source = sc.nextInt();
//			int destination = sc.nextInt();
//			int weight = sc.nextInt();
//
//			graph.addEdge(source, destination,weight);
//		}
//		sc.close();

		//Create the Graph without keyboard
        int v = 4;
        Graphhhhhhhhh graph = new Graphhhhhhhhh();
 
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 3, 30);
        graph.addEdge(0, 2, 15);
        graph.addEdge(1, 3, 40);
        graph.addEdge(2, 3, 50);
//        graph.addEdge(2, 4, 8);
//        graph.addEdge(3, 4, 1);
//        graph.addEdge(4, 5, 3);
        
		
        graph.KruskalMST(v);
		
	}
}
