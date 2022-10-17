package java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class owntheme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List< Children_hosptial>obj = new  ArrayList<Children_hosptial>();
obj.add(new Children_hosptial("kimsHosptial","hyd","skinspecialist_Dr.ramesh"," Brain specialist dr.nageswarao"));
obj.add(new Children_hosptial("nikitha Hosptial","khammam","skinspecialist_Dr.nikitha"," Brain specialist dr.ramulu"));
obj.add(new Children_hosptial("healthcare Hosptial","bhadrachalam","skinspecialist_Dr.jansi"," Brain specialist dr.swapna"));
List<Children_hosptial>abc=obj.stream().filter(x->x.getHosptial_name() =="healthcare Hosptial").collect(Collectors.toList());
abc.forEach(t->System.out.println(t.getHosptial_name()+""+t.getAddress()+""+t.getSpecialDoctor1_name()+""+t.getSpecialDoctor1_name()));

}

	}


