
public class Snake extends Animal {
	
	/**methods*/
	private boolean poisonous;
	
	/**Constructors*/
	public Snake(String latinName, boolean poisonous){
		super(latinName);
		this.poisonous = poisonous;
	}
	
	public boolean isPoisonous(){
		return poisonous;
	}

	/**Loop where the information is printed*/
	@Override
	public String getInfo() {
		if(isPoisonous() == true){
		return ("I am a snake with the latin name "+ getLatinName() + " and I am poisonous");
	}else{
		return("I am a snake with the latin name "+ getLatinName() + " and I am not poisonous");
	}
	}

}