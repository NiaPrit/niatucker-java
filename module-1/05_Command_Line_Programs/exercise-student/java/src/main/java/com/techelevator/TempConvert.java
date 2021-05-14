package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {


		System.out.println(" Please Enter Temperature");
		Scanner theKeyboard = new Scanner(System.in);
		String aLine = "";
		aLine = theKeyboard.nextLine();

		System.out.println(" Is The Temperature Celsius or Fahrenheit ?");
		String answer = "";
		answer = theKeyboard.nextLine();

		if (answer.equals ("C" )) {
			double tf = (Integer.parseInt(aLine) * 9 / 5) + 32;
			System.out.println(aLine + "C is " + tf + "F");
		}
		if (answer.equals("F")) {
			double tc =(Double.parseDouble(aLine) - 32) * 5 / 9;
			System.out.println (aLine + "F is " + tc + "C");


		}
	}
}



// ask to enter temo
// get temp from user
//ask user if C or F
//get answer from user
//conver answer
//print what the conversion is