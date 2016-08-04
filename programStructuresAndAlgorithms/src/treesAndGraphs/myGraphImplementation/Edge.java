package treesAndGraphs.myGraphImplementation;

/**
 * This represents the edges of a graph
 * @author Devashri
 *
 * @param <T>
 */
public class Edge<T> {

	private T vertex;

	public Edge(T vertex) {
		this.vertex = vertex;
	}

	public T getVertex() {
		return vertex;
	}

	public void setVertex(T vertex) {
		this.vertex = vertex;
	}

	@Override
	public String toString() {
		return "(" + vertex + ")";
	}
}
