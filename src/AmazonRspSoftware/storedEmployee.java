package AmazonRspSoftware;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class storedEmployee extends IcqaOperation{
	
	
	public String Employeelogin;
	ArrayList<String> loginlist;
	public String EmployeeID;
	public String EmployeeName;
	public String shelfCode;
	public String binCode;
	Map<String, String> Inventory;
	Map<String, String> registration;
	
	public storedEmployee() {
		
	}
	
	
	public void Person() {
		
        Scanner scanner= new Scanner(System.in);
		
		Map<String, String> registration = new HashMap<String, String>();
		
		this.registration= registration;
		
		registration.put("Yunus Kazan", "YK12345");
		registration.put("ASO", "AS12345");
		registration.put("Ukbe Dolmaci", "UD12345");
		registration.put("Mustafa Dolmaci", "MD12345");
		registration.put("Ziya Akyurek", "ZA12345");
		registration.put("Burhan Ekinci", "BE12345");
		registration.put("Mike McKeinzie", "MM12345");
		registration.put("John Bolton", "JB12345");
				
		
		
			// to store Employee Login Credentials ----->  EmployeeID and EmployeeName;
		do {
		
		System.out.println("Please enter employee Name");
		
		String EmployeeName= scanner.nextLine();
		this.EmployeeName= EmployeeName;
		
		
		System.out.println("Please enter employee ID");
		
		 String EmployeeID= scanner.nextLine();
		 this.EmployeeID=EmployeeID;
		 
		
		registration.put(EmployeeID,EmployeeName);
		
		
		System.out.println("if you complete Registration please press 'q' to continue press 'c' ");
		
		String quit= scanner.nextLine();
		
		if(quit.contains("q")|| quit.contains("Q")) { 
			
			break;
		}

		} while (true);
		
		
		
		ArrayList<String> loginlist= new ArrayList<>();
		
		this.loginlist=loginlist;
		
		for(Map.Entry<String, String> entry:registration.entrySet()) {
			
			String EmployeeID=entry.getKey();
			String EmployeeName=entry.getValue();

			loginlist.add(EmployeeID+": "+EmployeeName);

		}
		
		//System.out.println(loginlist);
		
	}
	

	
}
