package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max( 1, 2 );
        assertThat( result, is( 2 ) );
    }

    @Test
    public void whenMax1To2Then1() {
        int result = Max.max( 4, 3 );
        assertThat( result, is( 4 ) );
    }

    @Test
    public void whenMax1To2Equals(){
        int result = Max.max( 5,5 );
        assertThat( result, is( 5 ) );
    }
}
