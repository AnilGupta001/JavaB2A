package com.empo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long ID;
private String firstName;
private String lastName;
private String emailId;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
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
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Employee(long iD, String firstName, String lastName, String emailId) {
	super();
	ID = iD;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


	
}
