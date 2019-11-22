package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {

        for (int out = 0; out < data.length; out++) {
            for (int inner = 0; inner < data.length; inner++) {

                int min = MinDiapason.findMin( data, out, data.length );
                int index = FindLoop.indexOf( data, min, out, data.length );

                int tmp = data[out];
                data[out] = data[index];
                data[index] = tmp;
            }
        }
        return data;
    }
}

