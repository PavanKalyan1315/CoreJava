package Themes;



public class Thisprogram {
	 String name ;
	int id ;
	double phnb ;
	Thisprogram(String name ,int id ,double phnb ) {
	      this. name = name ;
		this. id=id  ;
		this. phnb =  phnb ; 
	}

	void details() {
		System.out.println("person name ="+name);
		System.out.println("person id ="+id);
		System.out.println("person phnb="+phnb);
	}
	public static void main(String[] args) {
		
		Thisprogram obj = new Thisprogram ("kiran",2345,78898834);
		obj.details();
	}

}
