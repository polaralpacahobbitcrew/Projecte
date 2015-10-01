
public class Allergen {
	int code;
	String name;
	
	public Allergen (int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public int getCode(){
		return this.code;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString(){
		// TO DO :)
		return "NiggattPeneCrew";  
	}
}
