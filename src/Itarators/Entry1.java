package Itarators; 

import java.util.Map.Entry;
import java.util.*;

public class Entry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TreeMap<Integer,String> hm = new TreeMap<Integer,String>();


		hm.put(9,  " pavan");
		hm.put(8,  " sai");
		hm.put(6,  " suri");
		hm.put(4,  " uday");
		hm.put(1,  " kohli");
		hm.put(5,  " dinesh");
		hm.put(7,  " kumar");
		hm.put(10, " vijay");
		System.out.println(hm);
		Set<Entry<Integer,String>> s= hm.entrySet();
	    Iterator<Entry<Integer,String>>i=s.iterator();
	    while (i.hasNext()) {
	    	Entry<Integer,String>ee= i.next();
	    	System.out.println(ee.getKey()+""+ee.getValue());
	    }
	}

}
