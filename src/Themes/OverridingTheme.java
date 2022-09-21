package Themes;

class Hosptial{


	void details() {
	
		System.out.println("hosptial name is= mohanrao hosptial");
		System.out.println("special doctor are = Dr. jansi ,Dr.madhu");
		System.out.println("hosptial staff=28");
	
	}
}
class kims extends Hosptial{
	void details() {
		System.out.println("hosptial name is= global hosptial");
		System.out.println("special doctor are = Dr.shekar ,Dr.ramu");
		System.out.println("hosptial staff=50");
	}
	
}
class govt extends Hosptial{
	void details() {
	System.out.println("hosptial name is= global hosptial");
	System.out.println("special doctors are = Dr.shekar ,Dr.ramu");
	System.out.println("hosptial staff=50");
	}
}

public class OverridingTheme {
	
	
	
	public static void main (String args []) {
		Hosptial pk = new Hosptial();
		pk.details();
		pk= new kims();
		pk.details();
		pk= new govt();
		pk.details();
		
		
	}

}


