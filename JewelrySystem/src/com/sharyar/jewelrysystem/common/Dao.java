package com.sharyar.jewelrysystem.common;

public interface Dao<T> {
	
	void add(T t);
	
	boolean delete(T t);
	
	void update(T t);
	
	T get(T t);
	
}
