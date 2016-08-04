package treesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import treesAndGraphs.myGraphImplementation.MyGraph;
import treesAndGraphs.myGraphImplementation.Person;

/**
 * Route Between Nodes: Given a directed graph design an algorithm to find out
 * if there is a route between two nodes
 * 
 * @author Devashri
 *
 */
public class Problem1_CTCI_TG {
	public static void main(String[] args) {
		MyGraph<Person> graph = new MyGraph<Person>(true);
		Person A = new Person("A");
		Person B = new Person("B");
		Person C = new Person("C");
		Person D = new Person("D");
		Person E = new Person("E");
		Person F = new Person("F");
		Person G = new Person("G");
		Person H = new Person("H");
		Person S = new Person("S");
		graph.addEdge(A, B);
		graph.addEdge(A, S);
		graph.addEdge(S, C);
		graph.addEdge(S, G);
		graph.addEdge(C, D);
		graph.addEdge(C, E);
		graph.addEdge(C, F);
		graph.addEdge(G, F);
		graph.addEdge(E, H);
		graph.addEdge(G, H);
		System.out.println("Between A & D"+ Problem1_CTCI_TG.ifRouteExists(graph, A, D));
		
	}
	
	public static boolean ifRouteExists(MyGraph<Person> graph,Person p1,Person p2){
		Queue<Person> queue = new LinkedList<Person>();
		ArrayList<Person> visitedNodes = new ArrayList<>();
		queue.add(p1);
		if(p1==p2){
			return true;
		}
		while(!queue.isEmpty()){
			Person p = queue.poll();
			visitedNodes.add(p);
			for(Person adjPer:graph.getListOfAdjacentVertices(p)){
				if(!visitedNodes.contains(adjPer) && !queue.contains(p)){
					if(adjPer==p2){
						return true;
					}else{
						queue.add(adjPer);
					}
				}
			}
		}
		return false;
	}
}
