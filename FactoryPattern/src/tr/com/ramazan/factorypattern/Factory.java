package tr.com.ramazan.factorypattern;

public class Factory {

	//Singleton
	private static Factory instance;
	
	public static Factory getInstance()
	{
		if(instance==null)
		{
			instance=new Factory();
		}
		return instance;
	}
	
	private Factory()
	{
		
	}
	//end of the Singleton
	
	public ProductI injectProduct()
	{
		return new Product();
	}
	
}
