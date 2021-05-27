package com.techelevator;

public class RectangleWall extends Wall {  // start of Rectangle
    // Attributes ( variables)
    private int length;
    private int height;


    // constructors derived from super class
    // new constructor with new variables
    public RectangleWall(String name, String color, int length, int height) {
        super(color, name);
        this.length = length;
        this.height = height;
    }

    // methods
    //use the getArea method the returns length * height
    public int getArea(){
        int getArea = length * height;
        return getArea;
    }
    public String toString(){
        return getName() + " (" + getLength() + "x" + getHeight() + ") " + "rectangle";
    }

    // Getters
        public int getLength () {
        return length;
    }

        public int getHeight () {
        return height;
    }
    }
