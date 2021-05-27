package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalGroupNameTest {
    //Instantiate an object with code to be tested
    AnimalGroupName theCode = new AnimalGroupName();

    // I am testing public String getHerd(String animalName)
    //public String getHerd(String animalName)
    // Given an animal in the Map, I'm going to return the group name


    @Test
    public void test_animal_name_is_null (){
        String actualGroupName = theCode.getHerd(null); //.getHerd is the method name
        assertEquals("unknown", actualGroupName);
    }

    @Test
    public void test_animal_name_is_NOT_the_map (){
        String anAnimal = "Frank";                        //Arrange -setup data to test the method
        String actualGroupName = theCode.getHerd(anAnimal);  //Act     - run the method with the test and get the result
        assertEquals("unknown", actualGroupName);              //Assert  -verify the result is what was expected
    }


    @Test
    public void test_animal_name_is_in_the_map (){
    String anAnimal = "giraffe";                        //Arrange -setup data to test the method
    String actualGroupName = theCode.getHerd(anAnimal);  //Act     - run the method with the test and get the result
    assertEquals("Tower", actualGroupName);              //Assert  -verify the result is what was expected
    }
}
