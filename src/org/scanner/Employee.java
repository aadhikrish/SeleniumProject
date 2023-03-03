package org.scanner;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		int empid=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Employee name:");
		String empname=s.nextLine();
		System.out.println("Enter the Employee EmailId:");
		String empemail=s.nextLine();
		System.out.println("Enter the Employee phoneno:");
		long empphone=s.nextLong();
		System.out.println("Enter the Employee salary:");
		long empsalary=s.nextLong();
		System.out.println("Enter the Employee Gender:");
		String empgender=s.next();
		s.nextLine();
		System.out.println("Enter the Employee city:");
		String empcity=s.nextLine();
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empemail);
		System.out.println(empphone);
		System.out.println(empsalary);
		System.out.println(empgender);
		System.out.println(empcity);
		
	}

}
