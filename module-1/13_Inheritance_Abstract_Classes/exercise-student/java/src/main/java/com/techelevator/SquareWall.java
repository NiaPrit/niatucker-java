package com.techelevator;

public class SquareWall extends RectangleWall { //start of class
   //Attributes
   private int sideLength;


   //Constructor
    public SquareWall(String name, String color, int sideLength) {
        super(name,color,sideLength,sideLength);
        name = getName();
        color = getColor();
        this.sideLength = sideLength;
    }
    //method
    public int getSideLength() {
        return sideLength;
    }
    public String toString()  {
        return getName() + " ("+ sideLength + "x" + sideLength + ") square"; }

    }


    // end of class
