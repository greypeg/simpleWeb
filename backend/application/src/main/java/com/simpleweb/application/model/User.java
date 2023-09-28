package com.simpleweb.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.SecondaryTable;

@Entity
@Table(name = "user_info")
@SecondaryTable(name = "employee_info")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "firstname")
	private String firstName;
	@Column(name = "surname")
	private String lastName;
	@Column(name = "birthdate")
	private String birthDate;
	@Column(name = "gender")
	private String gender;
	@Column(name = "home_address")
	private String homeAddress;
	@Column(table = "employee_info", name = "work_address")
	private String workAddress;

	public User() {
	}

	public User(String firstName, String lastName, String birthDate, String gender, String homeAddress,
			String workAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
}
