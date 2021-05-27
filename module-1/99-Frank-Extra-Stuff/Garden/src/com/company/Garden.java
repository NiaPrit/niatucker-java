package com.company;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Plant> plants = new ArrayList<Plant>();

    public void addPlant(Plant plant) {
        plants.add(plant);
    }


    public void showPlants(){
        // first loop through all plants
        for (Plant plant : plants) {
            // everything in here is inside the loop
            // 0 - monstera
            // 1 - birdsofParadise
            // 2 - snakeplant
            // for each one print the type
            System.out.println(plant.getType());
        }
        // out of the loop
    }

    public int addHeights(){
        int heightTotal = 0;

        // go through all the plants
        for (Plant plant : plants){
            // add the heights up
            heightTotal = plant.getHeight() + heightTotal;
        }

        // return total
        return heightTotal;
    }
}
