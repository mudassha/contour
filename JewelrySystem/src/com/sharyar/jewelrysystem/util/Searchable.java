package com.sharyar.jewelrysystem.util;
import java.util.*;

import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
public interface Searchable<T> {
	public List<T> search(T t); //return list<T>, name change 
	
	public List<T> findByCriteria(T t);
	//findByCriteria(T t) do all searching here using conditions 
	 //implement in dao
}
