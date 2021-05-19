package com.techelevator;

import java.util.ArrayList; 	// give me access to to code to support ArrayList Class
import java.util.Collections;	// give me access to to code to support Collections Class
import java.util.List; 			// give me access to to code to support List Class

public class Lecture {


	public static void main(String[] args) {

		// ArrayList is a collection class that allows us a more flexible type of array
		// variable size, add/remove element anywhere in the list, access using methods
		// Elements are stored in the order they are added when you use .add()
		// An ArrayList is a type of list class object

		// Two common ways to define an ArrayList:
		// 1. ArrayList<data-type> name = new ArrayList();
		// 2. List<data-type>      name = new ArrayList();
		// <data-type> is the type of data to be stored in the ArrayList ( cannot be primitive type)


		//Define a new ArrayList to hold strings
		// . add() will add elements to the END of the ArrayList
		// .size() will return the current number of elements in an ArrayList
		// .get(index) will return the element at the index specified from the ArrayList - index ALWAYS starts at 0

		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");


		ArrayList<String> names = new ArrayList();  	//instantiate an empty ArrayList object
		names.add("Frank");
		names.add("Dana");
		names.add("Alex");
		names.add("Vanese");
		names.add("Jared");


		System.out.println("Our ArrayList contains " + names.size() + " elements");


		// This gives output of specific index's in the ArrayList
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		System.out.println("The first element is: " + names.get(0));
		System.out.println("The third element is: " + names.get(2));
		System.out.println("The last element is: " + names.get(names.size() -1));


		//We can duplicate values to the ArrayLis
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Frank");
		for (int i=0; i < names.size(); i++) {
			System.out.println("Element at index #" + i + "is: " + names.get(i)); 	// We can use a for loop with .get() to process all the elements from begining to end
		}


		// .add(index,object) - Add object to any place in the ArrayList ( index is where you want it to go)
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(3, "Jess");														// Added "Jess" at element 3
		for (int i=0; i < names.size(); i++) {
			System.out.println("Element at index #" + i + "is: " + names.get(i));
		}

		// .remove(index)  Removes the element at the index from the ArrayList
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(0);
		for (int i=0; i < names.size(); i++) {
			System.out.println("Element at index #" + i + "is: " + names.get(i));
		}

		//.contains(object) Returns true if the object is in the ArrayList
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		System.out.println("Is Amber in the list? " + names.contains("Amber"));
		System.out.println("Is Vanese in the list? " + names.contains("Vanese"));
		System.out.println("Is John in the list? " + names.contains("John"));

		// .indexOf(object) Returns the index of the first occurrence object in the ArrayList
		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		System.out.println("Jess is at index : " + names.indexOf("Jess"));
		System.out.println("Alex is at index : " + names.indexOf("Alex"));
		System.out.println("John is at index : " + names.indexOf("John"));  // If object is not in ArrayList it will return -1

		//  If "Frank" is in the ArrayList, delete him
		// .remove(index) Remove the element at the index
		// .indexOf(object) Return the index of the object in the ArrayList or -1 if its not there
		// We can use multiple methods to achieve the result
		if (names.contains("Frank")) {
			names.remove(names.indexOf("Frank"));
		}
		for (int i=0; i < names.size(); i++) {
			System.out.println("Element at index #" + i + "is: " + names.get(i));
		}

		//.toArray(new datatype[0] Convert the Arraylist to an array of the datatype after new
		// This is useful when a function needs an array and you have an ArrayList
		// Length for an array is a property - so no () will follow it
		// Size() for an ArrayList is a method - so () follow it
		//Length for a String is a method - so () follow it
		// Methods always have ()
		// A property is a value automatically defined by Java related to a Java Data
		// Whenever you see a word followed by () its a method - except for if, for, while

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArray = names.toArray( new String[0]);
		for (int i=0; i < namesArray.length; i++) {
			System.out.println("Element at index #" + i + "is: " + namesArray[i]);
		}

		// Collections.sort(ArrayList) - sort an ArrayList
		// .sort() is member of the Collections class so it can be used with any Collection class
		// ArrayList, Queue, Stack are members of the Collection class
		// Collections.sort(name) - it will sort alphabetically because it contains Strings

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);
		for (int i=0; i < namesArray.length; i++) {
			System.out.println("Element at index #" + i + "is: " + names.get(i));
		}

		 // Collections.reverse(ArrayList) - reverse the order of the elements in the ArrayList
		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		Collections.reverse(names);
		for (int i=0; i < namesArray.length; i++) {
			System.out.println("Element at index #" + i + "is: " + names.get(i));
		}

		// for - each loop is shorthand for - loop when you want to go from the beginning to end of an array/ArrayList
		// for- each ALWAYS goes from beginning to end one element at a time
		// you have no way of knowing in the Loop the index or location of the current element
		// You cannot skip elements in the for-each Loop
		// a for-each is less flexible that a regular for loop -easier to code
		//format of for-each loop: for data type elements-name : array/ArrayList-name
		// each time through the Loop, the element- name contains the current element
		// use the element-name to reference the element from the array the loop
		//use a for-each to display all the elements in our ArrayList

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for (int i=0; i < namesArray.length; i++) {
			System.out.println("Element at index #" + i + "is: " + names.get(i));
	}
}
