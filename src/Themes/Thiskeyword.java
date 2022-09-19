package Themes;
class Thiskeyword{
	double headDoctor_salary;
	String name;
	
Thiskeyword(double headDoctor_salary,String name){
		this.headDoctor_salary=headDoctor_salary;
		this.name=name;
}
void details() {
		System.out.println("doctor name is=.."+headDoctor_salary);
		System.out.println("doctor salary is=.. "+name);
			}
		

		public static void main(String[] args) {
			
			 Thiskeyword obj = new  Thiskeyword(5000000,"mohanrao");
			 obj.details();
}

}
