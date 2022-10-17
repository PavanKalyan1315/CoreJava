package Rohit_classnotes;
interface vehicles {
	void cost();
	void milage ();
	void speed();
}
 abstract class Car implements vehicles{
	abstract void colour();
	void  start() {
		System.out.println("car starts with key");
		
	}
	void tyres() {
		System.out.println("the car catain 4 tyres");
	}
	 
}
	 
	 class trigo extends Car {

		@Override
		public void cost() {
			// TODO Auto-generated method stub
			System.out.println("trigo car price is 6 lacks ");
		}

		@Override
		public void milage() {
			// TODO Auto-generated method stub
			System.out.println("trigo car milage is 16 to 18 km/l ");
		}

		@Override
		public void speed() {
			// TODO Auto-generated method stub
			System.out.println(" trigo car  speed is ");
		}

		@Override
		void colour() {
			// TODO Auto-generated method stub
			System.out.println(" trigo car  colour is black");
		}
		 
	 }
	 class thar extends Car {

		@Override
		public void cost() {
			// TODO Auto-generated method stub
			System.out.println("thar price is 11 lacks ");
		}

		@Override
		public void milage() {
			// TODO Auto-generated method stub
			System.out.println("thar  milage is 15 to 16 km/l ");
		
		}

		@Override
		public void speed() {
			// TODO Auto-generated method stub
			System.out.println("thar speed is 100/hr");
		}
		

		@Override
		void colour() {
			// TODO Auto-generated method stub
			System.out.println("its colour is ash colour ");
		}
		
		
		 
	 } 
	 abstract class bike  implements vehicles{
		 void start() {
			 System.out.println(" its start with manuval and self ");
		 }
		 void tyres () {
			 System.out.println("it has only two tyres");
		 }
	 }
	 class tvssports extends bike{

		@Override
		public void cost() {
			// TODO Auto-generated method stub
			 System.out.println("tvs price is 67 thousand");
		}

		@Override
		public void milage() {
			// TODO Auto-generated method stub
			 System.out.println("tvs milage is 78 km/l");
		}

		@Override
		public void speed() {
			// TODO Auto-generated method stub
			 System.out.println("tvs speed is 90/hr");
		}
		 
	 }
	 class xl extends bike{

		@Override
		public void cost() {
			// TODO Auto-generated method stub
			 System.out.println("xl cost 52 thousand ");
		}

		@Override
		public void milage() {
			// TODO Auto-generated method stub
			 System.out.println("it milage is 100km/l");
		}

		@Override
		public void speed() {
			// TODO Auto-generated method stub
			 System.out.println("xl speed is 30 km/h");	
		}
		 
	 }
	 
public class interfacenotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Car c;
          c =new trigo();
          c.start();
          c.tyres();
          c.cost();
          c.milage();
          c.speed();
          c.colour();
          System.out.println("..................");
          c=new thar();
          c.start();
          c.tyres();
          c.cost();
          c.milage();
          c.speed();
          c.colour();
          System.out.println("..................");
          
          bike b;
          b= new tvssports();
          b.start();
          b.tyres();
          b.cost();
          b.milage();
          b.speed();
         
          System.out.println("..................");
          b= new xl();
          b.start();
          b.tyres();
          b.cost();
          b.milage();
          b.speed();
          
          
	}

}
	 
