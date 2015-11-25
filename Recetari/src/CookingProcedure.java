
/*
 * CookingProcedure.java
 *
 * Class that defines a cooking procedure.
 *
 * Copyright 2015 	Miquel Luque <miquel.luque.rodriguez@gmail.com>
 * 					Carlos Mateos <kizors@vayanombre.com>
 * 					Chema García-Arias García-Morato <josemgagm@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.HashMap;

public class CookingProcedure {
	HashMap<Integer, String> procedures = new HashMap<Integer, String>();

	
	public CookingProcedure(){
		procedures.put(1,"Bake in oven");
		procedures.put(2,"Boil");
		procedures.put(3,"Fry");
		procedures.put(4,"Whip"); //Montar
		procedures.put(5,"Heat up");
		procedures.put(6,"Heat up in microwave oven");
		procedures.put(7,"Blend"); //Batir
		procedures.put(8,"Mix");
		procedures.put(9,"Fry lightly");
	}

	/* proceedIngredient method
	 * 
	 * @param procedureCode
	 * @param ingredientCode
	 * @param quantity
	 * @param times
	 * @param time
	 * @param temperature
	 * 
	 * @return a String with the hole procedure
	 * */
	public String proceedIngredient(int procedureCode, int ingredientCode, int quantity, int times, int time, int temperature){
		String stepText = procedures.get(procedureCode) + quantity;
		return stepText;
	}
	public String simpleStep(String stepText) {
		return stepText;
	}
}