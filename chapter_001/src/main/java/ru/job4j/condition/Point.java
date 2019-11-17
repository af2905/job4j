package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        double firstSquared = Math.pow( x2 - x1, 2 );
        double secondSquared = Math.pow( y2 - y1, 2 );

        return Math.sqrt( firstSquared + secondSquared );
    }

    public static void main(String[] args) {
        double result = distance( 0, 0, 2, 0 );
        System.out.println( "result (0, 0) to (2, 0) " + result );

        result = distance( 4, 2, 4, 1 );
        System.out.println( "result (4, 2) to (4, 1) " + result );
    }
}


