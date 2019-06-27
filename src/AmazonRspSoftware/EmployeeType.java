package AmazonRspSoftware;

import java.util.*;
import java.util.Map.Entry;

public class EmployeeType extends InventoryStorage {
	
	
	private int employeeID;
	private String employeName;
	//private String employeeLevel;
	private boolean stower;
	private boolean picker;
	private boolean counter;
	private boolean InventoryMaker;
	Map<String, String> Inventory;
	Map<String, String> Inventory1;
	
public int Inventory() {
		
		
		Map<String, String> Inventory1= new HashMap<String, String>();
		
		this.Inventory1= Inventory1;
		
		Inventory1.put("B0000YTD45", "Iphone X max RED");
		Inventory1.put("B000KPY769", "Iphone X max BLUE");
		Inventory1.put("X0000YTD95", "Iphone X max YELLOW");
		Inventory1.put("XB00DYNRLK", "Iphone X max GRAY");
		Inventory1.put("B0KDSV9443", "Iphone X max BLACK");
		Inventory1.put("X123BCJD04", "Iphone X max PINK");
		Inventory1.put("2323433743", "Iphone X max ORANGE");
		Inventory1.put("LN023033KF", "Iphone X max SKYBLUE");
		Inventory1.put("B0XMSA9339", "Iphone X max GREEN");
		Inventory1.put("X000JDJDU6", "Iphone X max PURPLE");
		Inventory1.put("BCMSDSJF93", "Iphone X max HOT PINK");
		Inventory1.put("B0000YTD32", "Iphone X max WHITE");
		Inventory1.put("B0SDJFTD45", "Iphone X max SPACE");
		Inventory1.put("X00SKDSV89", "Iphone X max GOLD");
		Inventory1.put("X0000YTD45", "Iphone X max SILVER");
		Inventory1.put("B0SJJSFWEI", "Iphone X max DARK BLUE");
		
		return Inventory1.size();
		
}
		
public void InventoryMaker(boolean InventoryMaker) {
		
		this.InventoryMaker= InventoryMaker;
		
		if(InventoryMaker) {
			
			Map<String, String> Inventory= new HashMap<String, String>();
			
			this.Inventory= Inventory;
			
			Inventory.put("B0000YTD45", "Iphone X max RED");
			Inventory.put("B000KPY769", "Iphone X max BLUE");
			Inventory.put("X0000YTD95", "Iphone X max YELLOW");
			Inventory.put("XB00DYNRLK", "Iphone X max GRAY");
			Inventory.put("B0KDSV9443", "Iphone X max BLACK");
			Inventory.put("X123BCJD04", "Iphone X max PINK");
			Inventory.put("2323433743", "Iphone X max ORANGE");
			Inventory.put("LN023033KF", "Iphone X max SKYBLUE");
			Inventory.put("B0XMSA9339", "Iphone X max GREEN");
			Inventory.put("X000JDJDU6", "Iphone X max PURPLE");
			Inventory.put("BCMSDSJF93", "Iphone X max HOT PINK"); 
			Inventory.put("B0000YTD32", "Iphone X max WHITE");
			Inventory.put("B0SDJFTD45", "Iphone X max SPACE");
			Inventory.put("X00SKDSV89", "Iphone X max GOLD");
			Inventory.put("X0000YTD45", "Iphone X max SILVER");
			Inventory.put("B0SJJSFWEI", "Iphone X max DARK BLUE");
			
			//Map<String, String> Inventory= new HashMap<String, String>();
			
			//this.Inventory1= Inventory2;
			
			Scanner scanner= new Scanner(System.in);
			
			do {
				
				System.out.println("Please Scan the item ");
				String barcode= scanner.nextLine();
				
				System.out.println("Item Name");
				String ItemName= scanner.nextLine();
				
				Inventory.put(barcode, ItemName);
				
				System.out.println("Please press 'q' to sign out or press 'c' to continue working ");
				
				String quit= scanner.nextLine();
				
				if(quit.contains("q")|| quit.contains("Q")) { 
					
					break;
				}
				
				
			}while(true);
			
			ArrayList<String> Inventorylist= new ArrayList<String>();
			
			
			for(Map.Entry<String, String> inventory: Inventory.entrySet()) {
				
				String list= inventory.getKey()+"= "+inventory.getValue();
				
				Inventorylist.add(list);
				
				System.out.println(list);
			}
			
			EmployeeType obj= new EmployeeType();
			
			System.out.println(Inventorylist.size());
			
			
			;
			
			System.out.println("you stored "+(Inventorylist.size()-obj.Inventory())+" items.");
		}
		
		
	}

public void Stower(boolean stower) {
		
		this.stower= stower;
		
		
		
	}


public void Picker(boolean picker) {
	
	this.picker= picker;
	
	
	
}


public void Counter(boolean counter) {
	
	this.counter= counter;
	
	
}

}
