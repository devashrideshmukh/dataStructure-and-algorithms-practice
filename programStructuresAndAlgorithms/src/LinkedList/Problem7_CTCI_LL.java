package LinkedList;

import java.util.HashSet;

/**
 * Given two singly linked lists determine if the two intersect. Return the
 * intersecting node.
 * 
 * Intersection is defined based on reference and not on value
 * 
 * @author Devashri
 *
 */
public class Problem7_CTCI_LL {

	/**
	 * Using hashset Time O(n+m) Space O(n)
	 * 
	 * @param headA
	 * @param headB
	 * @return
	 */
	public Node getIntersectionNodeUsingHashSet(Node headA, Node headB) {
		HashSet<Node> set = new HashSet<>();
		if (headA == null || headB == null) {
			return null;
		}
		Node pointerA = headA;

		while (pointerA != null) {
			set.add(pointerA);
			pointerA = pointerA.next;
		}
		Node pointerB = headB;

		while (pointerB != null) {
			if (set.contains(pointerB)) {
				return pointerB;
			}
			pointerB = pointerB.next;
		}

		return null;
	}

	public Node findIntersectionWithoutUsingExtraDataStructure(Node headA, Node headB) {
		 int lengthA = 0;
	        Node tempA = headA;
	        
	        //finding length of list A
	        while(tempA!=null){
	            lengthA++;
	            tempA = tempA.next;
	        }
	        
	        int lengthB = 0;
	        Node tempB = headB;
	        
	        //finding length of list B
	        while(tempB!=null){
	            lengthB++;
	            tempB = tempB.next;
	        }
	        
	        //check if tail of both is same
	        if(tempA!=tempB){
	            return null;
	        }
	        
	        //put longer one in tempA shorter list in tempB
	        if(lengthA>=lengthB){
	            tempA = headA;
	            tempB = headB;
	        }else{
	            tempA = headB;
	            tempB = headA;
	        }
	        
	        int diff = Math.abs(lengthA-lengthB);
	        
	        //move tempA by diff number of ListNodes
	        for(int i=0;i<diff;i++){
	            tempA=tempA.next;
	        }
	        
	        //find common node
	        while(tempA!=tempB){
	            tempA=tempA.next;
	            tempB=tempB.next;
	        }
	        
	        return tempA;
	}

}
