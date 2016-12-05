package tr.com.ramazan.jsf.formvalidation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormValidation{
	private String name;
	private String surname;
	private String email;
	private String password;
	
	private String county;
	private List<String> counties;
	
	private String gender;
	private List<String> genders;
	
	private String address;
	
	private String english;
	private List<String> englishLevel;
	
	public FormValidation()
	{
		countiesR();
		gendersR();
		englishLevelR();
	}
	
	public void countiesR()
	{
		counties=new ArrayList<String>();
		
		counties.add("Ankara");
		counties.add("Istenbul");
		
	}
	
	public void gendersR()
	{
		genders=new ArrayList<String>();
		genders.add("Male");
		genders.add("Female");
	}
	
	public void englishLevelR()
	{
		englishLevel=new ArrayList<String>();
		englishLevel.add("Basic");
		englishLevel.add("Average");
		englishLevel.add("Good");
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	
	
	public List<String> getCounties() {
		return counties;
	}


	public List<String> getGenders() {
		return genders;
	}


	public List<String> getEnglishLevel() {
		return englishLevel;
	}

}
