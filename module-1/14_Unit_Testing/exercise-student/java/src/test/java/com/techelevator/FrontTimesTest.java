package com.techelevator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FrontTimesTest {
    @Test
    public void test_first_three_characters_when_n_is_three() {
        FrontTimes exercise = new FrontTimes();
        assertEquals("ChoChoCho", exercise.generateString("Chocolate", 3));
    }

    @Test
    public void test_first_three_characters_when_n_is_two() {
        FrontTimes exercise = new FrontTimes();
        assertEquals("ChoCho", exercise.generateString("Chocolate", 2));
    }

    @Test
    public void test_characters_when_n_is_two() {
        FrontTimes exercise = new FrontTimes();
        assertEquals("ByBy", exercise.generateString("By", 2));
    }

    @Test
    public void test_characters_when_n_is_three() {
        FrontTimes exercise = new FrontTimes();
        assertEquals("ByByBy", exercise.generateString("By", 3));
    }
}
