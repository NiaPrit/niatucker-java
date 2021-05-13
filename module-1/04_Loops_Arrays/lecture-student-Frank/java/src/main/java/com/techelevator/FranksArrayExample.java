package com.techelevator;

public class FranksArrayExample {
	
	public static void main(String[] args) {  
		
		System.out.println("Welcome to Frank's Array Example Program");

		int score1 = 10;
		int score2 = 20;
		int score3 = 30;
		int score4 = 40;
		int score5 = 50;

		int sum = 0;

		double avg = 0;

		sum = score1 + score2 + score3 + score4 + score5;

		avg = sum / 5;

		System.out.println( " Sum of scores is : " + sum);
		System.out.println (" Average of scores is : " + avg);

	}   
   
}


int[] myScores = new int[3]; // define an empty array of ints
myScores[0] = 10;  // sets the first element in the array to 10
myScores[1] = 20; // sets the second element in the array to 20
myScores[2] = 30; // sets the second element in the array to 30

// use a for-loop to process an array from the beginning to the end
// a for- loop has 3 parts ( initialization; condition; increment)

// initialization - done once at the start of the process
// condition- is checked before each loop| controls how many times the loop is executed
// increment - done at the end of the loop body ( just before it goes back and checks condition

// a for loop will execute the statements in the loop body as long as the condition is true

// When processing an array : initialization - set loop index to 0
//							condition - loop as long as the index is inside array
//							increment- add 1 to index

