
class Client {

	public static void main(String[] args) {
	
		
		Product p1 = new UncompensatedProduct("12ad","LG TV",1200,2);
		Product p2 = new CompensatedProduct("14rt","IPhone X",900,5,0.5);
		Product p3 = new CompensatedProduct("14rt","IPhone X",900,10,0.5);
		Product p4 = new CompensatedProduct("15xx","IPhone XI",1100,12,0.2);
		
		Warehouse whouse = new Warehouse();
		
		System.out.println(whouse.addProduct(p1));
		System.out.println(whouse.addProduct(p2));
		System.out.println(whouse.addProduct(p3));
		System.out.println(whouse.addProduct(p4));
		
		whouse.print();

	}

}
