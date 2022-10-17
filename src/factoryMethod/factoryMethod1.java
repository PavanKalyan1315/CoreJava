package factoryMethod;

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
			System.out.println("benz cost is 1.5 cro");
		}
		void milage() {
			System.out.println("benzs milage is 6 km/l");
		
	}
	}
	public class factoryMethod1 {
		 car getcar(String carName) {
			if(carName.equals("audii"))
				return new audii();
			else if (carName.equals("benz"))
				return new benz();
			else
			return null;
		
		}
	
		public static void main(String[] args) {
			factoryMethod1 m = new factoryMethod1();
			car x =m.getcar("benz");
			x.cost();
			x.milage();
		}
	}
		



