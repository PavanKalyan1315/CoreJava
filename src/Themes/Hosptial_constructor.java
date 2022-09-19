package Themes;
class staff{
	int staffnurse;
	int componders;
	String managername;
	staff(){
		staffnurse=12;
		componders=8;
		managername="rajesh";
	}
	void staffdetails(){
		System.out.println("staff nurses are available in hosptial= .."+ staffnurse);
		System.out.println("compondersare in  hosptial=.."+ componders);
		System.out.println("staff manager name is=.. "+ managername);
	}
}
public class Hosptial_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staff obj =new staff();
     
      obj.staffdetails();
	}

}
