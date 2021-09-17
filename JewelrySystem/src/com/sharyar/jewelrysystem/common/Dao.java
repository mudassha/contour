package com.sharyar.jewelrysystem.common;

import java.util.ArrayList;

public interface Dao<T> {
	
	void add(T t);
	
	boolean delete(T t);
	
	void update(T t);
	
	ArrayList<T> get();
	
}
