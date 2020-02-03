package com.supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ch;
		while(true) {
		try  {
			Inventory inv = new Inventory();
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("SUPER MARKET\n1. List Items\n2. Add List Of Items\n3. Add Item\n4. Remove Item\n5. Exit\n");
			System.out.print("Choose--> ");
			ch = scan.nextInt();
			switch(ch) {
			case 1:{
				inv.getItems();
				break;
			}
			case 2:{
				ArrayList<Items> List = new ArrayList<Items>();
				System.out.println("How many Items do you want to create?: ");
				int noOfItems = scan.nextInt();
				for(int i = 0 ; i < noOfItems ; i++) {
					System.out.println("Enter Item Name , id , price\n");
					scan.nextLine();
					String name = scan.nextLine();
					String id = scan.nextLine();
					double price = scan.nextDouble();
					Items item = new Items(name,id,price);
					List.add(item);
				}
				inv.addItem(List);
				break;
			}
			case 3:{
				System.out.println("Enter Item Name , id , price\n");
				scan.nextLine();
				String name = scan.nextLine();
				String id = scan.nextLine();
				double price = scan.nextDouble();
				Items item = new Items(name,id,price);
				inv.addItem(item);
				break;
			}	
			case 4:{
				System.out.println("Enter Item Name to Remove: ");
				scan.nextLine();
				String Name = scan.nextLine();
				inv.removeItem(Name);
				break;
			}
			case 5:{
				System.exit(0);
			}	
			default:
				System.out.println("Invalid Input");

			}
		}
		catch(Exception e) {
		}
		}

	}
}