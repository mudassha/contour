package com.sharyar.jewelrysystem.db.admin.dao;

import java.util.ArrayList;

import com.sharyar.jewelrysystem.db.admin.dto.AdminDTO;



public class AdminDAO {

ArrayList<AdminDTO> a = new ArrayList<AdminDTO>();
	
	//responsible for database handling and updating and getting data from database for Admin
	public void add(AdminDTO admin) {
		System.out.println("Calling add mehtod of AdminDao");
		a.add(admin);
	}
	
	public void editName(String oldname, String newname) {
	
	}
	public void editEmail() {
		
	}
	public ArrayList<AdminDTO> get() {
		return a;
	}
	public void delete(AdminDTO admin) {
		// TODO Auto-generated method stub
		a.remove(admin);
	}
}
