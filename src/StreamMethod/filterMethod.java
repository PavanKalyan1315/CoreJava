package StreamMethod;

import java.util.ArrayList;

public class filterMethod {

	public static void main(String[] args) {
		ArrayList<Integer> rm = new ArrayList<Integer> ();
		rm.add(3);
		rm.add(-6);
		rm.add(4);
		rm.add(9);
		rm.add(5);
		System.out.println("numbers"+rm);
		ArrayList<Integer> positivenumbers = new ArrayList<Integer> ();
		for(Integer t:rm) {
			if(t > 0) {
				positivenumbers.add(t);	
			}
		}
		System.out.println(positivenumbers);
	}

}
