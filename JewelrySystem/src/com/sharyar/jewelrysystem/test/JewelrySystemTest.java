package com.sharyar.jewelrysystem.test;

import com.sharyar.jewelrysystem.controller.admin.AdminController;
import com.sharyar.jewelrysystem.db.admin.dto.AdminDTO;

public class JewelrySystemTest {

	public static void main(String[] args)
	{
		AdminDTO a1 = new AdminDTO(1,"Shery","Shery@gmail.com");
		AdminController ac = new AdminController();
		ac.saveAdmin(a1);
		ac.printDetails();
		//ac.removeAdmin(a1);
		//ac.printDetails();
		
		
		ac.nameStartingWith("S");
		
		
	}
	
}
