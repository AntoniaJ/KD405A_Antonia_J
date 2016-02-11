
public class Snake extends Animal {
	
	//methods
	private boolean poisonous;
	
	//Constructors
	public Snake(String latinName, boolean poisonous){
		super(latinName);
		this.poisonous = poisonous;
	}
	
	public boolean isPoisonous(){
		return poisonous;
	}

	@Override
	public String getInfo() {
		return "I am snake"+ getLatinName();
	}
	
}

