package treesAndGraphs;

public class TreeNode {

	int key;
	TreeNode leftChild;
	TreeNode rightChild;

	public TreeNode(int key) {
		this.key = key;
	}

	public void displayTreeNode(){
		System.out.println(key);
	}
}
