package Day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CMSApp {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) throws Exception {
		List<StudentC> students = new ArrayList<StudentC>();
		do {
	
		    System.out.println("Enter the Student name and email: ");
		      String name=sc.nextLine();
		     String email=sc.nextLine();
		     
		     
		     StudentC st=new StudentC(name, email);
		     students.add(st);
		      System.out.println("do you want to more Students[y/n]:");
		
		}while(sc.nextLine().equalsIgnoreCase("Y"));
		       System.out.println("=".repeat(75));
		        System.out.println("  STUD_ID   |     STUDENT NAME      |     STUDENT EMAIL       |  COLLEGE NAME" );
		        System.out.println("=".repeat(75));
		        for(StudentC st : students) {
					System.out.println(st);
					System.out.println("-".repeat(75));
		        }
		        System.out.println("=".repeat(75));
	}
}

			
		
		
		


