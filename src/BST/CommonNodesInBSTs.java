package BST;
import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node.
class TreeNodeee{ //Already Defined 
	int val;
	TreeNodeee left;
	TreeNodeee right;
	
	TreeNodeee(int val){
		this.val=val;
		
	}
}
public class CommonNodesInBSTs {
    public List<Integer> findCommonNodes(TreeNodeee root1, TreeNodeee root2) {
        List<Integer> result = new ArrayList<>();
        // Perform in-order traversal on both trees
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inOrder(root1, list1);
        inOrder(root2, list2);

        // Find common nodes in the two lists
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            int val1 = list1.get(i);
            int val2 = list2.get(j);
            if (val1 == val2) {
                result.add(val1);
                i++;
                j++;
            } else if (val1 < val2) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }

    // In-order traversal of the tree and store the nodes in the list
    private void inOrder(TreeNodeee node, List<Integer> list) {
        if (node == null) return;
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }

    public static void main(String[] args) {
        // Example BSTs:
        // BST 1:        5
        //              /   \
        //             3     7
        //            / \   / \
        //           2   4 6   8
        TreeNodeee root1 = new TreeNodeee(5);
        root1.left = new TreeNodeee(3);
        root1.right = new TreeNodeee(7);
        root1.left.left = new TreeNodeee(2);
        root1.left.right = new TreeNodeee(4);
        root1.right.left = new TreeNodeee(6);
        root1.right.right = new TreeNodeee(8);

        // BST 2:        4
        //              /   \
        //             2     6
        //                    \
        //                     8
        TreeNodeee root2 = new TreeNodeee(4);
        root2.left = new TreeNodeee(2);
        root2.right = new TreeNodeee(6);
        root2.right.right = new TreeNodeee(8);

        CommonNodesInBSTs solution = new CommonNodesInBSTs();
        List<Integer> commonNodes = solution.findCommonNodes(root1, root2);
        System.out.println("Common Nodes in BSTs: " + commonNodes); // Output: [2, 4, 6, 8]
    }
}
