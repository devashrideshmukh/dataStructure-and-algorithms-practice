package objectOrientedProgramming.hashtable;

public class RunnerHashTable {

	public static void main(String[] args) {
		Hasher<String, Integer> map = new Hasher<String, Integer>(3);
		map.put("Devashri", 25);
		map.put("Dilip", 62);
		map.put("Deepti", 55);
		
		System.out.println("Devashri-->"+map.get("Devashri"));
		map.remove("Devashri");
		System.out.println("Devashri-->"+map.get("Devashri"));
		System.out.println("Deepti-->"+map.get("Deepti"));
	}
}

