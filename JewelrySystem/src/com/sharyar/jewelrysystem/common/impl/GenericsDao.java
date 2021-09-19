package com.sharyar.jewelrysystem.common.impl;

import java.util.ArrayList;

import com.sharyar.jewelrysystem.common.Dao;
import com.sharyar.jewelrysystem.db.admin.dto.AdminDTO;

public class GenericsDao<T>  implements Dao<T>{
	
	ArrayList<T> a = new ArrayList<T>();
	
	@Override
	public void add(T t) {
		System.out.println("Calling add method of GenericsDao");
		a.add(t);
	}
	
	
	@Override
	public ArrayList<T> get() {
		return a;
	}
	
	@Override
	public boolean delete(T t) {
		// TODO Auto-generated method stub
		return a.remove(t);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		
	}
}
