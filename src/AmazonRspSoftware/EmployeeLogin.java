package AmazonRspSoftware;

import java.util.Scanner;

public class EmployeeLogin {
	
	
//	private int employeeID;
//	private String employeName;
//	//private String employeeLevel;
//	private boolean stower;
//	private boolean picker;
//	private boolean counter;
//	private boolean InventoryMaker;
	
	public void Login() {
		
		Scanner scanner= new Scanner(System.in);
		
		storedEmployee registeredperson= new storedEmployee();
		registeredperson.Person();
		
		do {
			System.out.println("Please enter your EmployeID");
			String EmployeeID= scanner.nextLine();
					//this.EmployeeID=EmployeeID;

			System.out.println("Please enter your EmployeName");
			String EmployeeName= scanner.nextLine();
				//this.EmployeeName= EmployeeName;

			if(registeredperson.loginlist.contains(EmployeeID+": "+EmployeeName)) {
				
				System.out.println("Employee ID: "+EmployeeID+", Employee Name: "+EmployeeName+", signed in <<Safety First>>");
				break;
			}

			else {
				  System.out.println("Invalid EmployeID");
			}

			}while (true);

		
	}
	
	

			

}
