package tr.com.ramazan.factorypattern;

public class Client {

	private ProductI product;
	
	public Client() {
		
		product=Factory.getInstance().injectProduct();
		
		System.out.println("Product Name: "+product.getProductName());
		System.out.println("Product Serial Number: "+product.getProductSerialNumber());
	}
	

}
