package BST;

//class TreeNode{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	
//	public TreeNode(int val) {
//		this.val=val;
//		this.left=null;
//		this.right=null;
//		
//	}
//	
//}

class BinaryTree1{
	static TreeNode root;
	
	BinaryTree1(){
		root=null;
	}
	
	//Inorder traversal
	
	void inOrder(TreeNode root)
	{
		if(root != null) 
		{
			inOrder(root.left);
			System.out.print(" "+root.data);
			inOrder(root.right);
		}
	}
	
	
	//PreOrder
	
	void preOrder(TreeNode root)
	{
		if(root != null) 
		{
			System.out.print(" "+root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	
	//postorder
	void postOrder(TreeNode root)
	{
		if(root != null) 
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(" "+root.data);

		}
	}
	
	public int height(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		return Math.max(height(root.left), height(root.right))+1;
	}
	
}

public class BST {
	public static void main(String[] args) {
		BinaryTree1 tree= new BinaryTree1();
		tree.root=new TreeNode(100);
		
		tree.root.left=new TreeNode(20);
		tree.root.left.left=new TreeNode(10);
		tree.root.left.right=new TreeNode(30);

		tree.root.right=new TreeNode(200);
		tree.root.right.left=new TreeNode(150);
		tree.root.right.right=new TreeNode(300);
		
//		tree.root=new TreeNode(1);
//		tree.root.left = new TreeNode(2);
//		tree.root.right = new TreeNode(3);
//		tree.root.left.left = new TreeNode(4);


		
//		tree.root.left.left=new TreeNode(2);
//		tree.root.left.right=new TreeNode(5);
//		tree.root.right.left=new TreeNode(6);
//		tree.root.right.right=new TreeNode(9);
		System.out.print("InOrder Traversal : ");
		tree.inOrder(tree.root);
		
		System.out.println();
		
		System.out.print("PreOrder Traversal : ");
		tree.preOrder(tree.root);
		
		System.out.println();
		
		System.out.print("PostOrder Traversal : ");
		tree.postOrder(tree.root);
		
		System.out.println();
		System.out.println("height "+tree.height(tree.root));

	}

}
