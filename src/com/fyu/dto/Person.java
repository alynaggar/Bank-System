package com.fyu.dto;

public class Person {

	private String name;
	private int age;
	private String gender;
	private String ssn;
	private String nationality;
	private String address;
	private String socialStatus;
	private String mail;
	private String phone;

	public Person(String name, int age, String gender, String ssn, String nationality, String address,
			String socialStatus, String mail, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ssn = ssn;
		this.nationality = nationality;
		this.address = address;
		this.socialStatus = socialStatus;
		this.mail = mail;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getSsn() {
		return ssn;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSocialStatus() {
		return socialStatus;
	}

	public void setSocialStatus(String socialStatus) {
		this.socialStatus = socialStatus;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
