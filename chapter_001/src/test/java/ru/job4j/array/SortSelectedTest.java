package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int result[] = SortSelected.sort( input );
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat( result, is( expect ) );
    }

    @Test
    public void whenSort3() {
        int[] input = new int[]{29, 68, 11};
        int result[] = SortSelected.sort( input );
        int[] expect = new int[]{11, 29, 68};
        assertThat( result, is( expect ) );
    }

    @Test
    public void whenSort10() {
        int[] input = new int[]{8, 10, 9, 6, 3, 4, 1, 2, 7, 5};
        int result[] = SortSelected.sort( input );
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat( result, is( expect ) );
    }
}
