package tr.com.ramazan.factorypattern;

import java.util.Date;

public class Product implements ProductI{

	private String serialNumber;
	private Date productDate;
	

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return "I am a Product.";
	}

	@Override
	public String getProductSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumber;
	}

	@Override
	public Date getProductionDate() {
		// TODO Auto-generated method stub
		return productDate;
	}

	
}
