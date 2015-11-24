
/*
 * TUI.java
 *
 * Main class and main interface.
 *
 * Copyright 2015 	Miquel Luque <mikialpaca@mail.com>
 * 					Carlos Mateos <kizors@vayanombre.com>
 * 					Chema García-Arias García-Morato <josemgagm@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.ArrayList;
import java.util.Map.Entry;

public class TUI {

	public static void main(String[] args) {
		ArrayList<Integer> code = new ArrayList<Integer>();
		code.add(1);
		code.add(2);
		Ingredient milk = new Ingredient(1, "Milk", "Units", 25.4, 50, 2, 0, 172, code);
		milk.getAllergens();
		//Imprimir llista completa d'allergens : milk.getFullAllergens();
		code.clear();
		milk.verifyAllergen(1);
		milk.verifyAllergen(5);
	}

}
