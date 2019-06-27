package AmazonRspSoftware;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Bins {
	 Scanner scan= new Scanner(System.in);
	
    static String name;
	static String itemID;
	static int quantity;
	
	public String getItemName() {
		
		System.out.println("Please enter item name");
	     name=scan.nextLine();
	return name;
	
	} 
	
	public String getitemID() {
		
		System.out.println("Please enter item ID");
	     itemID=scan.nextLine();
	 return itemID;
	}
	
	
	public int getQuantity() {
		System.out.println("Please enter item quantity");
	     quantity=scan.nextInt();
	return quantity;
	}
	
	public String setItemName(String name) {
		this.name=name;
		return name;
		
	}
	
	
	public String setItemID(String itemID) {
		this.itemID=itemID;
		return itemID;
	}
	
	public int setQuantity(int quantity) {
		this.quantity=quantity;
		return quantity;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
	while(true) {
	Bins obj=new Bins();
	obj.getitemID();
	obj.getItemName();
	obj.getQuantity();
	
	obj.setItemID(itemID);
	obj.setItemName(name);
	obj.setQuantity(quantity);
	
	
	
	Vector vec=new Vector(1,3);
	
	
	vec.addElement(itemID);
	vec.addElement(name);
	vec.addElement(quantity);
	
	Enumeration en=vec.elements();
	System.out.println("Element are");
	while(en.hasMoreElements()) {
		System.out.print(en.nextElement()+ " ");
		System.out.println();
		
		
	}
	
	
	System.out.println("You have "+ vec.size()+" elements in total");
	

	
	}            
	              
	}

}
