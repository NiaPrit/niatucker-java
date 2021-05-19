package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();


		// map is a collection class to store and access key value pairs
		// The KEY - unique identifier to associate with a value
		//The Value- the data to be associated w/ a key
		// a Map is also known as " Associative Array"
		// the content of the KEY must be unique
		//the content of the VALUE does not have to be unique

		// 3 Types of maps
		// HashMap - entries are stored in an unknown order
		// TreeMap- entries are stored in key sequence order
		// LinkedHashMap- entries are stored in the order in which they were added

		// Two common ways to define a map
		// 1. Map<KEYdatatype, VALUEdatatype> niasMap = new typeOfMap ();
		// 2. typeOfMap<KEYdatatype, VALUEdatatype> niasMap = new typeOfMap():

		//Map<String, String> niasMap = new Hashmap();
		//HashMap<String, String> niasMap = new Hashmap();

		//  key     value
		//  type    type   Map Name = new typeOfMap();
		Map<String, String> residence = new HashMap();

		//Add people to our map using .put

		residence.put("Frank ", "Mayfield");
		residence.put("Nia", "Streetsboro");
		residence.put("Anthony", "Wes Des Moines, Iowa");
		residence.put("JC", "University Heights, OH");
		residence.put("Dana", "Buffalo");
		residence.put("Daniel", "Buffalo");

		// use . get(key) to retrieve an entry from the map - returns the value associated with key given
		System.out.println("Anthony lives in " + residence.get("Anthony"));
		System.out.println("Nia lives in " + residence.get("Nia"));
		System.out.println("Dana lives in " + residence.get("Dana"));

		String whoWeWant = "Daniel";
		System.out.println(whoWeWant + " lives in " + residence.get(whoWeWant));

		// Since the content of a key must be unique in a Map
		// If you try to add an entry with existing key -It will replace the existing key

		residence.put("Frank", "Highland Heights"); //Frank is already a key in the Map
		System.out.println("Frank lives in " + residence.get("Frank"));

		// .containsKey - check to see if a key is already in the Map before we try to add it

		if (residence.containsKey(whoWeWant)) { // check to see if Map contains the key in whoWeWant
			System.out.println(whoWeWant + " is already in the Map - continuing will update the value");
		} else { // if whoWeWant is not already in the map- add item
			residence.put(whoWeWant, "Timbutu");
		}


// To process all the entries in a Map
	// We need to get all the keys in the Map and use them to access them
	// .keySet() may be used to retrieve all the keys from Map as a Set object
	// A set object an a unique set of Values from a collection class
	// To define a Set object

	Set<String> theKeys = residence.keySet(); //holds all the keys from the Map - keys are String in our Map
	// we can go through the set of keys one at a time retrieving an entry from the map

		for (String aKey : theKeys) { //Go through theKeys one at a time storing the current key in aKey
			System.out.println("Entry in Map for Key : " + aKey + " is: " + residence.get(aKey));
		}

		// .remove(key) - will remove an entry for the "Frank" from the map
		residence.remove("Frank");
		System.out.print
	}//end of the program

}// end of the class that contains our program






