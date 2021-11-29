package com.greatlearning.service;



import java.util.Scanner;

import com.greatlearning.model.Employee;


public class Driver {
	
	    private static Scanner input = new Scanner(System.in);
	    private static CredentialService cs = new CredentialService();
	public static void main(String[] args)
	{
		
		String firstName , lastName , department;
        Employee emp;
        System.out.println(" First Name : ");
        firstName = input.next();

        System.out.println(" Last Name : ");
        lastName = input.next();

        department = getDepartment();
        if(department != "") {
            emp = new Employee(firstName, lastName, department);

            String emailAddress = cs.generateEmailAddress(emp);
            String password = cs.generatePassword();
            cs.showCredentials(emp,emailAddress,password);
        }
    }
	 
	

	private static String getDepartment()
	{
		
	System.out.println("Please enter the department as following");
	System.out.println("1.Technical");
	System.out.println("2.Admin");
	System.out.println("3.Human Resourse");
	System.out.println("4.Legal");
    System.out.println("--------------------------------");


	System.out.println(" Enter your choice : ");
	
	int choice;
    String dept="";
    choice = input.nextInt();
	 switch (choice){
     case 1 :
         dept = "tech";
         break;

     case 2 :
         dept = "adm";
         break;

     case 3 :
         dept = "hr";
         break;

     case 4 :
         dept = "legal";
         break;
     default:
         System.out.println("Wrong Choice!!");

	 }
     return dept;
 }
}

