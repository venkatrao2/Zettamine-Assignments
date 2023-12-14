package Day03;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfStudents {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)  {
    ArrayList<StudentC> students = new ArrayList<StudentC>();
		
		do {
			System.out.println("enter student name and email: ");
			String name = sc.nextLine();
			
			if(!name.matches("[A-Za-z\\s]+")) {
				System.out.println("Invalid Name Exception");
			} 
			
			String email = sc.nextLine();
			
			if(!email.matches("[A-Za-z0-9.]*@[A-Za-z]+[.][A-Za-z]+")) {
				System.out.println("Invalid Email Exception");
			}  
			
			StudentC st = new StudentC(name, email);
			students.add(st);
			
			System.out.print("do you want to add more students?[Y/N] : ");
		}while(sc.nextLine().equalsIgnoreCase("Y"));
		System.out.println("  STUD_ID   |     STUDENT NAME      |     STUDENT EMAIL       |  COLLEGE NAME" );
		for(StudentC st : students) System.out.println(st);
	 }

}


