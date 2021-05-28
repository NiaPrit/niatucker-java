package com.techelevator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Less20Test {
    Less20 exercise = new Less20();

    @Test
    public void test_number_is_one_less_than_multiple_of_20() {
        assertEquals(true,exercise.isLessThanMultipleOf20(19));
    }
    @Test
    public void test_number_is_two_less_than_multiple_of_20() {
        assertEquals(true,exercise.isLessThanMultipleOf20(18));
    }
    @Test
    public void test_number_multiple_of_20() {
        assertEquals(false,exercise.isLessThanMultipleOf20(80));
    }

}
