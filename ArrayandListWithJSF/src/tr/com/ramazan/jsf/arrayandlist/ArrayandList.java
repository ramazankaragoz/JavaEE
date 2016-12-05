package tr.com.ramazan.jsf.arrayandlist;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.sun.tracing.dtrace.ModuleName;


@ManagedBean
public class ArrayandList {

	private String vegetable;
	private String fruit;
	private String[] vegetables;
	private List<String> fruits;
	
	public ArrayandList()
	{
		vegatables();
		fruits();
	}
	
	public void vegatables()
	{
		vegetables=new String[3];
		
		vegetables[0]="Cucumber";
		vegetables[1]="Eggplant";
		vegetables[2]="Lettuce";
	}
	
	public void fruits()
	{
		fruits=new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Strawberry");
	}

	//Define Getter and Setter
	public String getVegetable() {
		return vegetable;
	}

	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String[] getVegetables() {
		return vegetables;
	}

	public void setVegetables(String[] vegetables) {
		this.vegetables = vegetables;
	}

	public List<String> getFruits() {
		return fruits;
	}

	
}
