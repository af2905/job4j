package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean isPrime = true;

        if (num == 0 || num == 1) {
            isPrime = false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
