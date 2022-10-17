package java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee>list= new ArrayList<Employee>();
		list.add(new Employee(1234,"pavan",100000));
		list.add(new Employee(1234,"uday",120000));
		list.add(new Employee(1234,"sathya",20000));
		list.add(new Employee(1234,"jittu",50000));
		list.add(new Employee(1234,"vinay",30000));
		List<Employee>fi= list.stream().filter(x->x.getSalary()==100000).collect(Collectors.toList());
		fi.forEach(t->System.out.println(t.getEid()+" "+t.getEname()+" "+t.getSalary()));
	}

}
