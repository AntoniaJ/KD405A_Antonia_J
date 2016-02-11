
public class Dog extends Mammal {

	//Methods
	private boolean stupid;
	
	//Constructors
	public Dog (String latinName, int gestationTime, boolean stupid){
		super (latinName, gestationTime);
		this.stupid = stupid;	
	}
	
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName){
		super (latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);
	}
	
	public boolean isStupid(){
		return stupid;
	}

	@Override
	public String getInfo() {
		return "My friendly name is " + getFriendlyName() + "and my latin name is " + getLatinName();
	}
	
}
