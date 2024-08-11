 package BST;


class Nodee{ //Already Defined 
	int val;
	Nodee left;
	Nodee right;
	
	Nodee(int val){
		this.val=val;
		
	}
}

public class SumRootToLeafNumbers {
	static int sum=0;
	public static int sum(Nodee root) {
		helper(root,"");
		return sum;
	}
	public static void helper(Nodee root, String str) {
		if(root == null) {
			return;
		}
		str += root.val;
		if(root.left == null && root.right == null) {
			sum += Integer.parseInt(str);
		}
		helper(root.left,str);
		helper(root.right,str);

	}
	public static void main(String[] args) {
		Nodee root=new Nodee(1);
		root.left=new Nodee(2);
		root.left.left=new Nodee(2);
		
		System.out.println(sum(root));
	}
}
