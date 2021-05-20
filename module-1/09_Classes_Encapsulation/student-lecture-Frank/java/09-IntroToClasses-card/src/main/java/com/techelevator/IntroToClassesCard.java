package com.techelevator;

public class IntroToClassesCard {
    @Override
    public String toString() {
        return "IntroToClassesCard{}";
    }

    //------------------------------------------------------------------------------------------------------------
        // Application program for the Intro To Classes App
        // MAIN() tells  us its the application program
        // application programs represents and use classes to do work for the application
        //------------------------------------------------------------------------------------------------------------
        public static void main(String[] args) {
        /*
        *  This program will demonstrate several concepts presented in the Java cohort
        *  in the topic Introduction to Classes 		
        */
            // a class is a user defined datatype ( not defined by the Java Language)
            // a class is used like a datatype
            // the new keywords instantiate an object of the class

          //  new classname() - represents an object of the class and run the CTOR
          //               () - indicates which CTOR to run
  // Instantiate a PlayingCard object: data-type name = new datatype();
            PlayingCard createdCard = new PlayingCard();
            System.out.println(" Our playing card is : " + createdCard);
            //                      String               +           PlayingCard Object
            //                      + is the String concatenation symbol when used within a String
            //                      + needs two Strings to work
            //                      + needs to convert PlayingCard object to a String
            //                      If a class has a toString() it will be used
            //                      if NOT it looks for a parent class for a toString() method to use

            System.out.println(" The value in my card is : " + createdCard);

	}
}
		 

