package com.sharyar.jewelrysystem.db.product.dto;

public class ProductDTO {

	public enum Category{
		Silver,
		Gold,
		Platinum
	}
	
	public enum Status{
		Available,
		Unavailable
	}
	
	
	
	 private int id;
	 private String name;
	 private int price;
	 private Category category;
	 private Status status;
	 private String description;
	 
	 
	 public ProductDTO(String name, int price, Category category, Status status, String description)
	 {
		 this.name = name;
		 this.price = price;
		 this.category = category;
		 this.status = status;
		 this.description = description;
		 
	 }
	 
	 //default constructor
	 public ProductDTO() {
		 
	 }
	 // copy constructor
	 public ProductDTO(ProductDTO p) {
		 this.name = p.getName();
		 this.price = p.getPrice();
		 this.category = p.getCategory();
		 this.status = p.getStatus();
		 this.description = p.getDescription();
	 }
	 
	 //id getter and setter
	 public void setId(int id) {
		 this.id = id;
	 }
	 public int getId() {
		 return id;
	 }
	 
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getName() {
		 return name;
	 }
	 
	 //rice getter and setter
	 public void setPrice(int price) {
		 this.price = price;
	 }
	 public int getPrice() {
		 return price;
	 }
	 
	 //category getter and setter
	 public void setCategory(Category category) {
		 this.category = category;
	 }
	 public Category getCategory() {
		 return category;
	 }
	 
	 //status getter and setter
	 public void setStatus(Status status) {
		 this.status = status;
	 }
	 public Status getStatus() {
		 return status;
	 }
	 
	 //description getter and setter
	 public void setDescription(String description) {
		 this.description = description;
	 }
	 public String getDescription() {
		 return description;
	 }

	
	
}
