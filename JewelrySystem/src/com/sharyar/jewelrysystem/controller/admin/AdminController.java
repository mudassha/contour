package com.sharyar.jewelrysystem.controller.admin;

import java.util.ArrayList;

import com.sharyar.jewelrysystem.db.admin.dao.AdminDAO;
import com.sharyar.jewelrysystem.db.admin.dto.AdminDTO;



public class AdminController {
	
	
	private AdminDAO admindao = new AdminDAO();
	
	public AdminController(){
		
	}
	
	public void saveAdmin(AdminDTO admin) {
		admindao.add(admin);
	}
	public void removeAdmin(AdminDTO admin)
	{
		admindao.delete(admin);
	}
	public void printDetails() {
		
		System.out.println("Calling print details");
		ArrayList<AdminDTO> a = admindao.get();
		for(AdminDTO b : a)
		{
			System.out.println(b.getId() + "\n" + b.getName() + "\n" + b.getEmail());
		}
	}
}
