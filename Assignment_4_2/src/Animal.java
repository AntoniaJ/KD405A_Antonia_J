
public abstract class Animal {
	
	/**methods*/
	private String latinName;
	private String friendlyName;
	
	/**Constructors*/
	public Animal(String latinName){
		this.latinName = latinName;
		
	}
	
	/**returns the methods for subclasses*/
	public abstract String getInfo();
	
	
	public void setFriendlyName(String name){
		this.friendlyName = name;
	}

	public String getFriendlyName(){
		return this.friendlyName;
	}
	public void setLatinName(String name){
		this.latinName = name;
	}

	public String getLatinName(){
		return this.latinName;
	}
	
}

