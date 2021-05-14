package com.techelevator;

import java.util.Scanner; // giving me access to the code that supports scanner

public class CommandLineSampleProgram {

	public static void main(String[] args) {
		// read input from the keyboard
		//define a scanner object in our program to represent the keyboard
		//Java automatically gives the keybaord the name


		System.out.println("Welcome to Frank's Command Line Sample Program");

	//   data type          = intital value
		Scanner theKeyboard = new Scanner(System.in);


	// holds a line of input from the keyboard
	// get a line of input from the keyboard and store it in our varible  called aline.
	// .nextline() means return a line from the keyboard using the Scanner we defined

		String aLine = "";
		System.out.println("Please enter a line and press enter...");
		aLine = theKeyboard.nextLine();
		System.out.println("You typed; " + aLine);


		System.out.println("Please enter a number: ");
		aLine = theKeyboard.nextLine();
		System.out.println("You entered the number: " + aLine);

		// we need to convert the number they entered from s string to an int so we can multiply it.
		//Integer.parseInt() will convert a String containing numeric digits to an int
		// Double.parseDouble() will convert a String containing numeric digits to a double

		int theNumber = Integer.parseInt(aLine);
		System.out.println("double your number is: " + theNumber * 2);

		int sum = 0;
		while( true ) {
			System.out.println("Enter a number or END to end");
			aLine = theKeyboard.nextLine();
			if (aLine == "END") {
				break;
			}
			sum = sum + Integer.parseInt(aLine);
		}
		System.out.println("The sum of the numbers entered is: " + sum);





	}

}
