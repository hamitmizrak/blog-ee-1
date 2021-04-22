package com.ecodation.hibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginHib implements Serializable {
	private static final long serialVersionUID = 478280159795475878L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loginId;
	
	
	private String name;
	private String surname;
	private String emailAddress;
	private String password;
	private String telephoneNumber;
	
	
	public LoginHib ( ) {
		// TODO Auto-generated constructor stub
	}


	public LoginHib (
			long loginId , String name , String surname , String emailAddress , String password , String telephoneNumber
	) {
		//super ( );
		this.loginId			= loginId;
		this.name				= name;
		this.surname			= surname;
		this.emailAddress		= emailAddress;
		this.password			= password;
		this.telephoneNumber	= telephoneNumber;
	}


	@Override
	public String toString ( ) {
		return "LoginHib [loginId=" + loginId + ", name=" + name + ", surname=" + surname + ", emailAddress="
				+ emailAddress + ", password=" + password + ", telephoneNumber=" + telephoneNumber + "]";
	}


	
	public long getLoginId ( ) {
		return loginId;
	}


	
	public void setLoginId ( long loginId ) {
		this.loginId = loginId;
	}


	
	public String getName ( ) {
		return name;
	}


	
	public void setName ( String name ) {
		this.name = name;
	}


	
	public String getSurname ( ) {
		return surname;
	}


	
	public void setSurname ( String surname ) {
		this.surname = surname;
	}


	
	public String getEmailAddress ( ) {
		return emailAddress;
	}


	
	public void setEmailAddress ( String emailAddress ) {
		this.emailAddress = emailAddress;
	}


	
	public String getPassword ( ) {
		return password;
	}


	
	public void setPassword ( String password ) {
		this.password = password;
	}


	
	public String getTelephoneNumber ( ) {
		return telephoneNumber;
	}


	
	public void setTelephoneNumber ( String telephoneNumber ) {
		this.telephoneNumber = telephoneNumber;
	}


	
	public static long getSerialversionuid ( ) {
		return serialVersionUID;
	}
	
	
	
}
