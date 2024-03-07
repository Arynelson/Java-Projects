package emailApp;

import java.util.Scanner;

public class Email { 
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String AlternateEmail;
	private Scanner in;
	private int depChoice;
	
	// Constructor to receive the first name and last name
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: "+ this.firstName+ " "+ this.lastName);
		
		// call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("\nDepartment: "+ this.department);
	}
	
	// Ask for the department 
	private String setDepartment() {
		System.out.print("\nDepartment Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for other\n\nEnter department code:");
		in = new Scanner(System.in);
	
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "Development";}
		else if (depChoice == 3) {return "Accounting";}
		else {return "other" ;}
		
		
	}
	
	
	// generate random password
	
	//Set the mailbox Capacity
	
	
	// set the alternate email 
	
	
	// changes the password

}
