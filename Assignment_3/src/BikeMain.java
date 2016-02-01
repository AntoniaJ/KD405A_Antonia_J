import java.util.ArrayList;

public class BikeMain {
	private static ArrayList<Bike> allBikes = new ArrayList<Bike>();
	
	private int price;
	
	

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
		allBikes.add(new Bike("blue", 300, 8));
		System.out.println("Bike " + String.valueOf(i) + " has the color " + Bike.getColor() + " and the price " + Bike.getPrice());
		
	}
	
	}
}
