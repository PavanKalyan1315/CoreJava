package practice;

public class Static_program1 {
	static String hosptialname ;
	int patientID  ;
	double phnumber;
	String patientname;
	String address;
	

	public static void main(String[] args) {
		Static_program1 hsp = new Static_program1();
		hsp.hosptialname = "govt";
		hsp.patientID=1234;
		hsp.phnumber= 788787;
		hsp.patientname="ragu";
		hsp.address= "rajamendry";
		System.out.println("hsp name=="+hsp.hosptialname);
		System.out.println("patientid=="+hsp.patientID);
		System.out.println( "ph number=="+hsp.phnumber);
		System.out.println( "patient name=="+hsp.patientname);
		System.out.println("address=="+hsp.address);
		
		// TODO Auto-generated method stub

	}

}
