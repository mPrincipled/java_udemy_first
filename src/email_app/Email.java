package email_app;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	int defaultPasswordLength = 10;
	private String department;
	int mailboxCapacity;
	private String alternateEmail;
	private String companySuffix = "compsuffix.com";
	
	// constructor to receive first name and last name	
	public Email(String newFirstName, String newLastName)	
	{
		this.firstName = newFirstName;
		this.lastName = newLastName;
		System.out.println("email created: " + this.firstName + " " + this.lastName);

		//call a method asking for the department - return the department
		
		this.department = setDepartment();
		System.out.println("department: " + this.department);
		
		// call a method that returns random password
		
		this.password = setRandomPassword(this.defaultPasswordLength);
		System.out.println("random password: " + this.password);
		
		// combine elements to generate email
		
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + department + "."+ this.companySuffix; 
		System.out.println("Your email is:" + this.email);		
				
					
	}
	
	// ask for department
	
	private String setDepartment()
	{
		int chosenDepartment;
		
		System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none.\n Enter the code:");
		Scanner in = new Scanner(System.in);
		if(in.hasNextInt())
		{
			chosenDepartment = in.nextInt();
			in.close();
		}
		else
		{
			in.close();			
			return "";
		}
			
		switch(chosenDepartment)
		{
		case 1:
			return "sales";							
		case 2:
			return "accounting";			
		case 3:
			return "development";			
		default:
			return "";
		}	
				
	}
	
	// generate a random password, change password
	
	private String setRandomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char[] genPassword = new char[length];
		for (int i = 0; i < length; i++)
		{
			int rand = (int)(Math.random() * passwordSet.length());
			genPassword[i] = passwordSet.charAt(rand);
		}
		return new String(genPassword);		
	}
	// set mailbox capacity
}
