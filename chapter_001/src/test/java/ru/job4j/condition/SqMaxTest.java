package ru.job4j.condition;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void ifMaxFirst() {
        int result = SqMax.max( 9, 8, 7, 6 );
        assertThat( result, is( 9 ) );
    }

    @Test
    public void ifMaxSecond() {
        int result = SqMax.max( 1, 2, 1, 1 );
        assertThat( result, is( 2 ) );
    }

    @Test
    public void ifMaxThird() {
        int result = SqMax.max( 1, 2, 3, 1 );
        assertThat( result, is( 3 ) );
    }

    @Test
    public void ifMaxForth() {
        int result = SqMax.max( 1, 2, 3, 4 );
        assertThat( result, is( 4 ) );
    }
}
