package Themes;

class Parent{
	String parentname="ramadevi" ;
	double phnumber = 123456;
}
class Child extends Parent{
	String childname ="chinnu";
	double phnumber = 35373737;
	void details() {
	System.out.println("parent name ="+super.parentname+".....phnumber is ="+super.phnumber);	
	System.out.println("child name ="+childname+"....phnumber is ="+phnumber);	


}

	
}
public class superkeyword {

	public static void main(String[] args) {
		Child boy = new Child();
		boy.details();
		// TODO Auto-generated method stub

	}

}
