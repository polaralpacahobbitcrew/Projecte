
/*
 * Recipe.java
 *
 * Class that defines a recipe.
 *
 * Copyright 2015 	Miquel Luque <miquel.luque.rodriguez@gmail.com>
 * 					Carlos Mateos <kizors@vayanombre.com>
 * 					Chema García-Arias García-Morato <josemgagm@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Recipe {
	
	private int code;
	private String name;
	private HashMap<Ingredient, Integer> ListIngredients = new HashMap();
	private double kCal;
	private double carbohydrates;
	private double proteins;
	private double fat;
	private double salt;
	private HashSet<HashSet<String>> allergens;
	private ArrayList<Integer> quantity;
	
	public Recipe(int code, String name, ArrayList<Ingredient> ingredientList, ArrayList<Integer> quantity, double kCal, double carbohydrates, double proteins, double fat, 
			double salt) {
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.kCal = kCal;
		this.carbohydrates = carbohydrates;
		this.proteins = proteins;
		this.fat = fat;
		this.salt = salt;
		for ( int i : quantity){
			int count = 0;
			ListIngredients.put(ingredientList.get(count), quantity.get(i));
			count++;
		}
		for ( Ingredient ing : ingredientList){
			allergens.add(ing.getAllergens());
		}
		
	}
	
	public HashSet<HashSet<String>> getAllergenList(){
		return allergens;
	}
	
	public boolean hasAllergen (Allergen a){
		for (HashSet<String> s : allergens){
			if ( s.contains(a)){
				return true;
			}
		}
		return false;
	}
	
	public void printRecipe (Recipe r){
		
	}
}