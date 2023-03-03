package org.scanner;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student ID:");
		int sid=s.nextInt();
		s.nextLine();
		System.out.println("Enter the student name:");
		String sname=s.nextLine();
		System.out.println("Enter the student  EmailId:");
		String semail=s.nextLine();
		System.out.println("Enter the student phoneno:");
		long sphone=s.nextLong();
		s.nextLine();
		System.out.println("Enter the student Dept:");
		String sdept=s.nextLine();
		System.out.println("Enter the Student Gender:");
		String sgender=s.next();
		s.nextLine();
		System.out.println("Enter the Student city:");
		String scity=s.nextLine();
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(semail);
		System.out.println(sphone);
		System.out.println(sdept);
		System.out.println(sgender);
		System.out.println(scity);
		

	}

}
