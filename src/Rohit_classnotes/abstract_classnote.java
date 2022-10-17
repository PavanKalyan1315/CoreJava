package Rohit_classnotes;

abstract class vehicle{
		 abstract void cost();
		 abstract void milage();
		 void start() {
			 System.out.println("start the car");
		 }
		 
	}
	class Audi extends vehicle {
		
		void cost() {
			System.out.println("audi cost is 60 lacks");
		}
		void milage() {
			System.out.println("audi milage is 10 km/l");
		}
	}
	class bmw extends  Audi {
		void cost () {
			System.out.println("audi cost is 70 lacks");
		}
		void milage() {
			System.out.println("audi milage is 8 km/l");
		
	}
	}
		public class abstract_classnote {
	


		public static void main(String[] args) {
		
	vehicle x;
	x=new Audi ();
	x.start();
	x.cost();
	x.milage();
	x=new bmw ();
	x.start();
	x.cost();
	x.milage();

		}


}
