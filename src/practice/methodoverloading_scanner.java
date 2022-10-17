package practice;

import java.util.Scanner;

class sum{
	void add(int a,float b) {
		System.out.println("add the ="+(a+b));
	}
	void add(float r , int y) {
		System.out.println("multiple the ="+(r*y));
	}
}

public class methodoverloading_scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sum ss = new sum();
		System.out.println("enter any two numbers");
		int a = sc.nextInt();
		float b = sc.nextFloat();
         ss.add(a, b);
         System.out.println("enter any two numbers");
         float r = sc.nextFloat();
 		int y = sc.nextInt();
          ss.add(r, y);
 		
	}

}
