package treesAndGraphs.myGraphImplementation;


public class RunnerGraphs {

	public static void main(String[] args) {
		MyGraph<Person> graph = new MyGraph<Person>(false);
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
		System.out.println(graph.toString());
		System.out.println("BFS");
		GraphTraversals.breadthFirstSearch(graph, A);
		System.out.println("\nDFS");
		GraphTraversals.depthFirstSearch(graph, A);
		
	}
		
}
