package Themes;
class Electronics{
	void differntElectronics() {
		System.out.println("different fans = cooler and siling fans");
		System.out.println("fridge types = double door and single door fridge");
		System.out.println("different = led tv's");
		System.out.println(".......................");
	}
}
 class Mobile extends Electronics {
	 void differentModels (){
		System.out.println("opp A52 mobile");
		System.out.println("sumsung mobile");
		System.out.println("mi mobile");
		System.out.println("vivomobile");
		System.out.println("one pluss");
	 }
 }
 
 class onepluss extends Mobile {
	 void features() {
		System.out.println("i like one pluss mobile verymuch"); 
		System.out.println("it is very light weight "); 
		System.out.println("black color ph is look osam ");
	 }
	 
 }
public class Multilevel_inheritance {
	

	public static void main(String[] args) {

 
		onepluss e = new onepluss ();
         e.differntElectronics();
         e.differentModels();
         e.features();
	}

}
