package treesAndGraphs.myGraphImplementation;

public class Person {
	
	private String name;
	
	boolean isVisited;
	
	public Person(String name) {
		this.name = name;
		isVisited = false;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
