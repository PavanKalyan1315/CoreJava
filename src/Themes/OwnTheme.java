package Themes;
class TataComapany{
	void differentTypes() {
		System.out.println("TATA COMPANY ");
		System.out.println("tata tipperlorry,loadcarriers");
		System.out.println("tata busses ,schools vans");
		System.out.println("tata magic auto,trallies");
		System.out.println("tata cars ");
		System.out.println(".................");

	}
	void ashockleyland() {
		System.out.println("ashockleyland");
		System.out.println("ashockleyland tipperlorry,loadcarriers");
		System.out.println("ashockleyland buses ,schools vans");
		System.out.println("tata travveys autos");
		System.out.println(".................");

	}
}

	    class Bharathbenzz extends TataComapany{
	    	void  details() {
	    		System.out.println("Bharathbenzz ");
	    		System.out.println("bharth benzz tipperlorry,loadcarriers");
	    		System.out.println(" bharth benzz buses ,schools vans");
	    	
	    	}
	    	
	    }

public class OwnTheme {

	public static void main(String[] args) {
		Bharathbenzz bn = new Bharathbenzz ();
         bn.differentTypes();
         bn.ashockleyland ();
         bn.details();
	}

}
