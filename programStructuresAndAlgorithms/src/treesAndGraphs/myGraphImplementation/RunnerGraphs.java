package treesAndGraphs.myGraphImplementation;

import moderateQuestions.Problem1_CTCI_Mod;
import treesAndGraphs.Problem1_CTCI_TG;

public class RunnerGraphs {

	public static void main(String[] args) {
		MyGraph<Person> graph = new MyGraph<Person>(false);
		Person A = new Person("0");
		Person B = new Person("1");
		Person C = new Person("2");
		Person D = new Person("3");
		Person E = new Person("4");
		Person F = new Person("5");
		
		graph.addEdge(A, B);
		graph.addEdge(A,E);
		graph.addEdge(A,F);
		graph.addEdge(B,D);
		graph.addEdge(B,E);
		graph.addEdge(C,B);
		graph.addEdge(D,C);
		System.out.println(graph.toString());
		System.out.println("BFS");
		GraphTraversals.breadthFirstSearch(graph, A);
		System.out.println("\nDFS");
		GraphTraversals.depthFirstSearch(graph, A);
		System.out.println("\nDoes route exists between 2 and 5 "+Problem1_CTCI_TG.ifRouteExists(graph, C, F));
		System.out.println("\nDoes route exists between 0 and 5 "+Problem1_CTCI_TG.ifRouteExists(graph, A, F));
		System.out.println("\nDoes route exists between 5 and 0 "+Problem1_CTCI_TG.ifRouteExists(graph, F,A));
		
	}
		
}
