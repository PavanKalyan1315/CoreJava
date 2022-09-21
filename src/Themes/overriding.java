package Themes;
class car{
	void cost() {
		
		System.out.println("no cost");
	}
	void milage() {
		System.out.println("no milage");
	}
}
class audii extends car{
	void cost() {
		System.out.println("audii cost is 70 lACKS");
	}
	void milage() {
		System.out.println("audi milage is 8km/l");
	}
	
}
class benz extends audii{
	void cost() {
		System.out.println("benz cost is 1.5 lacks");
	}
	void milage() {
		System.out.println("benzs milage is 6 km/l");
	
}
}
public class overriding {

	public static void main(String[] args) {
		car  x = new car ();
		x. cost();
		x.milage();
		x=new audii();
		x.cost();
		x.milage();
		x=new benz();
		x. cost ();
		x.milage();
		
		
	}
	

	}

