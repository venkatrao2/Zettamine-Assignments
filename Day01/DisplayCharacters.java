package Day01;

import java.util.Scanner;

public class DisplayCharacters {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your 4 Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		char e=(char)a;
		char f=(char)b;
		char g=(char)c;
		char h=(char)d;
		
		System.out.println(""+a+"-"+e);
		System.out.println(""+b+"-" +f);
		System.out.println(""+c +"-"+g);
		System.out.println(""+d +"-"+h);
		
		
		
	
	}

}
