package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double percentForTheYear = amount / 100 * percent;
            amount += percentForTheYear - salary;
            year++;
        }
        return year;
    }
}

