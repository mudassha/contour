package com.sharyar.jewelrysystem.db.admin.dao;

import java.util.ArrayList;


import com.sharyar.jewelrysystem.common.impl.GenericsDao;
import com.sharyar.jewelrysystem.db.admin.dto.AdminDTO;



public class AdminDAO extends GenericsDao<AdminDTO> {

	//ArrayList<AdminDTO> a = new ArrayList<AdminDTO>();
	
	//responsible for database handling and updating and getting data from database for Admin

	@Override
	public void add(AdminDTO admin) {
		System.out.println("Calling add method of AdminDao");
		super.add(admin);
	}
	
	
	@Override
	public ArrayList<AdminDTO> get() {
		return super.get();
	}
	
	@Override
	public boolean delete(AdminDTO admin) {
		// TODO Auto-generated method stub
		return super.delete(admin);
	}

	

	@Override
	public void update(AdminDTO t) {
		// TODO Auto-generated method stub
		
	}
	public void updateList(ArrayList<AdminDTO> li)
	{
		
	}
	
	
}
