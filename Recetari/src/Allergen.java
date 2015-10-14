import java.util.HashMap;

/*
 * Allergen.java        1.0 23/09/2015
 *
 * Class that characterize an alleger
 *
 * Copyright 2015 	Miquel Luque <mikialpaca@mail.com>
 * 					Carlos Mateos <kizors@vayanombre.com>
 * 					Chema García-Arias García-Morato <josemgagm@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
public class Allergen {
	HashMap<Integer, String> allergens = new HashMap<Integer, String>();
	
	public Allergen () {
		//put all the knowledge allergens inside the map
		allergens.put(1,"Gluten");
		allergens.put(2,"Shellfish");
		allergens.put(3,"Eggs");
		allergens.put(4,"Fish");
		allergens.put(5,"Peanuts");
		allergens.put(6,"Soy");
		allergens.put(7,"Dairy");
		allergens.put(8,"Nuts");
		allergens.put(9,"Celery");
		allergens.put(10,"Mustard");
		allergens.put(11,"Sesame");
		allergens.put(12,"Sulphites");
		allergens.put(13,"Mollusk");
		allergens.put(14,"Lupin");
	}
	
	public HashMap<Integer,String> getMap() {
		//return hashMap
		return allergens;
	}
}
