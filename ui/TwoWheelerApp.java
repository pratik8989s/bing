package com.techm.ui;

import java.util.Scanner;

import com.techm.domain.Customer;
import com.techm.domain.InvalidDataException;
import com.techm.domain.ServiceApp;

public class TwoWheelerApp {

	public static void main(String[] args) throws InvalidDataException {

		Scanner input=new Scanner(System.in);


		//Taking Customer's Value's
		System.out.println("Enter the Customer details");
		System.out.println("Enter Customer's Name");
		String cname=input.next();
		System.out.println("Enter Customer's Address");
		String cadd=input.next();
		System.out.println("Enter Customer's Mobile No.");
		long cmob=input.nextLong();
		System.out.println("Enter Customer's Model Name");
		String modname=input.next();

		Customer cust= new Customer(cname, cadd, cmob);
		System.out.println(cust);




		ServiceApp sa= new ServiceApp();
		int servicetokennumber;


		//Invoking ServiceApp
		servicetokennumber=sa.addCustomer(cname, cmob, modname);

		System.out.println("Two Wheeler is accepted for servicing with token number "+servicetokennumber);






	}

}
