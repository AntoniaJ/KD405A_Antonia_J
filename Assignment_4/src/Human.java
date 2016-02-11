
public class Human {
	private Dog dog;
	private String name;
	private String info;
	
	public Human(String name){
		this.name=name;
	
	}
	
	public String getName(){
		return name; 
		
	}
	
	public Dog buyDog(Dog dog1){
		this.dog = dog1;
		return dog;
		
	}
	
	public String getInfo(String info){
		if(dog == null){
			info = name + " har ingen hund";
		}else{
			info = name + " köper en hund som heter: " + dog.getName();
 		}
		return info;
	}

	
	public void setInfo(String info) {
		this.info = info;
	}
}
	


	
	/**
	public void getInfo(String info){
	
}
}
	
	*/

	/**
	
	public Human (String name){
		for (int i = 0; i< Constants.MIN_LETTERS_HUMAN; i++){
			if(name.length() >= Constants.MIN_LETTERS_HUMAN){
				Human.name = name;
			}
			else{
			Human.name = "The name has to be longer that 3 letters";
		}
		}
	}
	*/
	


