import java.util.*;
public class Main{
public static void main(String args[]){
System.out.println("Hello");
Scanner sc = new Scanner(System.in);
		System.out.println("1. Register");
		System.out.println("2. Login");
		String name, pwd =null;
		System.out.println("Enter Your choice: ");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("New User Registeration");
			System.out.println();
			System.out.println("Enter Your UserName : ");
		    name = sc.nextLine();
		    sc.next();
		    //System.out.println();
		    System.out.println("Enter Your Passwrod :");
		    pwd = sc.nextLine();
		    sc.next();
		    System.out.println("Thanks for registering.");
		}
		else if(choice == 2) {
			System.out.println("Enter Your UserName : ");
		    name = sc.nextLine();
		    sc.next();
		    System.out.println();
		    System.out.println("Enter Your Passwrod :");
		    pwd = sc.next();
		    sc.next();
		    if((name.equalsIgnoreCase("Admin")) && (pwd.equals("Admin"))) {
		    	System.out.println("Login Success!!");
		    	
		    }
		    
		}
		else {
			System.out.println("Invalid Choice");
		}
		sc.close();
	}


}
