package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch { //start of class

	public static void main(String[] args) throws FileNotFoundException { // start of main

		Scanner userInput = new Scanner(System.in);    //method to allow us to type info needed
		System.out.println("What is the file that should be searched"); // this displays what we want out users to do
		String path = userInput.nextLine();                                // allows user to type in the info and display on the next line
		File inputFile = inputFile = new File(path);                    // telling compiler
		System.out.println("What word are you looking for?"); // asking user what word they are looking for within the alice txt
		String searchWord = userInput.nextLine();            // allows user to type SPECIFIC word we are looking for
		System.out.println("Should the search word be case sensitive? Yes or No"); 
		String caseSensitive = userInput.nextLine();
		int lineNumber = 1;                            //declaring lineNumber which will show the line number of desired word
		Scanner inputScanner = new Scanner(inputFile.getAbsoluteFile());
		{
			while (inputScanner.hasNextLine()) {                        // looping through while there are lines in the text
				String line = inputScanner.nextLine();                 //
				if (line.contains(searchWord)) {					// if line contains the search word pull it out
					System.out.println(lineNumber + ") " + line);  // print out the search word (dog) along with the line number it is on
				}
				lineNumber += 1;
			}

		}


	}// end of main
} // end of class
