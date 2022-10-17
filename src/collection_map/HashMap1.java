package collection_map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();

		hm.put(1029, "john");
		hm.put(1021, "alice");
		hm.put(1026, "kohli");
		hm.put(1025, "dinesh");
		hm.put(1027, "uday");
		hm.put(1029, "xyz");
		System.out.println(hm);
	
	}

}
