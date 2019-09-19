
class CompensatedProduct extends Product {

	private double discountCoefficient;

	public CompensatedProduct(String code, String name, double basicPrice, int quantity, double discountCoefficient) {
		super(code, name, basicPrice, quantity);

		if (discountCoefficient < 0 || discountCoefficient > 1) {
			throw new RuntimeException("The discount coefficient must be between 0-1");
		} else
			this.discountCoefficient = discountCoefficient;
	}

	public double CompensatedPrice() {
		return super.getBasicPrice() * discountCoefficient;
	}

	public String toString() {
		return "Product details: \n" + "Code: " + super.getCode() + " Name: " + super.getName() + " Price: "
				+ CompensatedPrice() + " $ " + " Quantity: " + super.getQuantity();
	}

}
