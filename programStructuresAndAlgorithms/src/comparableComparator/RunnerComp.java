package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class RunnerComp {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		Product p1 = new Product("phone", "elec", 1, 699);
		Product p2 = new Product("watch", "elec", 2, 339);
		Product p3 = new Product("tide", "grocery", 3, 9);
		Product p4 = new Product("pen", "stationary", 4, 1);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		Collections.sort(list);
		for(Product p:list){
			System.out.println(p.getProductName());
		}
		
		
		Collections.sort(list,new StringLengthComparator());
		for(Product p:list){
			System.out.println(p.getProductName());
		}
		
		Collections.sort(list,new PriceComparator());
		for(Product p:list){
			System.out.println(p.getProductName()+p.getPrice());
		}
		
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("phone", 699);
		map.put("watch", 339);
		map.put("tide", 9);
		map.put("pen", 1);
		
		Comparator<String> comparator = new ValueComparator(map);
		TreeMap<String,Integer> sortedMap = new TreeMap<String,Integer>(comparator);
		sortedMap.putAll(map);
		System.err.println("MAP");
		for(String key:sortedMap.keySet()){
			System.out.println(map.get(key));
		}
		
		
	}
}
