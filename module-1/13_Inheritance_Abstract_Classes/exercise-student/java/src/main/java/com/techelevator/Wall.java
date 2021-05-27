package com.techelevator;

// wall class cannot be instantiated
abstract public class Wall { // start of class

//Attributes
    private String color;
    private String name;
    private int  totalArea;


//Constructor
    public Wall(String color, String name) {
        this.color = color;
        this.name = name;

    }
// Methods
// create a method that must be implemented by subclass called getArea() that has no parameter and returns an Integer = the total area of the wall
//      access  return type name(parameter)
abstract public int getArea();

// Getters
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
} // end of class
