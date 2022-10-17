package Assignment;




	abstract class Animal {
		abstract void lifespan();
		abstract void gives();
		void breath() {
			System.out.println("taking oxygen for living");
		}
		}

		 class cow extends Animal {
		    	 
			void lifespan() {
			System.out.println("its lifespan is 20 years");	
			}
			void gives() {
				System.out.println("its  give milks every day");
				
			}

		}
		 class goat extends cow{
			 void lifespan() {
				 System.out.println("its lifespan is 8 year ");
			 }
			 void gives () {
				 System.out.println("its gives meat ");
			 }
		 }


		 public class abstarct_assignment {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		     Animal A;
		     A=new cow();
		     System.out.println(" .... cow.....");
		     A.lifespan();
		     A.gives();
		     System.out.println(" .... Goat.....");
		     A= new goat();
		     A.lifespan();
		     A.gives();
		     
			}


}
