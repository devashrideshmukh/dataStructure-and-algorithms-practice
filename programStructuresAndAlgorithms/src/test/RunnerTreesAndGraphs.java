package test;

import java.util.ArrayList;
import java.util.Deque;

import treesAndGraphs.BinarySearchTree;
import treesAndGraphs.FindNodeBST;
import treesAndGraphs.InsertBST;
import treesAndGraphs.LevelOfANode;
import treesAndGraphs.LevelOfNode;
import treesAndGraphs.NumberOfLeaves;
import treesAndGraphs.SizeOfTree;
import treesAndGraphs.TreeNode;
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
		System.out.println("");
		ArrayList<ArrayList<Integer>> list = TreeTraversals.levelOrderRecursive(bst.getRoot());
		for(int i=0;i<list.size();i++){
			System.out.println("");
			for(int j=0;j<list.get(i).size();j++){
				System.out.print(list.get(i).get(j)+" ");
			}
		}
		
		System.out.println("");
		System.out.println(SizeOfTree.countNodesIterative(bst.getRoot()));
		
		System.out.println(TreeTraversals.zigzagLevelOrder(bst.getRoot()));
		
		
		BinarySearchTree bst2 = new BinarySearchTree();
		bst2.insert(50);
		bst2.insert(45);
		bst2.insert(40);
		bst2.insert(48);
		bst2.insert(38);
		bst2.insert(41);
		bst2.insert(55);
		bst2.insert(52);
		bst2.insert(57);
		TreeTraversals.levelOrderTraversal(bst2.getRoot());
		
		TreeNode root1 = InsertBST.insertInBSTIterative(50, null);
		InsertBST.insertInBSTIterative(45, root1);
		InsertBST.insertInBSTIterative(40, root1);
		InsertBST.insertInBSTIterative(48, root1);
		InsertBST.insertInBSTIterative(38, root1);
		InsertBST.insertInBSTIterative(41, root1);
		InsertBST.insertInBSTIterative(55, root1);
		InsertBST.insertInBSTIterative(52, root1);
		InsertBST.insertInBSTIterative(57, root1);
		System.out.println("");
		TreeTraversals.levelOrderTraversal(root1);
		TreeNode root2 = InsertBST.insertRec(50, null);
		InsertBST.insertRec(45, root2);
		InsertBST.insertRec(40, root2);
		InsertBST.insertRec(48, root2);
		InsertBST.insertRec(38, root2);
		InsertBST.insertRec(41, root2);
		InsertBST.insertRec(55, root2);
		InsertBST.insertRec(52, root2);
		InsertBST.insertRec(57, root2);
		System.out.println("");
		TreeTraversals.levelOrderTraversal(root2);
		System.out.println("");
		System.out.println("Node to be found:");
		FindNodeBST.findNodeIterative(root2, 48).displayTreeNode();
		FindNodeBST.findNodeIterative(root2, 57).displayTreeNode();
		FindNodeBST.findNodeRecursive(root2, 50).displayTreeNode();
		FindNodeBST.findNodeRecursive(root2, 52).displayTreeNode();
		TreeNode node = FindNodeBST.findNodeRecursive(root2, 67);
		if(node==null){
			System.err.println("Node not found");
		}
		TreeTraversals.levelOrderTraversal(root2);
		System.out.println("");
		System.out.println(NumberOfLeaves.countNumberOfLeaves(root2));
		System.out.println(NumberOfLeaves.countNumberOfLeavesIterative(root2));
		TreeTraversals.levelOrder(root2);
		
		System.out.println("Level of Node 55 is "+LevelOfNode.findLevelIterative(root2, 55)); 
		System.out.println("Level of Node 50 is "+LevelOfNode.findLevelIterative(root2, 50)); 
		System.out.println("Level of Node 41 is "+LevelOfNode.findLevelIterative(root2, 41)); 
		System.out.println("Level of Node 55 is "+LevelOfNode.findLevelRecursive(root2, 55,0)); 
		System.out.println("Level of Node 50 is "+LevelOfNode.findLevelRecursive(root2, 50,0)); 
		System.out.println("Level of Node 41 is "+LevelOfNode.findLevelRecursive(root2, 41,0)); 
		
	}

	
}
