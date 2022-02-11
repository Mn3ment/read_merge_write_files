package ru.shift;

import java.util.NoSuchElementException;

public class MergeSort {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (i < left.length && j < right.length) {
                rsl[index] = left[i] > right[j] ? right[j++] : left[i++];
            } else if (j < right.length) {
                rsl[index] = right[j++];
            } else {
                rsl[index] = left[i++];
            }
        }
        return rsl;
    }

    public static int[] merge(int[] first, int[] second, int[] third) {
        int[] temp = merge(first, second);
        return merge(temp, third);
    }
    public static void reverse(int[] array) {
        if (array == null) {
            throw new NoSuchElementException();
        }
        int i = 0;
        int j = array.length - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(String[] array) {
        if (array == null) {
            throw new NoSuchElementException();
        }
        int i = 0;
        int j = array.length - 1;
        String tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static String[] merge(String[] left, String[] right) {
        String[] rsl = new String[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (i < left.length && j < right.length) {
                rsl[index] =left[i].compareTo(right[j]) > 0 ? right[j++] : left[i++];
            } else if (j < right.length) {
                rsl[index] = right[j++];
            } else {
                rsl[index] = left[i++];
            }
        }
        return rsl;
    }

    public static String[] merge(String[] first, String[] second, String[] third) {
        String[] temp = merge(first, second);
        return merge(temp, third);
    }
}
