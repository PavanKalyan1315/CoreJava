package java_8;

import java.util.Map;
import java.util.TreeMap;

public class FuctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> am = new TreeMap<Integer,String>();
 	 	
 		am.put(1023, "bob");
 		am.put(1025, "john");
 		am.put(1027, "prem");
 		am.put(1029, "pallavi");
 		am.put(1022, "sneha");
 		am.put(1024, "shara");
 		am.put(1028, "siri");
 		am.forEach((key,value)->System.out.println(key+""+value));
 		System.out.println("..................");
 		
 		//for(Map.Entry<Integer, String> m :am.entrySet());
 		//System.out.println(m.getKey()+" "+m.getValue());
	}

}
