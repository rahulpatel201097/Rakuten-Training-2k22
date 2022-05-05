package com.rakuten.user;

public class Customer {
	private String name;
	private String mobileNumber;
	private int age;
	private Address address;
	private String emailId;
	private Package selectedPackage;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public Package getSelectedPackage() {
		return selectedPackage;
	}



	public void setSelectedPackage(Package selectedPackage) {
		this.selectedPackage = selectedPackage;
	}



	@Override
	public String toString() {
		return "Customer [name=" + name + ",  mobileNumber=" + mobileNumber + ",age=" + age + ",, address=" + address + " emailId=" + emailId + "]";
	}

}
