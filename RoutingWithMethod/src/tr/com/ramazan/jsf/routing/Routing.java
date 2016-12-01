package tr.com.ramazan.jsf.routing;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Routing {
	
	private int number;

	
	
	//Define getter and setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	//page routing method
	public String pageRouting()
	{
		if(number>50)
		{
			return "large?faces-redirect=true";
		}
		else if(number<50)
		{
			return "small?faces-redirect=true";
		}
		else
		{
			return "equal?faces-redirect=true";
		}
		
	}
	
	
}
