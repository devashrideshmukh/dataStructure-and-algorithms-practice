package test;

import treesAndGraphs.BinarySearchTree;
import treesAndGraphs.TreeTraversals;

public class RunnerTreesAndGraphs {
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertATreeNode(50);
		bst.insertATreeNode(45);
		bst.insertATreeNode(40);
		bst.insertATreeNode(48);
		bst.insertATreeNode(38);
		bst.insertATreeNode(41);
		bst.insertATreeNode(55);
		bst.insertATreeNode(52);
		bst.insertATreeNode(57);
		
		TreeTraversals.levelOrderTraversal(bst.getRoot());
	}
}
