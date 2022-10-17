package Itarators;
import java.util.*;

public class splitItiterator {

	public static void main(String[] args) {
		List<String> hs =  new ArrayList<String> ();
		hs.add("p");
		hs.add("a");
		hs.add("v");//duplicate
		hs.add("a");
		hs.add("");//null
		hs.add("n");
		System.out.println(hs);
		//Spliterator<Integer> sp = new Spliterator<Integer>();
		Spliterator<String> sp = hs.spliterator();
		
		System.out.println(sp);
	}

	@Override
	public String toString() {
		return "splitItiterator []";
	}

}
