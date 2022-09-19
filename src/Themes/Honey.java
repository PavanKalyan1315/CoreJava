package Themes;

public class Honey extends Janu {
	String fav_coluors;
	String fav_food;
	int lickynumber;
	int honeyfrends;
	Honey (String fav_coluors ,String fav_food,int lickynumber,int janufrends){
		super("RED", "RICE", 56, 5);
		this.fav_coluors= fav_coluors;
		this.fav_food =fav_food;
		this.lickynumber=lickynumber;
		this.honeyfrends= janufrends;
		this.honeydetails();
		
	}
	
	void honeydetails() {
		System.out.println("honeyfav coloris ="+ fav_coluors);
		System.out.println("honey fav food ="+fav_food);
		System.out.println("honey lucky nb="+lickynumber);
		System.out.println("honey close frends are ="+lickynumber);
	}
	public static void main(String[] args) {
		Honey ab = new Honey("black","veg biryani",4,7);
		
		
		
		

	}
}

