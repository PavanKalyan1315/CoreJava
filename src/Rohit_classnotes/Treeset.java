package Rohit_classnotes;


import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t =  new <Integer>TreeSet ();
		t.add(10);
		t.add(9);
		t.add(8);
		t.add(7);
		t.add(6);
		t.add(5);
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		System.out.println("first element "+t.first());
		System.out.println("last element "+t.last());
		System.out.println("lower element "+t.lower(8));
		System.out.println("floor element "+t.floor(4));
		System.out.println("ceiling element "+t.ceiling(7));
		System.out.println("higher element "+t.higher(1));
		System.out.println("pollfirst element "+t.pollFirst());
		System.out.println("polllast element "+t.pollLast());
		System.out.println("subset element "+t.subSet(1,7));
		System.out.println("headset element "+t.headSet(4));
		System.out.println("tailSet element "+t.tailSet(4));

	}

}
