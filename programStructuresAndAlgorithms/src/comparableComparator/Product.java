package comparableComparator;

public class Product implements Comparable<Product>{

	private String productName;
	private String productCategory;
	private int prodId;
	private double price;
	
	public Product(String productName,String productCategory,int prodId,double price) {
		// TODO Auto-generated constructor stub
		this.productName=productName;
		this.price=price;
		this.prodId=prodId;
		this.productCategory=productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Product p) {
		// TODO Auto-generated method stub
//		int s1 = this.productName.length();
//		int s2 = p.productName.length();
//		
//		if(s1<s2){
//			return -1;
//		}else if(s1>s2){
//			return 1;
//		}else{
//			return 0;
//		}
		
		return this.productName.compareTo(p.productName);
	}
	
	
	
	
	
	
	
}
