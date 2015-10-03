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
		return getCode() + " " + getName();  
	}
}
