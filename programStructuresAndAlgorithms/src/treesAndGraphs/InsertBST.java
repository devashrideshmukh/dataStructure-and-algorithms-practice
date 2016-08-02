package treesAndGraphs;

/**
 * Write a method to insert and element in a BST
 * @author Devashri
 *
 */
public class InsertBST {

	public static TreeNode insertInBSTIterative(int value,TreeNode root){
		TreeNode nodeToBeInserted = new TreeNode(value);
		if(root==null){
			root = nodeToBeInserted;
			return root;
		}
		
		TreeNode cur = root;
		TreeNode prev;
		while(true){
			prev = cur;
			if(value<cur.key){
				cur = cur.leftChild;
				if(cur==null){
					prev.leftChild=nodeToBeInserted;
					return root;
				}
			}else{
				cur = cur.rightChild;
				if(cur==null){
					prev.rightChild=nodeToBeInserted;
					return root;
				}
			}
		}
		
	}
	
	public static TreeNode insertRec(int value,TreeNode node){
		
		if(node==null){
			return new TreeNode(value);
		}else if(value<node.key){
			node.leftChild=insertRec(value, node.leftChild);
		}else{
			node.rightChild=insertRec(value, node.rightChild);
		}
		return node;
	}
	
	
}
