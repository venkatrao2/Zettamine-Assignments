package Day01;

import java.util.Scanner;

public class AverageAge {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter the total no of Employee");
		int NoofEmps=sc.nextInt();
		int[] empages=new int[NoofEmps];
		if(NoofEmps>2) {
			System.out.println("Enter the ages"+NoofEmps+"Employees");
			for(int i=0;i<empages.length;i++) {
				int age=sc.nextInt();
				if(age>=28 & age<=40) {
					empages[i]=age;
				}else {
					System.err.println("invalid age Encountered");
					System.exit(0);
				}
			}

		}else {
	System.err.println("please enter a valid employee count");
	System.exit(0);
	
}
	float res=calculateAverage(empages);
	System.out.printf("%.2f",res);
}

	private static float calculateAverage(int[] age) {
		double sum=0;
		for(int i=0;i<age.length;i++) {
			sum=sum+age[i];
		}
	
		return (float)sum/age.length;
	}
}
