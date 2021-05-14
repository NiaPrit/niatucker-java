package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		System.out.println(" Enter  Length ");
		Scanner theKeyboard = new Scanner(System.in);
		String aLine = "";
		aLine = theKeyboard.nextLine();

		System.out.println(" Is the length Meters or Feet ?");
		String answer = "";
		answer = theKeyboard.nextLine();

		if (answer.equals ( "M" )) {
			double ff = (Integer.parseInt(aLine) * 3.280839);
			System.out.println(aLine + "M is " + ff + "F");
		}
		if (answer.equals("F")) {
			double mm = (Double.parseDouble(aLine) * 3.2808399);
			System.out.println(aLine + "F is " + mm + "M");

		}

	}

}

// Ask to enter length
//Get the length
//Ask if its Meters or Feet
//Get the answer
//Convert the answer
//Print the Conversions