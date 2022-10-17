package collection_map;


import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		

		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();

		hm.put(1029, "john");
		hm.put(1028, "sai");
		hm.put(1022, "suri");
		hm.put(1021, "alice");
		hm.put(1026, "kohli");
		hm.put(1025, "dinesh");
		hm.put(1027, "uday");
		hm.put(1029, "xyz");
		System.out.println(hm);
	
	}

}
