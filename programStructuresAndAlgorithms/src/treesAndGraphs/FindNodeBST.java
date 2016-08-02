package treesAndGraphs;

/**
 * Find a node in a Binary Search Tree from a given value
 * @author Devashri
 *
 */
public class FindNodeBST {
	
	//iterative approach
	public static TreeNode findNodeIterative(TreeNode root,int value){
			
		if(root == null){
			return null;
		}
		TreeNode cur = root;
		while(cur!=null){
			
			if(cur!=null && cur.key==value){
				return cur;
			}
			
			if(value < cur.key){
				cur = cur.leftChild;
			}else{
				cur=cur.rightChild;
			}
			
		}
		
		return null;
	}
	
	//recursive approach
	public static TreeNode findNodeRecursive(TreeNode node,int value){
		if(node==null){
			return null;
		}
		
		if(value<node.key){
			return findNodeRecursive(node.leftChild, value);
		}else if(value>node.key){
			return findNodeRecursive(node.rightChild, value);
		}else{
			return node;
		}
		
	}
	
}
