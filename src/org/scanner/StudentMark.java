package org.scanner;
import java.util.Scanner;
public class StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the student id:");
		int id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Student Name:");
		String name=s.nextLine();
		System.out.println("Mark1:");
		int mark1=s.nextInt();
		System.out.println("Mark2:");
		int mark2=s.nextInt();
		System.out.println("Mark3:");
		int mark3=s.nextInt();
		System.out.println("Mark4:");
		int mark4=s.nextInt();
		System.out.println("Mark5:");
		int mark5=s.nextInt();
	    
		int Total=mark1+mark2+mark3+mark4+mark5;
		float average= Total/5;	
		System.out.println("Total mark:"+Total);
		System.out.println("Average:"+average);

	}

}
