package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter { // start of class

	public static void main(String[] args) throws IOException { // start of main

		File outputFile = new File("./java/FizzBuzz.txt."); // location of the file we are saving text to

		outputFile.createNewFile(); // created new file

		PrintWriter fileWriter = new PrintWriter(outputFile);

		for (int i = 1; i <= 300; i++) { // loop through one at time through 300

			if (i % 3 == 0 && i % 5 == 0) {
				fileWriter.println("FizzBuzz"); // prints out FizzBuzz

			} else if ((i % 3 == 0 || ((Integer.toString(i))).contains("3"))) {
				fileWriter.println("Fizz"); // prints out Fizz

			} else if ((i % 5 == 0) || ((Integer.toString(i)).contains("5"))) {
				fileWriter.println("Buzz"); //prints out buzz
			} else {
				fileWriter.println(i);
			}
		}
		fileWriter.close(); // ends fileWriter
	}  // end of main
} // end of class
