import java.util.ArrayList;

public class Recipe {
	
	private int code;
	private String name;
	private ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();
	private ArrayList<Integer> quantity = new ArrayList<Integer>();
	private double kCal;
	private double carbohydrates;
	private double proteins;
	private double fat;
	private double salt;
	private ArrayList<Allergen> allergens;
	
	public Recipe(int code, String name, ArrayList<Ingredient> ingredientList, ArrayList<Integer> quantity, double kCal, double carbohydrates, double proteins, double fat, 
			double salt) {
		this.code = code;
		this.name = name;
		this.ingredientList = ingredientList;
		this.quantity = quantity;
		this.kCal = kCal;
		this.carbohydrates = carbohydrates;
		this.proteins = proteins;
		this.fat = fat;
		this.salt = salt;
		this.allergens = allergens;
	}
	
	public void getAllergenList(){
		for ( Ingredient ing : this.ingredientList ) {
			
		}
	}
}
