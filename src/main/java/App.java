package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] arg) throws FileNotFoundException {
        System.out.println("Hello!!!!");
        int[] result = new int[20];
        loadFromFile(result);
        print(result);
        sort(result);
        print(result);
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("%5d, ", array[i]);
        }
        System.out.println();
    }

    public static void loadFromFile(int[] result) throws FileNotFoundException {
        URL p = App.class.getResource("/test.txt");
        if (p == null) {
            System.out.println("Path to file not found");
            return;
        }
        if (p.getPath() == null) {
            System.out.println("Path is null");
            return;
        }
        System.out.println(p.getPath());
        File file = new File(p.getPath());
        Scanner scanner = new Scanner(file);
        int i = 0;
        while (i < result.length && scanner.hasNextInt()) {
            result[i] = scanner.nextInt();
            ++i;
        }
        Random rand = new Random();
        while (i < result.length) {
            result[i] = rand.nextInt(100);
            ++i;
        }
    }

    public static void sort(int[] orig) {
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig.length - 1; j++) {
                if (orig[j] > orig[j + 1]) {
                    int x = orig[j];
                    orig[j] = orig[j + 1];
                    orig[j + 1] = x;
                }
            }
        }
    }
}