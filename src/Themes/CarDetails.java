package Themes;
class TATA{
	String carname;
	int speed;
	float malige;
	int seating;
	String colour;
	long price;
	short warrenty;
}
public class CarDetails {
	public static void main(String args[]) {
	TATA car =new TATA();
	car.carname="indica";
	car.speed=120;
	car.malige=20;
	car.seating=7;
	car.colour="red";
	car.price=120000000;
	car.warrenty=2;
	System.out.println("carname= "+car.carname);
	System.out.println("car speed= "+car.speed+"kmph");
	System.out.println("car milage= "+car.malige+"km");
	System.out.println("car seating= "+car.seating+" members");
	System.out.println("car colore= "+car.colour);
	System.out.println("car price= "+car.price);
	System.out.println("car warrenty= "+car.warrenty);
	
	}
}
