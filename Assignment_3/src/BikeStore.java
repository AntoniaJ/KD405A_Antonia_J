import java.util.ArrayList;

public class BikeStore {
	/** All Bikes in the store*/
	private ArrayList<Bike> allBikes = new ArrayList<Bike>();
	
	public static String getAllBikes(){
		String returnString = "";
		ArrayList<Bike> addBikes;
		for (int i = 0; addBikes.size(); i++){
			returnString += ("bike " + (i + 1) + " är storlek " + addBikes.get(i).getSize() + " och färgen " + addBikes.get(i).getColor() + " och kostar " + addBikes.get(i).getPrice());
		}
return returnString;	
}
/**add a bike to the list*/
	public static void addBike1(String color, int size, int price){
		ArrayList<Bike> addBikes = null;
		addBikes.add(new Bike (color, size, price));
	}
}

/**
	public String addBike(String color, String size, String price){
		String returnString = " ";
		for(Bike bikes : allBikes){
		if(Bike.getnumberOfBikes() < Constants.MAX_NUMBER_OF_BIKES){
			this.addBike(color, size, price);
		}

		}
		return price;
	}
	
	
	public void main(String[] args) {
		Bike bike1 = new Bike("blue", 8, 300);
		allBikes.add(bike1);
		Bike bike2 = new Bike("red", 3, 1000);
		allBikes.add(bike2);
		Bike bike3 = new Bike("white", 10, 20000);
		allBikes.add(bike3);
		Bike bike4 = new Bike("gray", 6, 200);
		allBikes.add(bike4);
		Bike bike5 = new Bike("turqoise", 20, 359);
		allBikes.add(bike5);
		Bike bike6 = new Bike("black", 15, 1089);
		allBikes.add(bike6);
		Bike bike7 = new Bike("silver", 10, 999);
		allBikes.add(bike7);
		Bike bike8 = new Bike("black", 5, 499);
		allBikes.add(bike8);
		Bike bike9 = new Bike("pink", 10, 30000);
		allBikes.add(bike9);
		Bike bike10 = new Bike("silver", 30, 3100);
		allBikes.add(bike10);
		
		int i = 1;
		
		for(Bike bikes : allBikes){
			System.out.println("Bike " + (i++) + " has the color " + bikes.getColor() + " and the price " + bikes.getPrice());
		}
			
	}

	public static void addBike(String text, int size, int price) {
		// TODO Auto-generated method stub
		
	}
}
		
		*/
		