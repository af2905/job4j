package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        Counter counter = new Counter();
        int result = counter.add( 1, 10 );
        assertThat( result, is( 30 ) );

    }

    @Test
    public void whenSumEvenNumbersFromOneToOneHundredThenTwoThousandFiveHundredAndFifty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 100 при вызове метода counter.add будет равна 2550.
        Counter counter = new Counter();
        int result = counter.add( 1, 100 );
        assertThat( result, is( 2550 ) );
    }
}
