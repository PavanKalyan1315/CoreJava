package Themes;

import java.util.Scanner;

class sub{
	int e;
	int b;
	Scanner sc=  new  Scanner (System.in);
	void input() {
		System.out.println("enter e & b valu");
		
		e=sc.nextInt();
		b=sc.nextInt();
	}
	void add() {
		System.out.println("add="+(e-b));
	}
}
class Super extends sub{
	int a ;
	void sum (){
		System.out.println(" enter a value");
		a=sc.nextInt();
		
		
	}
	void addition() {
		System.out.println("add"+(e+b+a));
	}
}
public class Sampleinheritance {

	public static void main(String[] args) {
		Super obj = new Super();
		obj.input();
		obj.add();
		obj.sum ();
		obj.addition();
		// TODO Auto-generated method stub

	}


}