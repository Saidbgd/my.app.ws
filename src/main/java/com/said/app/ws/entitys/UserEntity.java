package com.said.app.ws.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity (name="users")
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1537574300727041802L;
	
	
	@Id
	@GeneratedValue
	private long Id;
	@Column(nullable = false , length = 50)
	private String userId;
	@Column(nullable = false, length = 50)
	private String Firstname;
	@Column(nullable = false,length = 50)
	private String Lastname;
	@Column(nullable = false,length = 120)
	private String Email;
	@Column(nullable = false)
	private String EncryptedPassword;
	@Column(nullable = true)
	private String EmailVerificationTaken;
	@Column(nullable = false)
	private Boolean EmailVerificationStatus=false;
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
