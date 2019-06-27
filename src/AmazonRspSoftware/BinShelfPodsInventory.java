package AmazonRspSoftware;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BinShelfPodsInventory {
	
	public String Employeelogin;
	ArrayList<String> loginList;
	public String EmployeeID;
	public String EmployeeName;
	public String shelfCode;
	public String binCode;
	Map<String, String> Inventory;
	
	
public void Shelf() {
		
		Set<String> shelf = new HashSet<String>();
		
		do {
					
					Scanner scanner= new Scanner(System.in);
					
					System.out.println("Please Scan shelf ");
					String shelfCode= scanner.nextLine();
					this.shelfCode=shelfCode;
					
					shelf.add(shelfCode);
					
					System.out.println("Please press 'q' to sign out or press 'c' to continue working ");
					
					String quit= scanner.nextLine();
					
					if(quit.contains("q")|| quit.contains("Q")) { 
						
						break;
					}

					
		} while(true);
				
		
		Iterator<String> it= shelf.iterator();
		
		while(it.hasNext()) {
			
		String shelfCode= it.next();	
			
		this.shelfCode= shelfCode;
		
		}
		
				System.out.println(shelf); 
		
		
	}
	
public void Bin() {
		
		Set<String> bin = new HashSet<String>();
		
		do {
					
					Scanner scanner= new Scanner(System.in);
					
					System.out.println("Please Scan bin ");
					String binCode= scanner.nextLine();
					this.binCode=binCode;
					
					bin.add(binCode);
					
					System.out.println("Please press 'q' to sign out or press 'c' to continue working ");
					
					String quit= scanner.nextLine();
					
					if(quit.contains("q")|| quit.contains("Q")) { 
						
						break;
					}

					
		} while(true);
				
Iterator<String> it= bin.iterator();
		
		while(it.hasNext()) {
			
		String binCode= it.next();	
			
		this.binCode= binCode;

				System.out.println(bin); 
		
		}
	}
	
	
	public void Pod () {
		
		
		
Map<String, String> pod= new HashMap<String, String>();
		
		do {
			
			this.Shelf();
			this.Bin();
			
			pod.put(shelfCode, binCode);
			
			System.out.println("A bin with binCode that "+binCode+" Inside of the Shelf with shelfcode that "+shelfCode);
			
			Scanner scanner= new Scanner(System.in);
			
			System.out.println("Please press 'q' to sign out or press 'c' to continue working ");
			
			String quit= scanner.nextLine();
			
			if(quit.contains("q")|| quit.contains("Q")) { 
				
				break;
			}

			
} while(true);
		
		System.out.println(pod);
		
	}

}
