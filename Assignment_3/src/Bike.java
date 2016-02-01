
public class Bike {
		
		private static String color = "blue";
		private static int price = 100;
		private static int size = 15;
		
	
	public Bike(String color, int size){
	 this.color = color;
	 this.size = size;
 }
 
	public Bike(String color, int size, int price){
	 this.color = color;
	 this.size = size;
	 this.price = price;
	 
 }
 public static String getColor(){
	 return color;
 }
 
 public static int getSize(){
	 return size;
 }

 public static int getPrice(){
	 return price;
 }

 }

