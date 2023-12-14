package Day01;

import java.util.Scanner;

public class StringConcatnation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("inmate's firstname");
		String name=sc.nextLine();
		System.out.println("inmate's fathername");
		String lname=sc.nextLine();
		if(name.matches("^[A-Za-z)+$")& lname.matches("^[A-ZA-Z]$")){
			System.out.println(name+""+lname);
		}else {
			System.out.println("invalid name");
		}
		sc.close();
				
	}

}
