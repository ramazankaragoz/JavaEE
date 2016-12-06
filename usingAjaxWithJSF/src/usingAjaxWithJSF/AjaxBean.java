package usingAjaxWithJSF;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AjaxBean {

	private String name="";
	private String surname="";
	private String message="";
	
	
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
	public String getMessage() {
		
		if(name.equals("")&&surname.equals(""))
		{
			return message;
		}
		else
		{
			return message="Full name: "+this.name+" "+this.surname;
		}
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
