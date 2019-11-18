package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 0;

        for (int i = 0; i <= n; i++) {
            if (result == 0) {
                result = 1;
                continue;
            } else result *= i;
        }
        return result;
    }
}
