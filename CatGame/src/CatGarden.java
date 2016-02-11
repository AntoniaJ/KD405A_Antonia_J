import java.util.ArrayList;

public class CatGarden {
	private ArrayList<Cat> allCats;
	public ArrayList<Cat> getAllCats() {
		return allCats;
	}

	public void setAllCats(ArrayList<Cat> allCats) {
		this.allCats = allCats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	
	public CatGarden(String name){
		allCats = new ArrayList<Cat>();
		this.name = name;
		
	}
	
	public void addCat(Cat c){
		if (allCats.size() <101){
			this.allCats.add(c);
			
		}
	}
	
	public void killCat(){
		if(allCats.size()>0);
		allCats.remove(0);
		
	}
	public String getName1(){
		return name;
		
	}

	public void setName1(String name){
		this.name = name;
	}
	public String getCats(){
		String s = this.name+"\n";
		for(Cat cat : allCats) {
			s=s + cat.getName() + "\n";
	}
		return s;

}
}