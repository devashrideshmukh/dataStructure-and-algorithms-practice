package comparableComparator;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		double p1 = o1.getPrice();
		double p2 = o2.getPrice();
		if(p1>p2){
			return 1;
		}else if(p2>p1){
			return -1;
		}else{
			return 0;
		}
	}

}
