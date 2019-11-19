package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;

        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        for (int i = 2; i <= finish; i++) {
            boolean isPrime = checkPrimeNumber.check( i );
            if (isPrime) count++;
        }
        return count;
    }
}

