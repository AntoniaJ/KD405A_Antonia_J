
public class Cat extends Mammal{
	
	//Methods
	private int numberOfLives;
	
	
	//Constructors
	public Cat(String latinName, int gestationTime, int numberOfLives){
		super(latinName, gestationTime);
		this.numberOfLives = numberOfLives;
	}


	public int getNumberOfLives() {
		return numberOfLives;
	}


	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}


	public String getInfo() {
		return "I am a cat and my latin name is" + getLatinName();
	}

}
