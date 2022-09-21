package Themes;

import java.util.Scanner;

class Square {
	int a;
	Scanner sc = new Scanner( System.in);
	void input () {
		System.out.println("enter a value");
		a=sc.nextInt();
		}
	void sqr() {
		System.out.println("sqare ="+(a*a));
	}
	}
   class sum extends Square{
	   int b;
	   
	   void accept () {
		   System.out.println("enter b value ");
		   b= sc.nextInt();
		  
	   }
	   void add () {
		   System.out.println("sum ="+(a+b));
	   }
   }
public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   sum   ad = new sum  ();
   ad.input();
   ad.sqr();
   ad.accept();
   ad.add();
	}

}
