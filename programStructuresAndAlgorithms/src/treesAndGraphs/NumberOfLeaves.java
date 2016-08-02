package treesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Write a program to count the number of leaves in a Binary Tree
 * @author Devashri
 *
 */
public class NumberOfLeaves {
	
	//recursive approach
	public static int countNumberOfLeaves(TreeNode root){
		if(root==null){
			return 0;
		}else if(root.leftChild==null && root.rightChild==null){
			return 1;
		}else{
			return countNumberOfLeaves(root.leftChild)+countNumberOfLeaves(root.rightChild);
		}
	}
	
	//iterative approach
	public static int countNumberOfLeavesIterative(TreeNode root){
		
		if(root==null){
			return 0;
		}
		
		int count = 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		while(!q.isEmpty()){
			
			TreeNode node = q.poll();
			if(node.leftChild==null && node.rightChild==null){
				count++;
			}
			
			if(node.leftChild!=null){
				q.add(node.leftChild);
			}
			
			if(node.rightChild!=null){
				q.add(node.rightChild);
			}
			
		}
		
		return count;
		
	}
	
}
