package com.sharyar.jewelrysystem.db.user.dto;

public class UserDTO {

	enum Type{
		Admin,
		Customer
	}
	
	
	private int id;
	private String fname;
	private String lname;
	private int phone;
	private String email;
	private Type type;
	
	public UserDTO(int id, String fname, String lname,int phone, String email, Type type) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
		this.type = type;
	}
	
	public UserDTO() {
		
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFname() {
		return fname;
	}
	 
	 
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLname() {
		return lname;
	}
	
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getPhone() {
		return phone;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	
	public void setType(Type type) {
		this.type = type;
	}
	public Type getType() {
		return type;
	}
}
