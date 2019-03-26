package com.cts.medcrateplus.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Login")
@Table(name="Login")
public class Login {
	
	public Login(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	@Id 
	@Column(name="userId")
	private String userId;
	private String firstName;
	private String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String password;
	private String userType;
	private String status;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Login() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Login [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", userType=" + userType + ", status=" + status + "]";
	}
	
}
