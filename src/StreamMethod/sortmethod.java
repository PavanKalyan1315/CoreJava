package StreamMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class sortmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> rm = new ArrayList<Integer> ();
		rm.add(3);
		rm.add(-6);
		rm.add(4);
		rm.add(9);
		rm.add(5);
		rm.add(22);
		rm.add(19);
		rm.add(22);
		rm.add(15);
		System.out.println("numbers"+rm);
		System.out.println("assending order");
		List<Integer> sortedNumbers = rm.stream().sorted().collect(Collectors.toList());
		System.out.println("addnumbers"+sortedNumbers);
		System.out.println("desending order");
List<Integer>customsortedNumber = rm.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println("addnumbers"+customsortedNumber);
	}
}
