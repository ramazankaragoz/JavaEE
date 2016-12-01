package tr.com.ramazan.jsf.studentform;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	
	private String firstName;
	private String lastName;
	private String country;
	
	//list of countries for the drop-down list
	List<String> countryOptions;
	
	
	//Create no-arg constructor
	public StudentTwo() {
		//populate the list of countries
		countryOptions=new ArrayList<String>();
		countryOptions.add("Turkey");
		countryOptions.add("Brazil");
		countryOptions.add("India");
		countryOptions.add("United Kingdom");
		countryOptions.add("United States");
	}
	
	//need only getter method for List
	public List<String> getCountryOptions() {
		return countryOptions;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
