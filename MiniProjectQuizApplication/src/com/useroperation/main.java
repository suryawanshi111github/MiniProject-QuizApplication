package com.useroperation;

import java.util.Scanner;

import com.adminoperation.AddQuestions;

public class main {
	public static void main(String[] args) {
		
		System.out.println("....Welcome....");
 	Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your choices..");
		System.out.println("Enter 1 for Registration");
		System.out.println("Enter 2 for Login");
		System.out.println("Enter 3 for Admin");
		
		int choice = scanner.nextInt();

		switch (choice) {

		case 1: 
			TestMain.doRegistration();
			break;
		case 2:
			TestMain.doLogin();
			break;
		case 3:
			AddQuestions.adminInput();
			break;
		}
		
		}
	}

