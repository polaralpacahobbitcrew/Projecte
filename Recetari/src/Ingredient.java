
import java.util.LinkedList;

public class Ingredient {

	private int code;
	private String name;
	private String measuringMethod;
	private double kCal;
	private double carbohydrates;
	private double proteines;
	private double fat;
	private double salt;
	private LinkedList<Allergen> allergens;
	
	public Ingredient(int code, String name, String measuringMethod, double kCal, double carbohydrates,
			double proteines, double fat, double salt, LinkedList<Allergen> allergens) {
		this.code = code;
		this.name = name;
		this.measuringMethod = measuringMethod;
		this.kCal = kCal;
		this.carbohydrates = carbohydrates;
		this.proteines = proteines;
		this.fat = fat;
		this.salt = salt;
		this.allergens = allergens;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getMeasuringMethod() {
		return measuringMethod;
	}

	public double getkCal() {
		return kCal;
	}

	public double getCarbohydrates() {
		return carbohydrates;
	}

	public double getProteines() {
		return proteines;
	}

	public double getFat() {
		return fat;
	}

	public double getSalt() {
		return salt;
	}

	public LinkedList<Allergen> getAlergerns() {
		return allergens;
	}
	
	public boolean verifyAllergen (Allergen queryAllergen){
		for ( Allergen allergen : allergens ) {
			if ( allergen.getCode() == queryAllergen.getCode()) {
					return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		// TO DO :)
		return "NiggattPeneCrew";  
	}
}
