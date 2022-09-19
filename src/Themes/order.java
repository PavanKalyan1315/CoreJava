package Themes;
class Service{
void pavan(int x ,int y ,int z) {
	System.out.println("sum the values = "+(x+y+z));
}
void pavan(float x, float y) {
	System.out.println("sum of the decimal values = "+(x+y));
}
}
public class order {

	public static void main(String[] args) {
		 Service swiggy = new  Service();
         swiggy.pavan(1,2,3);
         swiggy.pavan(4,5);
	}

}
