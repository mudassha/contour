package com.sharyar.jewelrysystem.db.admin.dto;

public class AdminDTO {
	

	private int id;
	private String name;
	private String email;
	private String type; // create enum
	
	public AdminDTO(int id, String name,String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public void setId(int id) {
		
		this.id = id;
		
	}
	public int getId() {
		
		return id;
		
	}
	public void setName(String name) {
		
		this.name = name;
		
	}
	public String getName() {
		
		return name;
		
	}
	public void setEmail(String email) {
		
		this.email = email;
	
	}
	public String getEmail() {
	
		return email;
	
	}

}
