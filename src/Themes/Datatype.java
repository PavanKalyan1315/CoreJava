package Themes;

import java.util.Scanner;

public class Datatype {
	void add( int x,int y) {
		System.out.println(" integers sum="+ (x+y));
	}
	void add( float x, float y) {
		System.out.println(" decimals sum="+ (x+y));
	}
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		Datatype obj =new Datatype();
		System.out.println("enter any two valves");
	
		obj.add(ab.nextInt(), ab.nextInt());
		
		obj.add(ab.nextFloat(), ab.nextFloat());
		// TODO Auto-generated method stub

	}

}