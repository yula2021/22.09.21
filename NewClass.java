package org.itstep;

import java.util.Random;

public class NewClass {
    public static int size;
    public static int[] a;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        size = 5;
        a = new int[size];
        fillRandom();
        selectionSort();
        printColor(0, 0);
    }

    private static void printColor(int i, int i1) {
    }

    public static void swap(int i, int j) {

    }

    public static void selectionSort() {
        for (int i = 0; i < size; i++) {
            int min = a[i], index = 0;
            for (int j = i; j < size; j++)
                if (min > a[j]) {
                    min = a[j];
                    index = j;
                }
            if (index != 0) {
                printColor(i, index);
                swap(i, index);
            }
        }
    }

    public static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(81) + 10;

        }
    }

    public static void combSort() {
        double factor = 1.2473309; // фактор уменьшения
        int step = a.length - 1; // шаг сортировки
        while (step >= 1) {
            for (int i = 0; i + step < a.length; i++)
                if (a[i] > a[i + step]) {
                    printColor(1, i + step);
                    swap(i, i + step);
                }
            step /= factor;
        }

    }

    //обезьянья сортировка
    public static void bogoSort() {
        while (!isSorted())
            shuffle();
    }

    public static boolean isSorted() {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }

    public static void shuffle() {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            int index = random.nextInt(a.length);
            printColor(i,index);
            swap(i, index);
        }
    }
}