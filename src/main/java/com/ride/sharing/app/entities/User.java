package com.ride.sharing.app.entities;

import java.util.ArrayList;
import java.util.List;

import com.ride.sharing.app.enums.UserType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String mobileNo;
	private String email;
	private UserType userType;
	private List<Ride> ridesOffered;

	public User(String name, int age, String gender) {
		this.age = age;
		this.name  = name;
		this.gender = gender;
		this.userType = UserType.PASSENGER;
		ridesOffered = new ArrayList<>();
	}
	
	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public List<Ride> getRidesOffered() {
		return ridesOffered;
	}

	public void setRidesOffered(List<Ride> ridesOffered) {
		this.ridesOffered = ridesOffered;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
