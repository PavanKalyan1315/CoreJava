package Themes;

public class bank {

	public void form() {
		System.out.println("details name_accountNumber_phnumber");
	}
	public void docProf(int adhar,String address) {
		System.out.println("adhar="+adhar+"address="+address);
	}
	String passbook() {
		return"passbook";
	}
	String credit( int amount) {
		System.out.println("credited amount="+amount);
		return"credit";
	}

     public static void main (String args[]) {
    	 bank pavan = new bank();
    	 pavan.form();
    	 pavan.docProf(56464646,"bhadachalam");
    	 System.out.println("bank give the ="+pavan.passbook());
    	 System.out.println("amount"+pavan.credit(5000));
     }
}