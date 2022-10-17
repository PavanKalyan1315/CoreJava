package Own_theme;
interface Animal{
	void eat();
	void gives();
}
abstract class cow implements Animal{
	abstract void colour();
	void cultivate() {
		System.out.println("cows also cultivate the feilds  ");
	}
}
class gercycow extends cow{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("cows  eates the green grass & paddy grass");
	}

	@Override
	public void gives() {
		// TODO Auto-generated method stub
		System.out.println("cow gives milks ");
	}

	@Override
	void colour() {
		// TODO Auto-generated method stub
		System.out.println("cow has different colours like red,white,black ");
	}

	
}

 class giricow  extends cow{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("giricows  eates the green grass & paddy grass");
	}

	@Override
	public void gives() {
		// TODO Auto-generated method stub
		System.out.println("giricow gives milks ");
	}

	@Override
	void colour() {
		// TODO Auto-generated method stub
		System.out.println("giricow has different colours like red,white, ");
	}
	
	 
 }
 abstract class dog implements Animal{
		void heights() {
			System.out.println("dog has very short height");
		}
	}
 class streetdog extends dog{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog eate the dog biscuits ");
	}

	@Override
	public void gives() {
		// TODO Auto-generated method stub
		System.out.println("dog give security to the house");
	}
	 
 }
public class interface_owntheme {

	public static void main(String[] args) {
		cow w;
		w= new gercycow();
		System.out.println(".................");
		System.out.println(".gercycow.");
		w.cultivate();
		w.eat();
		w.gives();
		
		w= new giricow();
		System.out.println(".................");
		System.out.println("..giricow..");
		w.cultivate();
		w.eat();
		w.gives();

	
		System.out.println(".................");
		System.out.println(".streetdog.");
		dog d ;
		d = new streetdog();
		d.heights();
		d.eat();
		d.gives();
		
		// TODO Auto-generated method stub

	}

}
