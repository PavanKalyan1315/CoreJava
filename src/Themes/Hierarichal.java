package Themes;

	class aulto{
		void cost() {
			System.out.println( "no cost");
		}
		void company() {
			System.out.println("no company");
		}
	}
	   class Jagvar extends aulto{
		
		void cost1() {
			System.out.println("jagver cost is 1200000");
		}
		void colour() {
			System.out.println( "its colour is black");
		}
		
	}
	class ferrarii extends aulto{
		void cost2 () {
			System.out.println("its cost is 80 lacks");
		}
		void milage() {
			System.out.println("10 km/l");
		}
	}

	public class Hierarichal {

		public static void main(String[] args) {
			
			ferrarii obj = new ferrarii();
			obj.cost2();
			obj.milage();
			 Jagvar j = new  Jagvar ();
			 j.cost1();
			 j.colour();
           aulto a =new aulto ();
			a.cost();
			a.company();
		}
	}	
			
		
			
		

