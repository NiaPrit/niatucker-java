package com.techelevator;
import org.junit.Test;
import static org.junit.Assert.*;


public class DateFashionTest {

    DateFashion theCode = new DateFashion();

    @Test
    public void test_they_always_get_the_table() {

        DateFashion exercise = new DateFashion();
        assertEquals(2, exercise.getATable(8, 3));
        assertEquals(2, exercise.getATable(3, 8));
    }

    @Test
    public void test_they_maybe_get_the_table() {

        DateFashion exercise = new DateFashion();
        assertEquals(1, exercise.getATable(3,3));
        assertEquals(1, exercise.getATable(3,6));
    }

    @Test
    public void test_they_do_not_get_the_table(){
        DateFashion exercise = new DateFashion();
        assertEquals(0, exercise.getATable(0,1));
        assertEquals(0,exercise.getATable(1,1));
    }
}