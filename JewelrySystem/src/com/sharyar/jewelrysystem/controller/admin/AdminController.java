package com.sharyar.jewelrysystem.controller.admin;

import java.util.*;
import java.util.stream.*;

import com.sharyar.jewelrysystem.common.impl.GenericsDao;
import com.sharyar.jewelrysystem.db.admin.dao.AdminDAO;
import com.sharyar.jewelrysystem.db.admin.dto.AdminDTO;



public class AdminController {
	
	
	private AdminDAO admindao = new AdminDAO();
	//private GenericsDao<AdminDTO> admindao = new GenericsDao<AdminDTO>();   //using generics
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
	
	
	public void nameStartingWith(String c)
	{
		
		
		
		
		
		List<String> l1 = new ArrayList<String>();
		ArrayList<AdminDTO> names = admindao.get();
		for(AdminDTO b : names)
		{
			
			l1.add(b.getName());
		}
		
		
		//using stream to search name starting with some string
		
		
		List<String> l2 = l1.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(l2);
		
	}
	
}
