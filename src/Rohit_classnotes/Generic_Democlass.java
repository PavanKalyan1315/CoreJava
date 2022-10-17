package Rohit_classnotes;

class sample<k>{
	void show (k a) {
		System.out.println(a);
	}
}
public class Generic_Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 sample<Integer>i = new sample <Integer>();
     i.show(100);
     sample<Double> d = new sample<Double> ();
     d.show(3.4);
     sample<String> s= new sample<String> ();
     s.show("pavan kalyan");
	}

}
