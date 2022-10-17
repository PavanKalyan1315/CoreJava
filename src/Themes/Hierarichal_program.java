package Themes;

class akhil{
	void shekar() {
		System.out.println("shekar is uncle to akhil ");
	
	}
}
class Gowthami extends akhil{
	void rajeswaari() {
		System.out.println(" rajeswaari is aunt to gowtami");
		System.out.println("................. ");
	}
}
class akshita extends akhil  {
	void gowtami() {
		System.out.println("gowtami is sisterilla to akshita");
		System.out.println("...................... ");
	}
}

public class Hierarichal_program {

	public static void main(String[] args) {
		 akshita ak = new  akshita();
		 ak. gowtami() ;
		 Gowthami gm = new Gowthami();
		 gm.rajeswaari();
		 akhil a = new akhil();
		 a.shekar();
		 
		 
		// TODO Auto-generated method stub

	}

}
