package Themes;

  class Janu {
	String fav_coluors;
	String fav_food;
	int lickynumber;
	int janufrends;
	
	Janu(String coluors ,String food,int number,int frends){
		this.fav_coluors= coluors;
		this.fav_food =food;
		this.lickynumber=number;
		this.janufrends=frends;
		this.janudetails();
	}
	void janudetails() {
		System.out.println("janu fav coloris ="+ fav_coluors);
		System.out.println("janu fav food ="+fav_food);
		System.out.println("janu lucky nb="+lickynumber);
		System.out.println("janu close frends are ="+lickynumber);
	}
}

	
