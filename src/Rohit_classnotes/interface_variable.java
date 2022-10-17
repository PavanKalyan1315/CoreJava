package Rohit_classnotes;
interface Parent{
	String name = "raguram";
	int age = 44;
	String address = "khammam";
}
interface Child {
	String name = "giri";
	int age = 23;
}
class details implements Parent{
	void Details() {
		System.out.println("parent age ="+Parent.age);
		System.out.println("parent name ="+name+"..address="+address);
		
		System.out.println("parent name ="+name);
		System.out.println("parent age ="+Child.age+"name ="+name);
	}
	}

public class interface_variable {

	public static void main(String[] args) {
		details d = new details();
		d.Details();
		// TODO Auto-generated method stub

	}

}
