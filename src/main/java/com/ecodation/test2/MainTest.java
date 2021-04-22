package com.ecodation.test2;

import com.hamit.hibernatebean.Register;

public class MainTest {

	public static void main(String[] args) {

		// Adı transaction
		// C=create +
		// R=read find -
		// U=update +
		// D=delete +

		// persist
		Register register = new Register("Hamit Mızrak 44", "hamitmizrak@gmail.com", "şifre");
		CreateClass createClass = new CreateClass();
		createClass.createHibernate(register);

		// find
		// FindClass findClass = new FindClass();
		// Register register = findClass.findHibernate(1);
		// System.out.println(register.getId() + " " + register.getEmailAddress() + " "
		// + register.getPassword());

		// remove
		// DeleteClass deleteClass = new DeleteClass();
		// deleteClass.deleteHibernate(4);

		// merge
		// UpdateClass updateClass = new UpdateClass();
		// Register register3 = new Register();
		// register3.setEmailAddress("email");
		// register3.setNameSurname("ad");
		// updateClass.updateHibernate(1, register3);
	}
}
