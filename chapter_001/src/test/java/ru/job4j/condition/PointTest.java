package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 4;
        int y2 = 1;
        double expected = 1;
        double out = Point.distance( x1, y1, x2, y2 );
        Assert.assertEquals( expected, out, 0.01 );
    }
}
