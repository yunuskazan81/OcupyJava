	package AmazonRspSoftware;
	
	
		
import java.util.Scanner;
import java.util.Vector; 
		
		class User {
			
		Scanner scan= new Scanner(System.in);
		
		 String userID;
		 String firstName;
		 String lastName;
		 int age;
			
		public String getuserID() //getting the userID variable instance
	    {
			
			System.out.println("please enter userID");
	       
			String userID= scan.nextLine();
		
	        return userID;
	    }
		
	    public String getfirstName() //getting the firstName variable instance
	    {
	    	System.out.println("please enter firstName");
	    	
	    	String firstName = scan.nextLine();
	    	
	        return firstName;
	        
	    }
	    
	    public String getlastName()  //getting the lastName variable instance
	    {
	    	System.out.println("please enter lastName");
	    	
	    	String lastName = scan.nextLine();
	    	
	        return lastName;
	    }
	    
	    public int getage() //getting the age variable instance
	    {
	    	System.out.println("please enter Age");
	    	
	    	int age= scan.nextInt();
	    	
	        return age;
	    }

	    public void setuserID(String userID)  //setting the userID variable value
	    {
	    	
	        this.userID = userID;
	    }
	    public void setfirstName(String firstName)  //setting the firstName variable text
	    {
	        
	        this.firstName = firstName;
	    }
	    public void setlastName(String lastName)  //setting the lastName variable text
	    {
	        
	        this.lastName = lastName;
	    }
	    public void setage(int age)  //setting the age variable value
	    {
	        
	        this.age = age;
	    }
		
		}	
		
		
		public class Pods { 
			
	
		
		
		
		public static Vector<User> a;
		public static User u;

		public static void main(String args[]) { 
			
			
			a = new Vector<User>(); 
			
			u = new User (); 
			
				Pods s=new Pods(); 
				
			for(int i=0;i<5;i++) {				
					s.start("ID"+i); 
					
					s.show(); 
				break;
				}
			
			
		while (true) {	
			int age = 0;
			String userID = "";
			String lastName = "";
			String firstName = "";
			
			User use = new User();
            //Mutator methods to set user objects
			
			
			use.getfirstName();
			use.getlastName();
			use.getuserID();
			use.getage();
			
			
            use.setuserID(userID);
            use.setlastName(lastName);
            use.setfirstName(firstName);               
            use.setage(age);
            
            
		}
		
		
		}		
			
			
		 		
				
		
			public void start(String id) { 
				
				u.setuserID(id); u.setfirstName(""); a.add(u); 
				
			} 
			
			public void show() { 
				
				for(int i=0;i<a.size();i++) 
				
				{ User u=(User)a.get(i); 
				
				System.out.println("ID:"+u.getuserID()+" First Name:"+u.getfirstName()+" Last Name "+u.getlastName()+" User Age "+ u.getage()); }
				
			} 
			
		}
		/* 
		class Person { 
			
			String name; 
			
			String id; 
		
		public String getName() { 
			
			return name; } 
		
		
		public void setName(String name) { 
			
			this.name = name; }
		
		public String getId() { 
			
			return id; } 
		
		public void setId(String id) { 
			
			this.id = id; } 
	
		*/ 
				
	
		
		
