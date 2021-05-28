package com.techelevator;

public class TriangleWall extends Wall{
   // attributes
   private int base;
   private int height;

   //CONSTRUCTOR
    public TriangleWall(String name, String color, int base, int height){
    super(color, name);
    this.base = base;
    this.height = height;
    }

//methods
    @Override
    public int getArea() {
        return (base * height) / 2;
    }
    @Override
    public String toString(){
        return getName() + " (" + base + "x" + height + ") " + "triangle";
    }


    //GETTERS

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }
}
