package tr.com.ramazan.CompositeBean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CompositeBean {

	private String name;
	private String surname;
	
	public CompositeBean()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
