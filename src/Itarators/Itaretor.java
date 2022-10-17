package Itarators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Itaretor {

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
		Iterator h = hs.iterator();
		while (h.hasNext()) {
			System.out.println(h.next());
		}
		System.out.println("=========================");
		List<String> n =  new LinkedList<String> ();
		n.add("k");
		n.add("a");
		n.add("l");//duplicate
		n.add("y");
		n.add("");//null
		n.add("n");
		System.out.println(n);
		ListIterator m = n. listIterator ();
		while (m.hasNext()) {
			System.out.println(m.next());
		}
		System.out.println("=========================");
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
