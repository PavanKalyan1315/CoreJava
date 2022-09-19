package Themes;

import java.util.Scanner;
class  GovtHosptial {
	void specialDoctor1 (String name1,String eyespecialist,String name2,String bones_specialist) {
		System.out.println("doctor name is="+name1+"specialist in ="+eyespecialist);
	
		System.out.println("doctor name is="+name2+"specialist in ="+bones_specialist);
	
	}
	
	void available (int dates) {
		System.out.println("available in1 week="+dates);
		
	}
	void place(String address,int ph_number ) {
		System.out.println("hosptial address is ="+address);
		System.out.println("hosptial ph number is ="+ph_number);
	}
}
public class methodoverloading_hosptial {
	   public static void main(String args []) {
		   Scanner dr= new Scanner(System.in);
		   GovtHosptial obj =new  GovtHosptial();
		  obj.specialDoctor1("rajesh....","eyespecialist","vijay....","bones_specialist");
		   
		   obj.available(9);
		   obj.place("bhadrachalam",78467934);
	   }
	}

	


