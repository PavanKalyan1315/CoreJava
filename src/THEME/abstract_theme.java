package THEME;


	abstract class Hosptial{
		 abstract void children();
		 abstract void  bloodtest();
		 void formfilling() {
			 System.out.println("fill the patient  details ");
		 }
	}
	 class govt extends  Hosptial{
		 void children() {
			 System.out.println("children has saparate doctors");
		 }
		 void bloodtest() {
			 System.out.println("be careful to take blood ");
		 }
	 }
	 class narayana_hspl extends govt{
		 void children() {
			 System.out.println("childrens dont give heavy dose madicine ");
		 }
		 void bloodtest() {
			 System.out.println("test al type of bloodtest");
		 }
	 }


public class abstract_theme {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       Hosptial h;
	       h=new govt();
	       System.out.println(".... govt .....");
	       h.children();
	       h.bloodtest();
	       h.formfilling();
	       h= new narayana_hspl();
	       System.out.println("......narayana_hspl......");
	       h.children();
	       h.bloodtest();
	       h.formfilling();
		}

}
