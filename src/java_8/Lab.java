package java_8;

public class Lab implements Dog{
	public void bark() {
		System.out.println("lab barks aloud");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Lab a = new Lab ();
        a.bark();
        a.sleep();
        Dog.eat();
	}

}
