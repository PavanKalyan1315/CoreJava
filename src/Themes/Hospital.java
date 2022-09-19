package Themes;
class patient{
	String name;
	int age;
	float time;
	String problem;
	double weight;
	char bloodgroup;
	int bill;
	
}
public class Hospital {
	public static void main(String[] args) {
		 patient kalyan = new patient();
		 kalyan.name="pavan";
		 kalyan.age=23;
		 kalyan.problem="fever";
		 kalyan.weight=44.5;
		 kalyan.bloodgroup='A';
		 kalyan.bill=10000;
		 System.out.println("patient name: "+kalyan.name);
		 System.out.println("patient age: "+kalyan.age);
		 System.out.println("patient problem: "+kalyan.problem);
		 System.out.println("patient weighgt: "+kalyan.weight);
		 System.out.println("patient bloodgroup: "+kalyan.bloodgroup);
		 System.out.println("patient bill: "+kalyan.bill);
		 

	}

}
