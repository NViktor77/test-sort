package main.java;

import java.util.Random;

public class App {
    public static void main(String[] arg) {
        System.out.println("Hello!!!!");
        Random rnd = new Random();
        int[] testArray = new int[20];
        for (int i = 0; i < 20; ++i) {
            testArray[i] = rnd.nextInt();
        }
        print(testArray);
    }

    public static void sort(int[] orig) {

    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("%5d", array[i]);
            System.out.println();
        }
    }
}