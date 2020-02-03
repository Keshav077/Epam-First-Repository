package com.supermarket;

public class Items implements Supermarket {
	String Name,id;
	double price;
	
	public Items(String name, String id, double price) {
		this.Name = name;
		this.id = id;
		this.price = price;
		
	}
	public String getName() {
		return Name;
	}
	public String getId() {
		return id;
	}
	public double getPrice() {
		return price;
	}
	
}
