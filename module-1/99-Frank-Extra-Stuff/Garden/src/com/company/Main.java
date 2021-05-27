package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Plant monstera = new Plant( 6,"Monstera",false);
        Plant birdsofParadise = new Plant(12,"Birds Of Paradise",true);
        Plant snakeplant = new Plant(8,"Snake",false);
        Plant babyPlant = new Plant(2, "teeny weenie" , false);

        Garden niasGarden = new Garden();


        niasGarden.addPlant(monstera);
        niasGarden.addPlant(birdsofParadise);
        niasGarden.addPlant(snakeplant);
        niasGarden.addPlant(babyPlant);

        niasGarden.showPlants();

        System.out.println(niasGarden.addHeights());
    }
}
