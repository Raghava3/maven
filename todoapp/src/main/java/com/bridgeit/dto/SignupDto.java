package com.bridgeit.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author bridgelabz3
 * this is DTO class for signup
 */
@Entity
@Table(name="todo")
public class SignupDto  implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="abc",strategy="increment")
	@GeneratedValue(generator="abc")
	int id;
	@Column(name="FIRSTNAME")
	String fname;
	@Column(name="MIDDLENAME")
	String mname;
	@Column(name="LASTNAME")
	String lname;
	@Column(name="EMAIL")
	String email;
	@Column(name="PASS")
	String pass;
	
	public SignupDto() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
