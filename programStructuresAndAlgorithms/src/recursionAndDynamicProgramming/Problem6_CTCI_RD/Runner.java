package recursionAndDynamicProgramming.Problem6_CTCI_RD;

/**
 * Towers of Hanoi: In the classic problem of the Towers of Hanoi, you have 3
 * towers and N disks of different sizes which can slide onto any tower.The
 * puzzle starts with disks sorted in ascending order of size from top to bottom
 * (Le., each disk sits on top of an even larger one). You have the following
 * constraints: (1) Only one disk can be moved at a time. (2) A disk is slid off
 * the top of one tower onto another tower. (3) A disk cannot be placed on top
 * of a smaller disk. Write a program to move the disks from the first tower to
 * the last using Stacks.
 * 
 * O(2)
 * 
 * @author Devashri
 *
 */
public class Runner {
	
	public static void main(String[] args) {
		int numberOfTowers = 3;
		int numeberOfDisks = 4;
		Integer numberOfMoves = 0;
		Tower[] towers = setUpTowers(numberOfTowers, numeberOfDisks);
		System.out.println(towers[0].toString());
		towers[0].moveDisks(numeberOfDisks, towers[2], towers[1], numberOfMoves);
		System.out.println(towers[2].toString());
		System.out.println("No of Moves" + numberOfMoves);
	}

	public static Tower[] setUpTowers(int numberOfTowers, int numberOfDisks) {

		Tower[] towers = new Tower[numberOfTowers];
		for (int i = 0; i < numberOfTowers; i++) {
			towers[i] = new Tower(i);
		}

		for (int i = numberOfDisks - 1; i >= 0; i--) {
			towers[0].add(i);
		}

		return towers;
	}
}
