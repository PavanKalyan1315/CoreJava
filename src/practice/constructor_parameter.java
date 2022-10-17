package practice;


class Kims{
	String detailsform;
	String problem;
	int weight;
	double phnumber;
	
	Kims(String detailsform,String problem,int weight,double phnumber){
		this.detailsform=detailsform;
		this. problem = problem;
		this. problem = problem;
		this.phnumber =phnumber;
	}
	void showdetails() {
		System.out.println("write the patient details=.."+ detailsform);
		System.out.println(" patient problem is ="+ problem);
		System.out.println("patient weight is=.."+ weight);
		System.out.println("ph number ="+ phnumber);
	}
}
public class constructor_parameter {



	public static void main(String[] args) {
		
		Kims  obj= new Kims("patient details","fever",45,7998856);
		obj.showdetails();
		// TODO Auto-generated method stub

	}





}
