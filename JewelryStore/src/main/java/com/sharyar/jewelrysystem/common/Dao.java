package com.sharyar.jewelrysystem.common;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Dao<T> {
	
	void add(T t) throws SQLException;
	
	boolean delete(T t) throws SQLException;
	
	void update(T t) throws SQLException;
	
	ArrayList<T> get() throws SQLException;
	
}
