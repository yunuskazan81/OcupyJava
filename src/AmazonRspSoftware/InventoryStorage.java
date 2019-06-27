package AmazonRspSoftware;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryStorage {
	
	Map<String, String> Inventory;
	
public int Inventory () {
		
		
		Map<String, String> Inventory= new HashMap<String, String>();
		
		this.Inventory= Inventory;
		
		Inventory.put("B0000YTD45", "Iphone X max RED");
		Inventory.put("B000KPY769", "Iphone X max BLUE");
		Inventory.put("X0000YTD95", "Iphone X max YELLOW");
		Inventory.put("XB00DYNRLK", "Iphone X max GRAY");
		Inventory.put("B0KDSV9443", "Iphone X max BLACK");
		Inventory.put("X123BCJD04", "Iphone X max PINK");
		Inventory.put("2323433743", "Iphone X max ORANGE");
		Inventory.put("LN023033KF", "Iphone X max SKY BLUE");
		Inventory.put("B0XMSA9339", "Iphone X max GREEN");
		Inventory.put("X000JDJDU6", "Iphone X max PURPLE");
		Inventory.put("BCMSDSJF93", "Iphone X max HOT PINK");
		Inventory.put("B0000YTD32", "Iphone X max WHITE");
		Inventory.put("B0SDJFTD45", "Iphone X max SPACE");
		Inventory.put("X00SKDSV89", "Iphone X max GOLD");
		Inventory.put("X0000YTD45", "Iphone X max SILVER");
		Inventory.put("B0SJJSFWEI", "Iphone X max DARK BLUE");
		
		
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
		
		//System.out.println(Inventory); 
		
		

		
		for(Map.Entry<String, String> item: Inventory.entrySet()) {
			
			String itemBarcode= item.getKey();
			String itemName= item.getValue();
			String newItem= item.getKey()+": "+item.getValue();
			
			System.out.println(newItem);
			
		}
		
		return Inventory.size();
	}

}
