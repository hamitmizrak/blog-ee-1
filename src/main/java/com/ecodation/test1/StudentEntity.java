package com.ecodation.test1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {
	private static final long serialVersionUID = 7456960858341426761L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name_surname")
	private String nameSurname;

	@Column(name = "password")
	private String password;

	@Column(name = "email_adress")
	private String emailAddress;

	public StudentEntity() {
		this.id = 0L;
	}

	public StudentEntity(String nameSurname, String password, String emailAddress) {
		this.nameSurname = nameSurname;
		this.password = password;
		this.emailAddress = emailAddress;
	}

	// getter and setter
	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", nameSurname=" + nameSurname + ", password=" + password + ", emailAddress="
				+ emailAddress + "]";
	}

}
