package treesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Check if a binary tree is a valid binary search tree
 * @param root
 * @return
 */
public class ValidateBST {

	/**
	 * Recursive Method
	 * @param root
	 * @return
	 */
	public static boolean validateBST(TreeNode root) {
		return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	public static boolean isValid(TreeNode n, double min, double max) {
		if (n == null) {
			return true;
		}

		if (n.key <= min || n.key >max) {
			return false;
		}

		return (isValid(n.leftChild, min, n.key) && isValid(n.rightChild, n.key, max));
	}
	
	/**
	 * Iterative Method
	 * @param root
	 * @return
	 */
	 public boolean isValidBSTIterative(TreeNode root) {
	        
	        if(root==null){
	            return true;
	        }
	        
	        Queue<BNode> q = new LinkedList<BNode>();
	        q.add(new BNode(root,Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY));
	        
	        while(!q.isEmpty()){
	            
	            BNode b = q.poll();
	            
	            if(b.node.key<=b.left || b.node.key>=b.right){
	                return false;
	            }
	            
	            if(b.node.leftChild!=null){
	                q.add(new BNode(b.node.leftChild,b.left,b.node.key));
	            }
	            
	            if(b.node.rightChild!=null){
	                q.add(new BNode(b.node.rightChild,b.node.key,b.right));
	            }
	            
	        }
	        return true;
	    }
		

}
