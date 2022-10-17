package Rohit_classnotes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LIST_COLLECTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> hs =  new ArrayList<String> ();
		hs.add("p");
		hs.add("a");
		hs.add("v");//duplicate
		hs.add("a");
		hs.add("");//null
		hs.add("n");
		System.out.println(hs);
		
		List<String> n =  new LinkedList<String> ();
		n.add("k");
		n.add("a");
		n.add("l");//duplicate
		n.add("y");
		n.add("");//null
		n.add("n");
		System.out.println(n);
		List<String> v =  new Vector<String> ();
		v.add("s");
		v.add("u");
		v.add("r");//duplicate
		v.add("e");
		v.add("");//null
		v.add("n");
		v.add("d");
		v.add("r");
		v.add("a");
		System.out.println(v);
	}
	

}
