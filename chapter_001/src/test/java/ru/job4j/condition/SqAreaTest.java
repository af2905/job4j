package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 60;
        int k = 4;
        double expected = 144;
        double out = SqArea.square( p, k );
        Assert.assertEquals( expected, out, 0.01 );
    }
}
