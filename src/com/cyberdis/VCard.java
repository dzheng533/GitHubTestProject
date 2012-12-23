package com.cyberdis;

public class VCard {
	private String name;
	private String firstName;
	private String lastName;
	private String tel;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


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


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

	
	@Override
	public String toString() {
		return "VCard [name=" + name + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", tel=" + tel + "]";
	}
	
	
	
}
