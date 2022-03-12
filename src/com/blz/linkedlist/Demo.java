package com.blz.linkedlist;

public class Demo {

    public static void main(String[] args) {
        Demo.data(5, 5, 2, 5);
    }

    private static void data(int... a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
    }
}
