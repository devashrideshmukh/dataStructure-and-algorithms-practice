package treesAndGraphs.myGraphImplementation;

import java.util.*;

public class MyGraph<T> {

	private boolean isDirected;
	private HashMap<T, ArrayList<Edge<T>>> adjList;
	private ArrayList<T> listOfVertices;

	public MyGraph(boolean isDirected) {
		this.isDirected = isDirected;
		adjList = new HashMap<>();
		listOfVertices = new ArrayList<>();
	}
	
	public HashMap<T, ArrayList<Edge<T>>> getAdjList() {
		return adjList;
	}
	
	public ArrayList<T> getListOfVertices() {
		return listOfVertices;
	}
	
	/**
	 * This method returns a list of all adjacent vertices of the give vertex without weight
	 * 
	 * @param vertex the source vertex 
	 * @return an array list containing the vertices
	 */
	public ArrayList<T> getListOfAdjacentVertices(T vertex){
		ArrayList<T> listOfAdjVertices = new ArrayList<>();
		for(Edge<T> edge:adjList.get(vertex)){
			listOfAdjVertices.add(edge.getVertex());
		}
		return listOfAdjVertices;
	}
	
	/**
	 * This method adds and edge between two vertices
	 * @param vertex1
	 * @param vertex2
	 * @return returns true if addition is successful
	 */
	public boolean addEdge(T vertex1, T vertex2){
		
		if(isDirected){
			return false;
		}
		
		if(!adjList.containsKey(vertex1)){
			ArrayList<Edge<T>> list = new ArrayList<>();
			list.add(new Edge<T>(vertex2));
			addVertex(vertex1,list);
			return true;
		}
		
		if(!adjList.containsKey(vertex2)){
			ArrayList<Edge<T>> list = new ArrayList<>();
			list.add(new Edge<T>(vertex1));
			addVertex(vertex2,list);
			return true;
		}
		
		adjList.get(vertex1).add(new Edge<T>(vertex2));
		adjList.get(vertex2).add(new Edge<T>(vertex1));
		return true;
	}
	
	/**
	 * Add vertex - helper method
	 * @param vertex
	 * @param correspondingList
	 */
	public void addVertex(T vertex,ArrayList<Edge<T>> correspondingList){
		
		//make an entry to the map
		adjList.put(vertex, correspondingList);
		//add the vertex to the list of vertices
		listOfVertices.add(vertex);
		
		for(Edge<T> edge:correspondingList){
			//get edge of given node
			ArrayList<Edge<T>> listOfGivenEdge = adjList.get(edge.getVertex());
			if(listOfGivenEdge==null){
				listOfGivenEdge = new ArrayList<Edge<T>>();
				adjList.put(edge.getVertex(), listOfGivenEdge);
				listOfVertices.add(edge.getVertex());
			}
			listOfGivenEdge.add(new Edge<T>(vertex));
		}
		
	}
	
	@Override
	public String toString() {
		String s = "";
		for (T vertex : listOfVertices) {
			s += vertex.toString();
			s += " : ";
			s += adjList.get(vertex);
			s += "\n";
		}
		return s;
	}

}
