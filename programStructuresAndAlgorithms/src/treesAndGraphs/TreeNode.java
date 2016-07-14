package treesAndGraphs;

public class TreeNode {

	int key;
	TreeNode leftChild;
	TreeNode rightChild;

	public TreeNode(int key) {
		this.key = key;
		this.leftChild=null;
		this.rightChild=null;
	}

	public void displayTreeNode(){
		System.out.println(key);
	}
}
