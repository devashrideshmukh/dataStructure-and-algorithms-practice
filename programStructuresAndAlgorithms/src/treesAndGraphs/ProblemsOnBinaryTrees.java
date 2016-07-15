package treesAndGraphs;

public class ProblemsOnBinaryTrees {

	
	public int sizeOfTree(TreeNode root) {

		if (root == null) {
			return 0;
		} else {
			return (sizeOfTree(root.leftChild) + 1 + sizeOfTree(root.rightChild));
		}

	}
	
	
	public int sum(TreeNode root) { 
	    
	    if (root == null) {
				return 0;
			} else {
				return (sum(root.leftChild) +root.key+ sum(root.rightChild));
		}


	}

}
