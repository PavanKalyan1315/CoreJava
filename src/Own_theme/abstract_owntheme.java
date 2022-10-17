package Own_theme;



	abstract class college{
		 abstract void studentname ();
		 abstract void partispatedgame();
		 void age() {
			 System.out.println(" age is 22");
		 }
	 }
	 class mechanicalbranch extends college{
		 void studentname() {
			 System.out.println("lokesh");
		 }
		 void  partispatedgame() {
			 System.out.println("cricket");
		 }
	 }
	 class civilbranch extends mechanicalbranch {
		 void studentname() {
			 System.out.println("anilkumar");
		 }
		 void  partispatedgame() {
			 System.out.println("valleyball");
		 }
	 }
	 
	 public class abstract_owntheme {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     college n;
	     System.out.println("...............");
	     n = new mechanicalbranch ();
	     n.studentname();
	     n.partispatedgame();
	    
	     n=new civilbranch ();
	     System.out.println("..........");
	     n.studentname();
	     n.partispatedgame();
		}

}
