
class UncompensatedProduct extends Product {

	public UncompensatedProduct(String code, String name, double basicPrice, int quantity) {
		super(code, name, basicPrice, quantity);
	}

	public double UncompensatedPrice() {
		return super.getBasicPrice();
	}

}
