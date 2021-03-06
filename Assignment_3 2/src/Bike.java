/**class*/
public class Bike {
		
		public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setNumberOfBikes(int numberOfBikes) {
		this.numberOfBikes = numberOfBikes;
	}


		public String color;
		public int price;
		public int size;
		public int numberOfBikes;
		
	
	public Bike(int size, String color){
	 this.color = color;
	 this.size = size;
 }
	
	
 /**Constructors*/
	
	public Bike(int size, String color, int price){
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
		 this.price = Constants.MIN_PRICE;
		 
	 }
	 
	 if(price >= Constants.MAX_PRICE){
		 this.price = Constants.MAX_PRICE;
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
 
 public void setPrice1(int newPrice){
	 this.price = newPrice;
 }

 
 public int getNumberOfBikes(){
	 return numberOfBikes;
 }
 
 }

