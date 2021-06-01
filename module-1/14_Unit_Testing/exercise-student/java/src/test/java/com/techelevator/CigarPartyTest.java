package com.techelevator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CigarPartyTest {
    CigarParty exercise = new CigarParty();
    //public boolean haveParty(int cigars, boolean isWeekend) methods we are testing

    @Test
    public void test_is_it_weekend_min_cigar_count_met() {
        CigarParty exercise = new CigarParty();
        assertEquals(true, exercise.haveParty(40, true));
    }


    @Test
    public void test_is_it_weekday_max_cigar_count_met(){
        CigarParty exercise = new CigarParty();
        assertEquals(false,exercise.haveParty(70,false));
    }

    @Test
    public void test_is_it_weekday_min_cigar_not_met(){
        CigarParty exercise = new CigarParty();
        assertEquals(false,exercise.haveParty(39,false));
    }

    @Test
    public void test_party_is_not_successful_on_the_weekend(){
        CigarParty exercise = new CigarParty();
        assertEquals(false,exercise.haveParty(19,true));
    }


}

