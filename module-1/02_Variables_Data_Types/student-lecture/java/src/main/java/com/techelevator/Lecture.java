// This is a comment in Java Program
package com.techelevator; //define the start of a package called com.techelevator
                          // a package is a group of related Java dode

public class Lecture {  //defines the class to hold the group of related things for our application

	public static void main(String[] args) { //This is the state of the main function for our application
		System.out.println("Hello Java Class");

		//System.out -// defined by Java to represent the screen
		// .println()function that tells System.out to display whatever is inside the ()

		// to define a variable in Java: datatype name = initial-value;

		//Choose a datatype based on what you want it to hold:
		// if numeric, without decimal places use INT
		// if numeric, with decimal places use DOUBLE
		// if a single character use CHAR
		// if true ot false use BOOLEAN
		// if its a multiple CHAR use STRING - STRING is a special type in JAVA
		// avoid float if at all possible- double is better
		// if number has no decimal places and is outside range of +/- 2 billion, use long



		/*

		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		int numberOfExercises = 26;

		System.out.println("Number Of Exercise is: " + numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		double half = 0.5;

		System.out.println("The variable half contains the value of " + half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name = "Tech Elevator";
		System.out.println("Name is: " + name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
	int seasonsOfFirefly = 1;
		System.out.println("There were " + seasonsOfFirefly + " seasons of Firefly");

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanguage = "Java";
		System.out.println("I love " +myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		// double = double data types must match on both sides of the equal sign
		double pi= 3.1416; //3.1416 is considered a double because we didn't say it was anything else.
		System.out.println("Pie=" +pi); //Because we want to float we have to identify the number as a float using F

		float pi2= 3.1416F;
		System.out.println("Pie2=" +pi2);
	// casting tells Java to pretend something is different data type for just this statement. put the data type in ()

		float pi3= (float) 3.1416F;
		System.out.println("Pie3=" +pi3);

		/*
		7. Create and set a variable that holds your name.
		*/
       String myName = "Nia Tucker";
       System.out.println("Your name is: " + myName);
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int mouseButtons = 2;
		System.out.println("My mouse has " + mouseButtons + "buttons");
		/*

		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		double pctBatteryLeft = .70;
		System.out.println("pctLife= " + pctBatteryLeft);


		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

		int diff = 121-27;
		System.out.println("diff= " + diff);
		/*

		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
	double sum = 12.3 + 32.1;
		System.out.println("sum is= " + sum);

		/*
		12. Create a String that holds your full name.
		*/
		String myFullName = " Nia M Tucker";
		System.out.println("This is my full name: " + myFullName);
		/*

		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String newString = "Hello " + myFullName;
		System.out.println("newString: = " + newString);
		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
	String movieTitle = "Saw " + 2;
	System.out.println("title=" +movieTitle);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		movieTitle += 0;
		System.out.println("movieTitle");
		/*

		18. What is 4.4 divided by 2.2?
		*/
		System.out.println("4.4 / 2.2=" + 4.4 / 2.2);
		/*
		19. What is 5.4 divided by 2?
		*/
		System.out.println("5.4 / 2=" + 5.4 / 2);
		/*
		20. What is 5 divided by 2?
		*/

		/*
		21. What is 5.0 divided by 2?
		*/

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
			System.out.println("5 % 2 = " + 5 % 2);
		/*
		24. What is 1,000,000,000 * 3?
		*/

		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
boolean doneWithExercises = false;
		System.out.println("done =" + doneWithExercises);
		/*
		26. Now set doneWithExercise to true.
		*/
		
	} //end of the main () function

} //end of the Lecture class
