package students_database;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Student {
	private String firstName;
	private String lastName;
	private int ID;
	private int gradeYear;
	private String courses;
	private int tuitionBalance;
	private static int numberofstudents;
	
	public Student()
	{	
		int newGradeYear;
		final JPanel panel = new JPanel();
		
		System.out.println("Enter first name, last name and grade year:");
		Scanner in = new Scanner(System.in);
	
		this.firstName = in.nextLine();
		this.lastName = in.nextLine();
		this.gradeYear = 0;
		
		if (!in.hasNextInt())
			{
			JOptionPane.showMessageDialog(panel,"Grade year is not valid","Error", JOptionPane.ERROR_MESSAGE);
			return;
			//throw new RuntimeException("grade is not valid");			
			}
		
			
		newGradeYear = in.nextInt();
		if (newGradeYear < 0 || newGradeYear > 3)
			JOptionPane.showMessageDialog(panel,"Grade year is not valid","Error", JOptionPane.ERROR_MESSAGE);
			
		
		Student.numberofstudents ++; // should be read from db
		
		setID();
		
		
	}
	
	private void setID()
	{
		this.ID = this.gradeYear * 10000 + Student.numberofstudents; 
	}
	
	public int getID() 
	{
		return this.ID;
	}
}


