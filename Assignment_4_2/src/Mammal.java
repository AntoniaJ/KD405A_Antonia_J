
public abstract class Mammal extends Animal {
	
	//methods
	private int gestationTime;
	
	//Constructors
	public Mammal(String latinName, int gestationTime){
		super (latinName);
		this.gestationTime = gestationTime;	
	}
	
	public void getGestationTime(){
		this.gestationTime = gestationTime;
		
	}
	
}

