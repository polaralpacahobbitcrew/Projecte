
/*
 * Ingredient.java
 *
 * Class that defines an ingredient.
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
import java.util.Map.Entry;

public class Ingredient {

	private int code;
	private String name;
	private String measuringMethod;
	private double kCal;
	private double carbohydrates;
	private double proteines;
	private double fat;
	private double salt;
	Allergen a = new Allergen();
	private HashMap<Integer, String> allergens;
	
	public Ingredient(int code, String name, String measuringMethod, double kCal, double carbohydrates,
		double proteines, double fat, double salt, ArrayList<Integer> codes) {
		this.code = code;
		this.name = name;
		this.measuringMethod = measuringMethod;
		this.kCal = kCal;
		this.carbohydrates = carbohydrates;
		this.proteines = proteines;
		this.fat = fat;
		this.salt = salt;
		this.allergens = a.getMapIng(codes);
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
	
	public HashSet<String> getAllergens(){
		HashSet<String> s = new HashSet<String>();
		for (Entry<Integer,String> entry : allergens.entrySet()){
			//System.out.println(entry.getValue());
			s.add(entry.getValue());
		}
		return s;
	}
	//Imprimir llista sencera Allergens
	public void getFullAllergens(){
		for (Entry<Integer,String> entry : a.getMap().entrySet()){
			System.out.println("Codi = " + entry.getKey() + " Allergen: " + entry.getValue());
		}
	}
	@Override
	public String toString() {
		return "Ingredient [code=" + code + ", name=" + name + ", measuringMethod=" + measuringMethod + ", kCal=" + kCal
				+ ", carbohydrates=" + carbohydrates + ", proteines=" + proteines + ", fat=" + fat + ", salt=" + salt
				+ ", allergens=" + allergens + "]";
	}

	
	public void verifyAllergen (int i){
			if ( allergens.containsKey(i)) System.out.println("L'allergen code " + i + " is found");
			else System.out.println("L'allergen code " + i + " is not found");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingredient other = (Ingredient) obj;
		if (code != other.code)
			return false;
		return true;
	}
	
	
}