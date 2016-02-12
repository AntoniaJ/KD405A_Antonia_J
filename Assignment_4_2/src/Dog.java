
public class Dog extends Mammal {

	/**Methods*/
	private boolean stupid;
	
	/**Constructors*/
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

	/**String where the information is printed*/
	@Override
	public String getInfo() {
		if(isStupid() == true){
			return("The dog " + getFriendlyName() + " has the latin name " + getLatinName() + ", nurses for " + getGestationTime() + " months and is stupid");
		}else{
			return("The dog " + getFriendlyName() + " has the latin name " + getLatinName() + ", nurses for " + getGestationTime() + " months and is clever");
		}
		
	
}
}

/** the dog xx, latin: xx nurses for xx months and is xx*/