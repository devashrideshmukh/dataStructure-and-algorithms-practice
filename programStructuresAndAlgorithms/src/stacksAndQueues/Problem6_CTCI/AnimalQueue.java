package stacksAndQueues.Problem6_CTCI;

import java.util.LinkedList;

/**
 * Animal Shelter: An animal shelter, which holds only dogs and cats, operates
 * on a strictly “first in, first out” basis. People must adopt either the
 * “oldest” (based on arrival time) of all animals at the shelter, or they can
 * select whether they would prefer a dog or a cat (and will receive the oldest
 * animal of that type). They cannot select which specific animal they would
 * like. Create the data structures to maintain this system and implement
 * operations such as enqueue, dequeue, dequeueDog, and dequeueCat. You may use
 * built in LinkedList data structure.
 * 
 * @author Devashri
 *
 */
public class AnimalQueue {
	LinkedList<Dog> dogList;
	LinkedList<Cat> catList;
	//variable to maintain order
	private int order;

	public AnimalQueue() {
		dogList = new LinkedList<Dog>();
		catList = new LinkedList<Cat>();
		order = 0;
	}

	public void enqueue(Animal animal) {
		order++;
		animal.setOrder(order);
		if (animal instanceof Dog) {
			dogList.addLast((Dog) animal);
		} else if (animal instanceof Cat) {
			catList.addLast((Cat) animal);
		}
	}

	public Animal dequeueAny() {
		if (catList.size() == 0) {
			return dequeueDog();
		} else if (dogList.size() == 0) {
			return dequeueCat();
		} else {
			if (dogList.getFirst().isOlderThan(catList.getFirst())) {
				return dequeueDog();
			} else {
				return dequeueCat();
			}
		}
	}

	public Dog dequeueDog() {
		return dogList.poll();
	}

	public Cat dequeueCat() {
		return catList.poll();
	}
}
