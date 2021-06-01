package com.techelevator.myFileReadingCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {
	// since the function contains the file I/O statements
	// anf file I/O may cause exceptions to happen
	// we have to tell Java we know that an exception may happen in the function
	// adding the throws specification on the function header tells Java we know that this type of exception can happen

	//									throws = I know i might have this type of exception
	public static void main(String[] args) throws FileNotFoundException {

		//define a file object for the file on our computer we want to read
		// Provide a path to the file when you define a File Object
		//Paths can be: absolute - code all parts from the root folder of your OS (windows)
		//            : relative - code the parts from the assumed current position to the file
		//	Absolute paths should be avoided- they tightly couple the program to the directory structure it was created on
		//										if the program is run on a machine with a different directory it wont work
		//										the absolute path doesn't exist in a different directory structure
		// Relative paths are preferred because you have Loosley coupled the files to directory structure
		// 							it is more likely that the relative paths will be the same from machine to machine

		//
		//path: . = current directory  	RELATIVE PATH
		//      / = then go				SUB DIRECTORY) FILE FOLLOWS
		//      numbers.txt - file name we want to go to
		File theFile = new File("./data/numbers.txt");				 // give the File object the path to our file

		//Define a scanner for the File object we created for the file on our computer
		Scanner scannerForFile = new Scanner(theFile);	 //give Scanner the File object we created

		String aLine = "";// Holds a line of input from the file
		int sum = 0;      // Holds the sum of the numbers in a line

		// if we want to get all the lines from a file
		//we need to go through and get each line one at a time
		//we cant get a line from the file if there are no more lines in the file
		// we can use the scanner class hasNextLine method to see if there is another line in the file
		//we can set up a loop to get a line from the file and process it as long as there are lines in te file
		// we will use a WHILE loop since we want to loop based on a condition ( as long as there are line in the file)
		//		and not a count of lines the file, in which case we would use a for loop

		// Add up and average each line from my file
		//The file has one or more numbers separated by spaces in each line
		while(scannerForFile.hasNextLine()) { 				//loop while there is a line in the file

			aLine = scannerForFile.nextLine();				// Get a line from the file & store it in aLine
			System.out.println("Line from the file: " + aLine);

			//String.split() will create an array of Strings of the values separated by the delimited
			String[] theNumbers = aLine.split(" "); //break apart the numbers in the line based on spaces

			// reset the sum to 0 to clear it of the value from the last time thru the loop
			sum = 0;
			// loop through the array of Strings holding the numbers from the line in the file
			for(String aNumber : theNumbers) {      //aNumber will hold the current element in the array
				sum = sum + Integer.parseInt(aNumber);   // add the number to a sum	AFTER converting the String to an int
			}											//                         using Integer.parseInt
			//NOW that we have the sum we can display it
			System.out.println("Sum of the numbers is : " + sum);
			System.out.println("Avg of the numbers is : " + sum / theNumbers.length);
		}

}
}