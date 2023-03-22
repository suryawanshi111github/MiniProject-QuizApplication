package com.useroperation;

import java.util.Scanner;

public class TestMain {
	
	public static void doRegistration() {
		Scanner scanner = new Scanner(System.in);
		
     	System.out.println("Please Enter Your Firstname");
     	String firstname=scanner.next();
     	
     	System.out.println("Please Enter Your Lastname");
     	String lastname=scanner.next();
     	
     	System.out.println("Please Enter Your Username");
     	String username=scanner.next();
     	
     	System.out.println("Please Enter Your Password");
     	String password=scanner.next();
     	
     	System.out.println("Please Enter Your City");
     	String city=scanner.next();
     	
     	System.out.println("Please Enter Your E-Mailid");
     	String emailid=scanner.next();
     	
     	System.out.println("Please Enter Your Mobilenumber");
     	long mobilenumber =scanner.nextLong();
     	
     	StudentRegistration.insertStudentRecord(firstname,lastname,username,password,city,emailid,mobilenumber);
	}
     	
     	public static void doLogin(){
     		Scanner scanner = new Scanner(System.in);
     		
     		System.out.println("please login here");
     		
 			System.out.println("please enter username");
 			String username = scanner.next();

 			System.out.println("please enter password");
 			String password = scanner.next();

 			StudentLogin.studentLogin(username, password);
 			
 	
     	}
}
     	 
     	
	
      
 		
   


