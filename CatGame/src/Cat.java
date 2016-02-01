
public class Cat {
	private String color = "gray";
	private String name;
	private int age = 0;
	private static int MAX_AGE= 220; //Age in months
	
	//Constructor
	public Cat (){
		this.name = "Knodden";
		
	}
	//creates a cat named knodden
	public Cat(String color, String name){
		this.color = color;
		this.name = name;
		
	}
	
	//Methods
	
	public String getColor(){
		return this.color;
		
	}
	
	public String getName(){
		return this.name;
		
	}
	
	//sets age between 0 - 220 months
	public void setAge(int age){
		if (age > 0 && age <= MAX_AGE){
		this.age = age;
		
	}	
}
	
	public int getAge(){
		return this.age;
		
	}
	
	}
