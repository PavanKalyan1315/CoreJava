package Rohit_classnotes;

public class exception_note {


	public static void main(String[] args) {
		int  a = 10;
		int b= 0;
		System.out.println(".........before.............");
		try {
			System.out.println(a/b);
			System.out.println("not print");

		}catch(ArithmeticException en) {
			en.printStackTrace();
		}
		System.out.println(".......after try cautch");
		// TODO Auto-generated method stub 
	}

}
