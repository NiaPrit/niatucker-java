package com.techelevator;       // Java package to hold the class
                                // Package is a group of related Java component
                                 // This class is in the same package as our application program
                                // So we don't have to import it into the application program

public class PlayingCard { // This is the start of our class

    // This is a class to represent our PlayingCard object
    // We decide what a PlayingCard is and does
    // A class contains the data (variables) and methods (behaviors) for a class
    // We have identified the following basic characteristics of a PlayingCard
    // value|suit|color|shape|symbol|face up/face down
    // The characteristics of an object are sometimes called attributes or properties
    // The attributes of class are defined as member variable in the class
    // A member is simply a variable defined in a class- a variable that is a member of a class
    // To define a member variable in a class: access can be Public _ anyone can access
    //                                                       Private - only members of the class can access
    //                                                                  (Encapsulation - protecting the data)
    //                                    datatype
    //                                      name
    /***************************************************************************************************************/
    // Data Members for the Class || Initialization of the data is done by Constructors NOT at definition

    private int         cardValue;               // Ace =1 Jack =11 Queen =12 King =13
    private String      cardSuit;
    private String      cardColor;
    private String      cardShape;
    private String      cardSymbol;
    private boolean     isFaceUp;               // typically boolean variables start with the word "IS"

    /**************************************************************************************************************/
    // Methods for the class- member methods-member functions-a method is a function in a class
    //Constructors (CTOR) are methods to initialize objects of a class
    //Constructors run automatically by Java when an object of the class is created and defined
    // Every class should provide constructors to initialize data members of the class
    // If constructors are not provided for a class, Java runs a default constructor that initializes
    //      numerics=0  Strings=""  Boolean=false  Char=""  Objects=Null
    // Constructors (CTOR) are special methods in a class: no return type ( not even a void),
    // name of the CTOR is the same name as the class && has a unique parameter list( data types) in the class
    // Constructors (CTOR) are usually overloaded functions- same name, but different parameter list in class
    // You should always provide at least a default CTOR
    // A default CTOR is one that takes no parameters and sets the data members to default values
    // Java uses default CTOR behinds the scenes in it processing
    // Define a default CTOR for a PlayingCard
    //        a default PlayingCard has : value=1, suit="Spades", color="Black" shape="Rectangle
    //                                    symbol="A", face-up="true"

    public PlayingCard() { //Default Constructors| same name as class, no parameters|no return type
      cardValue  = 1;
      cardSuit   = "Spades";
      cardColor  = "Black";
      cardShape  = "Rectangle";
      cardSymbol = "A";
      isFaceUp   = true;
    }



    //Getters/Setters are methods that allow access,under control of the class, to private data
    // used so application programs can retrieve values in private data or change the values in private.
    // not all data members are required to have Getters/Setters
    //YOU decide which private you want to allow applications to retrieve or change
    // Getters/Setters should follow the standard Java naming conventions
    // because many frameworks we use Java expect the standard names
    //getVariableName        setVariable            isBooleanVariable (getter)


    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public String getCardShape() {
        return cardShape;
    }

    public void setCardShape(String cardShape) {
        this.cardShape = cardShape;
    }

    public String getCardSymbol() {
        return cardSymbol;
    }

    public void setCardSymbol(String cardSymbol) {
        this.cardSymbol = cardSymbol;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    @Override
    public String toString() {
        return "PlayingCard{" +
                "cardValue=" + cardValue +
                ", cardSuit='" + cardSuit + '\'' +
                ", cardColor='" + cardColor + '\'' +
                ", cardShape='" + cardShape + '\'' +
                ", cardSymbol='" + cardSymbol + '\'' +
                ", isFaceUp=" + isFaceUp +
                '}';
    }
} // This is the end of PlayingCard class
