package Day01;

import java.util.Scanner;
public class BillGeneration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of pizzas bought:");
		int n=sc.nextInt();
		System.out.print("Enter the no of puffs bought :");
		int n1=sc.nextInt();
		System.out.print("Enter the no of cool drinks bought :");
		int n2=sc.nextInt();
		System.out.println();
		
		System.out.println("Bill Details");
		
		System.out.println("No of pizzas:"       +""+     n     +        "Cost  :" + n*100);
		System.out.println("No of Puffs:"        +""+     n1    +        "Cost  :" + n1*20);
		System.out.println("No of CoolDrinks:"   +""+     n2    +        "cost :" + n2*10);
		int n3 = n*100+n1*20+n2*10;
		System.out.println("Total Price:" +n3);
		System.out.println("Enjoy the show!!!!");
	}
}
