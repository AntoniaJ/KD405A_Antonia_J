import java.util.ArrayList;

public class BikeStore {
	/** All Bikes in the store */
	

		private ArrayList<Bike> allBikes = new ArrayList<Bike>();
		
  
 
	public String getAllBikes() {
		String returnString = "";
	//	ArrayList<Bike> addBikes;
		for (int i = 0; i < allBikes.size(); i++) {
			returnString += ("bike " + (i + 1) + " size " + allBikes.get(i).getSize() + " and colour " + allBikes.get(i).getColor() + " and costs " + allBikes.get(i).getPrice() + "\n");
		}
		return returnString;
	}

	/** add a bike to the list */
	public void addBike1(int size, String color, int price) {
		allBikes.add(new Bike(size, color, price));
	}

}

