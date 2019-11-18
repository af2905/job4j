package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int tempResult = first > second ? first : second;

        int result = tempResult > third ? tempResult : third;

        return result;
    }
}
