import java.util.LinkedList;

public class TUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Allergen glutenAllergen = new Allergen( 1,"Gluten");
		Allergen dairyAllergen = new Allergen( 2,"Dairy");
		Allergen eggsAllergen = new Allergen( 3,"Eggs");
		
		LinkedList<Allergen> allergens = new LinkedList<Allergen>();
		allergens.offer(glutenAllergen);
		allergens.offer(dairyAllergen);
		Ingredient milk = new Ingredient(1, "Milk", "Units", 25.4, 50, 2, 0, 172, allergens);
		allergens.clear();
		allergens.offer(eggsAllergen);
		Ingredient eggs = new Ingredient(2, "Eggs", "Units", 25.4, 50, 2, 0, 172, allergens);
		allergens.clear();

	}

}
