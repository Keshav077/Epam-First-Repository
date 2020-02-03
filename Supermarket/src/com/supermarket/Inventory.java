package com.supermarket;

import java.util.ArrayList;

public class Inventory implements Supermarket{
	public void addItem(Items item) {
		ItemsInSM.add(item);
		System.out.println("Item "+item.Name+" has been successfully added to the inventory.");
	}
	public void addItem(ArrayList<Items> ItemsList) {
		ItemsInSM.addAll(ItemsList);
		System.out.println("Item's have been successfully added to the inventory.");
	}
	public void removeItem(String Name) {
		for( Items item : ItemsInSM) {
			if (item.Name.equals(Name)) {
				ItemsInSM.remove(item);
				break;
			}
		}
	}
	public void getItems() {
		if( ItemsInSM.size() != 0 ) {
			for( Items item : ItemsInSM) {
				System.out.println("Item id: "+item.getId());
				System.out.println("Item Name: "+item.getName());
				System.out.println("Item Price: "+item.getPrice());
				System.out.println("-------------");
			}
		}
		else {
			System.out.println("Supermarket is Empty..");
		}
	}
}
