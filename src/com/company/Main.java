package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class cls = new Class(28, "Sanzharbek Zhalilov", new int[] {0, 1, 2, 3});

        System.out.println("Number: " + cls.getNumber());
        System.out.println("Word: " + cls.getWord());
        System.out.println("Array: " + Arrays.toString(cls.getArray()));

    }
}