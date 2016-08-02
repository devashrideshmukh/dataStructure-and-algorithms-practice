package stacksAndQueues.Problem6_CTCI;

import java.util.LinkedList;

public class AnimalQueue {
	LinkedList<Dog> dogList;
	LinkedList<Cat> catList;
	private int order;
	
	public AnimalQueue() {
		dogList = new LinkedList<Dog>();
		catList = new LinkedList<Cat>();
		order = 0;
	}
	
	public void enqueue(Animal animal){
		order++;
		animal.setOrder(order);
		if(animal instanceof Dog){
			dogList.addLast((Dog)animal);
		}else if(animal instanceof Cat){
			catList.addLast((Cat)animal);
		}
	}
	
	public Animal dequeueAny(){
		if(dogList.size()==0){
			return dequeueDog();
		}else if(catList.size()==0){
			return dequeueCat();
		}else{
			if(dogList.getFirst().isOlderThan(catList.getFirst())){
				return dequeueDog();
			}else{
				return dequeueCat();
			}
		} 
	}
	
	public Dog dequeueDog(){
		return dogList.poll();
	}
	
	public Cat dequeueCat(){
		return catList.poll();
	}
}
