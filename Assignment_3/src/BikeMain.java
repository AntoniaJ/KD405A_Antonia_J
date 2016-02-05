import java.util.ArrayList;

/**Arraylist for 10 bikes in the bikestore*/
public class BikeMain {
	private static ArrayList<Bike> allBikes = new ArrayList<Bike>();

	public static void main(String[] args) {

		Bike bike1 = new Bike(8,"blue", 300);
		allBikes.add(bike1);
		Bike bike2 = new Bike(3, "red", 1000);
		allBikes.add(bike2);
		Bike bike3 = new Bike(10, "white", 20000);
		allBikes.add(bike3);
		Bike bike4 = new Bike( 6, "gray",200);
		allBikes.add(bike4);
		Bike bike5 = new Bike(20, "turqoise",359);
		allBikes.add(bike5);
		Bike bike6 = new Bike(15, "black",1089);
		allBikes.add(bike6);
		Bike bike7 = new Bike(10,"silver", 999);
		allBikes.add(bike7);
		Bike bike8 = new Bike(5,"black",  499);
		allBikes.add(bike8);
		Bike bike9 = new Bike(10, "pink", 30000);
		allBikes.add(bike9);
		Bike bike10 = new Bike(30, "silver", 3100);
		allBikes.add(bike10);
		
		int i = 1;
		
		for(Bike bikes : allBikes){
			System.out.println("Bike " + (i++) + " has the color " + bikes.getColor() + " and the price " + bikes.getPrice());
		}
		
	}
		
	}
	


