package comparableComparator;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		int len1 = p1.getProductName().length();
		int len2 = p2.getProductName().length();
		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			return 0;
		}
	}

}
