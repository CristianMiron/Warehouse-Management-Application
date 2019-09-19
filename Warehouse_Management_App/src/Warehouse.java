import java.util.*;

class Warehouse {

	private ArrayList<Product> productList = new ArrayList();

	private boolean isPresent(Product p) {

		for (Product x : productList) {
			if (x.getCode().equals(p.getCode())) {
				x.setQuantity(x.getQuantity() + p.getQuantity());
				return true;
			}
		}
		return false;
	}

	public boolean addProduct(Product p) {
		if (!isPresent(p)) {
			return productList.add(p);
		}
		return false;
	}

	public String toString() {
		String result = "";

		for (Product x : productList) {
			result += x.toString() + "\n";
		}
		return result;
	}
	
	public void print() {
		System.out.println(toString());
	}
	
	

}
