package stacksAndQueues.Problem6_CTCI;

public class Animal {
	
	private int order;
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public int getOrder() {
		return order;
	}
	
	public String getName() {
		return name;
	}
	
	public void setOrder(int order) {
		this.order = order;
	}
	
	public boolean isOlderThan(Animal a){
		return this.order>a.order;
	}
	
}
