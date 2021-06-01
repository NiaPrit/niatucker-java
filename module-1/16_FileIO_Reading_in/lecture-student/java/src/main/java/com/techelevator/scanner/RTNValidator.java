package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RTNValidator {
	//Given a file containing bank routing numbers, this program will display if they are valid
	// We are NOT going to discuss what a how to validate a bnak rounting number
	// We are focusing
	
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) throws FileNotFoundException {

		printApplicationBanner(); // call a function to display a "Hello Message"

		//Get a valid file name from the user and define a File object for it
		File inputFile = getInputFileFromUser(); // get a valid filename from user and define file object for it

		//IGNORE TRY thing
		try(Scanner fileScanner = new Scanner(inputFile)) {		// define a scanner object for the file object
			while(fileScanner.hasNextLine()) {					// loop while the file has a next line
				String line = fileScanner.nextLine();			// get the next line from the file
				String rtn = line.substring(0, 9);				//extract the first 9 chars from the line
				System.out.print("RTN : " + rtn);				//display the first 9 char from the line
				if(checksumIsValid(rtn) == false) {				//if check to see if we have a valid routing number
					System.out.println(" - Invalid");			// if we don't, display "INVALID"
				}
					else {
						System.out.println(" - Valid");			//if we do display "VALID
				}
			}
		}
	} // END OF MAIN
	// Any methods called by main() must be codes after the end of Main() and before the end of the class holds main()
// These functions/methods are all static because they are called from a static method
	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}

	@SuppressWarnings("resource")
	//Get a valid file name from the user
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);             //define a scanner object for the keyboard
		System.out.print("Please enter path to input file >>> ");// Prompt a user for what we want them to enter
		String path = userInput.nextLine();						// Get response from the user
		System.out.println("Path entered: "+ path + "\n");		//Display what the user entered
		File inputFile = new File(path);						// Define an File object for the path the user gave us
		// .exist() will return whether the path for a File object exist in the current file structure.
		if(inputFile.exists() == false) {						 // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); 									// Ends the program|Exit the program
			// .isFile() returns whether the path for a File object is a file?
		} else if(inputFile.isFile() == false) {				// If path does exist , is it a file?
			System.out.println(path+" is not a file");			// if not a file - display a message
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
