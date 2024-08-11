
package BST;

class TreeNodee{ //Already Defined 
	int val;
	TreeNodee left;
	TreeNodee right;
	
	TreeNodee(int val){
		this.val=val;
		
	}
}

public class InorderTraversal {
	public static void InOrderTraversal(TreeNodee root) {
		//base case
		if(root==null) {
			return;
		}
		
		//inorder left subtree
		InOrderTraversal(root.left);
		
		//print cuurent node
		System.out.print(root.val+" ");
		
		//inorder right subtree
		InOrderTraversal(root.right);
		
		
		
	}
	public static int countNodes(TreeNodee root) {
		if(root == null) {
			return 0;
		}
		
		int x = countNodes(root.left);
		int y = countNodes(root.right);
		
		return x + y +1;
		
	}
	
	public static int updateNode(TreeNodee root) {
		
		if(root == null) {
			return 0;
		}
		
		updateNode(root.left);
		updateNode(root.right);
		
		if(root.left != null) {
			root.val += root.left.val;
		}
		
		if(root.right != null) {
			root.val += root.right.val;
		}
		return root.val;
	}
	
	
	public static void printSpNode(TreeNodee root) {
		if(root == null) {
			return;
		}
		
		if(root.left == null || root.right != null) {
			System.out.print(root.val+"  ");
		}
		printSpNode(root.left);
		printSpNode(root.right);
	}
	
	
	public static int countSpNode(TreeNodee root) {
		if(root == null) {
			return 0;
		}
		int count=0;
		if(root.left == null || root.right != null) {
			count++;
		}
		countSpNode(root.left);
		countSpNode(root.right);
		
		return count;
	}
	
	public static void main(String[] args) {
		TreeNodee root=new TreeNodee(5);
		root.left=new TreeNodee(3);
		root.left.left=new TreeNodee(2);
		root.left.right=new TreeNodee(4);
		root.right=new TreeNodee(6);
		root.right.right=new TreeNodee(8);
		root.right.right.left=new TreeNodee(7);
		
		System.out.print("Inorder Traversal : ");
		InOrderTraversal(root);
		
		System.out.println();
		System.out.println("Number of Nodes "+countNodes(root));
		
		System.out.println("Sum of Nodes : "+ updateNode(root));
		
		printSpNode(root);
		
		System.out.println();
		System.out.println(countSpNode(root));
		
		
	}

}
