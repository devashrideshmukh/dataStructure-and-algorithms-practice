package treesAndGraphs.myGraphImplementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class GraphTraversals {

	public static void breadthFirstSearch(MyGraph<Person> graph, Person person) {
		Queue<Person> queue = new LinkedList<Person>();
		ArrayList<Person> visitedList = new ArrayList<Person>();
		queue.add(person);
		while(!queue.isEmpty()){
			
			Person p = queue.poll();
			System.out.print(p+" ");
			visitedList.add(p);
			for(Person adj:graph.getListOfAdjacentVertices(p)){
				if(!visitedList.contains(adj) && !queue.contains(adj)){
					queue.add(adj);
				}
			}
		}
	}
	
	public static void depthFirstSearch(MyGraph<Person> graph, Person person){
		
		Stack<Person> stack = new Stack<Person>();
		stack.push(person);
		person.isVisited=true;
		System.out.print(person+" ");
		while(!stack.isEmpty()){
			Person p = stack.peek();
			Person unvisitedAdjNode = getUnvisitedAdjNode(p,graph);
			if(unvisitedAdjNode==null){
				stack.pop();
			}else{
				System.out.print(unvisitedAdjNode+" ");
				unvisitedAdjNode.isVisited=true;
				stack.push(unvisitedAdjNode);
			}
			
		}
		
	}
	
	public static Person getUnvisitedAdjNode(Person node,MyGraph<Person> graph){
		ArrayList<Person> listOfAdjNode = graph.getListOfAdjacentVertices(node);
		for(Person n:listOfAdjNode){
			if(!n.isVisited){
				return n;
			}
		}
		return null;
	}
	
	

}
