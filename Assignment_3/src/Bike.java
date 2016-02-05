/**class*/
public class Bike {
		
		public String color;
		public int price;
		public int size;
		public int numberOfBikes;
		
	
	public Bike(String color, int size){
	 this.color = color;
	 this.size = size;
 }
 /**Constructors*/
	public Bike(String color, int size, int price){
	 this.color = color;
	 this.size = size;
	 this.price = price;
	 
	 if(size<= Constants.MIN_SIZE){
		 this.size = Constants.MIN_SIZE;
	 }
	 
	 if(size >= Constants.MAX_SIZE){
		 this.size = Constants.MAX_SIZE;
	 }
	 
	 if(price <= Constants.MIN_PRICE){
		 this.size = Constants.MIN_PRICE;
		 
	 }
	 
	 if(price >= Constants.MAX_PRICE){
		 this.size = Constants.MAX_PRICE;
	 }
	 
	 if(numberOfBikes >= Constants.MAX_NUMBER_OF_BIKES){
		 this.numberOfBikes = Constants.MAX_NUMBER_OF_BIKES;
	 }
	 
	 
	 for(int i = 0; i < Constants.bikeColors.length; i++){
		 if(0 == color.compareTo(Constants.bikeColors[i].toString())){
			 this.color = color;
			 break;
		 }
		 else {
			 this.color = "error";
		 }
	 }
	 
 }
	/**Methods*/
	
 public String getColor(){
	 return this.color;
 }
 
 public int getSize(){
	 return this.size;
 }

 public int getPrice(){
	 return this.price;
 }

 
 public int getNumberOfBikes(){
	 return numberOfBikes;
 }
 
 }

