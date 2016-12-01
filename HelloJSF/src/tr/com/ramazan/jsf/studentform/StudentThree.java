package tr.com.ramazan.jsf.studentform;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentThree {

	private String firstName;
	private String lastName;
	private String favoriteLanguage;
	
	//Create no-arg constructor
	public StudentThree() {
		// TODO Auto-generated constructor stub
	}

	
	//Define getter and setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	
	
}
