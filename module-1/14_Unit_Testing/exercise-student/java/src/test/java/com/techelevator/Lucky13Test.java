package com.techelevator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Lucky13Test {
    Lucky13 exercise = new Lucky13();

    @Test
    public void test_if_array_contains_1() {
        assertEquals(false,exercise.getLucky(new int[]{1}));
    }

    @Test
    public void test_if_array_contains_3() {
        assertEquals(false,exercise.getLucky(new int[]{3}));
    }

    @Test
    public void test_if_array_contains_4() {
        assertEquals(true,exercise.getLucky(new int[]{4}));
    }

    @Test
    public void test_if_array_contains_3_4() {
        assertEquals(false,exercise.getLucky(new int[]{3,4}));
    }

}
