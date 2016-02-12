
public class Cat extends Mammal{
	
	/**Methods*/
	private int numberOfLives;
	
	
	/**Constructors*/
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

	/** String where the information is printed*/
	@Override
	public String getInfo() {
		return "A cat has the latin name " + getLatinName() +" nurses for "+ getGestationTime() + " months and has "+ getNumberOfLives() + " lives";
	}

}

/**a cat latin: xx, nurses for xx months and has xx lives*/