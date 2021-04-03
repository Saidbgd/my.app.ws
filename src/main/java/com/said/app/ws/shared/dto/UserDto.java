package com.said.app.ws.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5149602169055365384L;
	private long Id;
	private String userId;
	private String Firstname;
	private String Lastname;
	private String Email;
	private String Password;
	private String EncryptedPassword;
	private String EmailVerificationTaken;
	private Boolean EmailVerificationStatus = false;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEncryptedPassword() {
		return EncryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		EncryptedPassword = encryptedPassword;
	}
	public String getEmailVerificationTaken() {
		return EmailVerificationTaken;
	}
	public void setEmailVerificationTaken(String emailVerificationTaken) {
		EmailVerificationTaken = emailVerificationTaken;
	}
	public Boolean getEmailVerificationStatus() {
		return EmailVerificationStatus;
	}
	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		EmailVerificationStatus = emailVerificationStatus;
	}
	
	
	
}
