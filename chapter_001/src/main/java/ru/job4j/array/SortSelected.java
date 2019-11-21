package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin( data, 0, data.length );
        int index = FindLoop.indexOf( data, min, 0, data.length );

        int tmp = data[0];
        data[0] = data[index];
        data[index] = tmp;

        for (int out = 0; out < data.length - 1; out++) {
            for (int inner = 1; inner < data.length - 1; inner++) {
                if (data[inner] > data[inner + 1]) {
                    int temp = data[inner];
                    data[inner] = data[inner + 1];
                    data[inner + 1] = temp;
                }
            }
        }
        return data;
    }
}
