package Day01;

import java.util.Arrays;
import java.util.Scanner;

public class LeastOffer {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("enter the number of items:");
		int NoOfItems=sc.nextInt();
		sc.nextLine();
		String [] items=new String[NoOfItems];
		String item="";
		float[] disarray=new float[NoOfItems];
		String[] itemname=new String [NoOfItems];
		for(int i=0;i<NoOfItems;i++) {
			item=sc.nextLine();
			items[i]=item;
		}
		for(int j=0;j<items.length;j++) {
			String[] item1=items[j].split(",");
			itemname[j]=item1[0];
			int price =Integer.parseInt(item1[1]);
			int discount =Integer.parseInt(item1[2]);
			disarray[j]=(float)(price*discount)/100;
		}
		System.out.println(Arrays.toString(itemname));
		System.out.println(Arrays.toString(disarray));
		float min=disarray[0];
		int index=0;
		for(int m=0;m<disarray.length;m++) {
			if(disarray[m]<min) {
				min=disarray[m];
				index=m;
			}
			
		}
		System.out.println("items with minimum Discount:"+itemname[index]);
	}

}
