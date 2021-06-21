package com.alevel;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1.1");
        int intArray[] = {3, 4, 7, 6, 9, 3, 4, 8, 5}; // left to right
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0 && intArray[i] % 3 == 0) {
                System.out.println(intArray[i] + " fizzbuzz");
            } else if (intArray[i] % 2 == 0) {
                System.out.println(intArray[i] + " fizz");
            } else if (intArray[i] % 3 == 0) {
                System.out.println(intArray[i] + " buzz");
            } else {
                System.out.println(intArray[i]);
            }//if-else

        }//for
        System.out.println("Task 1.2");
        for (int j = intArray.length - 1; j >= 0; j--) {
            if (intArray[j] % 2 == 0 && intArray[j] % 3 == 0) {
                System.out.println(intArray[j] + " fizzbuzz");
            } else if (intArray[j] % 2 == 0) {
                System.out.println(intArray[j] + " fizz");
            } else if (intArray[j] % 3 == 0) {
                System.out.println(intArray[j] + " buzz");
            } else {
                System.out.println(intArray[j]);
            }

        }
        System.out.println("Task 2");

        long x = 1566784L;

        System.out.println(Long.toBinaryString(x));

        }
    }


