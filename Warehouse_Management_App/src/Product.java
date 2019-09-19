
abstract class Product {

	private String code;
	private String name;
	private double basicPrice;
	private int quantity;

	public Product(String code, String name, double basicPrice, int quantity) {
		this.code = code;
		this.name = name;
		this.basicPrice = basicPrice;
		this.quantity = quantity;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicPrice() {
		return basicPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "Product details: \n" + "Code: " + code + " Name: " + name + " Price: " + basicPrice + " $ " + " Quantity: "
				+ quantity ;

	}

}
