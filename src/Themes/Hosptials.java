package Themes;

public class Hosptials {

	String patientname;
	int patientage;
	String patientProblem;
	public void HosptialNames() {
		System.out.println("Govthosptial,GandiHosptial,kIMshosptials");
	}
	public void hosptialselection(String HosptialNames) {
		System.out.println("choose the one hosptial:"+ HosptialNames);
	}
	public void patientDetails(String patientname,int patientage,String patientProblem){
		System.out.println("patient name is :"+patientname);
		System.out.println("patient age is :"+patientage);
		System.out.println("patient problem is :"+patientProblem);
	}
	public void  doctorCheckup(String bloodtest, String madicine) {
		System.out.println("doctor wrote for blood test:"+bloodtest);
		System.out.println("doctor wrote the madicine after checkup the bloodtest:"+madicine);
		
	}
	  String payment(int amount) {
		  
		System.out.println("amount given="+amount);
		return"payment 5000";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hosptials kalyan =new Hosptials();
        kalyan.HosptialNames();
        kalyan.hosptialselection("GandiHosptial");
        kalyan.patientDetails("ragava",28,"fever");
        kalyan.doctorCheckup("bloodtest_positive","injections_selineBottles_tablets");
        System.out.println("after dischage pay the bill is "+kalyan.payment(5000));
	
	}
	
    


}
