package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {

        for (int out = 0; out < data.length; out++) {
            int min = MinDiapason.findMin( data, out, data.length );
            int index = FindLoop.indexOf( data, min, out, data.length );

            int tmp = data[out];
            data[out] = data[index];
            data[index] = tmp;
        }
        return data;
    }
}

