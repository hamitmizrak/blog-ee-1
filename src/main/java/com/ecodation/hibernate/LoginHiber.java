package com.ecodation.hibernate;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "register")
public class LoginHiber implements Serializable {
	private static final long serialVersionUID = 8055489109392798370L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long registerId;
	
	@Column(length = 250)
	private String registerName;
	
	@Column(length = 250)
	private String registerSurname;
	
	@Column(length = 50)
	private String registerEmail;
	
	@Column(length = 20)
	private String  registerPassword;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	//parametresiz constructor
	public LoginHiber ( ) {
		// TODO Auto-generated constructor stub
	}

	//parametreli constructor
	public LoginHiber (
			long registerId , String registerName , String registerSurname , String registerEmail ,
			String registerPassword , Date creationDate
	) {
		super ( );
		this.registerId		= registerId;
		this.registerName		= registerName;
		this.registerSurname	= registerSurname;
		this.registerEmail		= registerEmail;
		this.registerPassword	= registerPassword;
		this.creationDate		= creationDate;
	}

	//toString  
	@Override
	public String toString ( ) {
		return "LoginHiber [registerId=" + registerId + ", registerName=" + registerName + ", registerSurname="
				+ registerSurname + ", registerEmail=" + registerEmail + ", registerPassword=" + registerPassword
				+ ", creationDate=" + creationDate + "]";
	}

	//Hsahcode  
	@Override
	public int hashCode ( ) {
		return Objects.hash ( creationDate , registerEmail , registerId , registerName , registerPassword ,
				registerSurname );
	}

	//equals  
	@Override
	public boolean equals ( Object obj ) {
		if ( this == obj )
			return true;
		if ( obj == null )
			return false;
		if ( getClass ( ) != obj.getClass ( ) )
			return false;
		LoginHiber other = ( LoginHiber ) obj;
		return Objects.equals ( creationDate , other.creationDate )
				&& Objects.equals ( registerEmail , other.registerEmail ) && registerId == other.registerId
				&& Objects.equals ( registerName , other.registerName )
				&& Objects.equals ( registerPassword , other.registerPassword )
				&& Objects.equals ( registerSurname , other.registerSurname );
	}

	//getter and setter
	public long getRegisterId ( ) {
		return registerId;
	}

	
	public void setRegisterId ( long registerId ) {
		this.registerId = registerId;
	}

	
	public String getRegisterName ( ) {
		return registerName;
	}

	
	public void setRegisterName ( String registerName ) {
		this.registerName = registerName;
	}

	
	public String getRegisterSurname ( ) {
		return registerSurname;
	}

	
	public void setRegisterSurname ( String registerSurname ) {
		this.registerSurname = registerSurname;
	}

	
	public String getRegisterEmail ( ) {
		return registerEmail;
	}

	
	public void setRegisterEmail ( String registerEmail ) {
		this.registerEmail = registerEmail;
	}

	
	public String getRegisterPassword ( ) {
		return registerPassword;
	}

	
	public void setRegisterPassword ( String registerPassword ) {
		this.registerPassword = registerPassword;
	}

	
	public Date getCreationDate ( ) {
		return creationDate;
	}

	
	public void setCreationDate ( Date creationDate ) {
		this.creationDate = creationDate;
	}

	
	public static long getSerialversionuid ( ) {
		return serialVersionUID;
	}


	
	
	
	

}
