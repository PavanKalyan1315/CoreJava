package Rohit_classnotes;

import java.util.Scanner;

public class Arrays_notes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] a;
     a=new int[6];
 
     Scanner sc =new Scanner (System.in);
     for (int i= 1; i<=5;i++) {
    	 System.out.println("enter the element");
    	 a[i]=sc.nextInt();
     }
     System.out.println("out put is...");
     for (int i= 1; i<=5;i++) {
    	 System.out.println(a[i]);
    	 
}
	
	}
}
