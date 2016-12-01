package tr.com.ramazan.jsf.formcomponents;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Student {

	private String name;
	private String surname;
	private List<String> gender=new ArrayList<String>();
	private String drivingLicence;
	private String password;
	private boolean accepted;
	private String message;
	
	//Define getter and setter
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
	
	public List<String> getGender() {
		return gender;
	}
	public void setGender(List<String> gender) {
		this.gender = gender;
	}
	public String getDrivingLicence() {
		return drivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	public String getMessage() {
		
		if(!accepted)
		{
			message="not accepted!";
		}
		else
		{
			message="It is accepted.";
		}
		
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	

}
