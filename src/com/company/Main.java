package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count numbers to sort");
        int numbers = scanner.nextInt();

        printArray(sortIntegers(getIntegers(numbers)));
    }

    public static int[] getIntegers(int numbers){
        int[] array = new int[numbers];
        System.out.println("Fill array with " + numbers + " numbers");
        for(int i = 0; i < array.length; i ++) {
            System.out.println("Number " + i + " ->");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.println("Sorted values " + (i + 1) + " -> " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int temporary;
        for(int i = 0; i < array.length; i++) {
            for(int n = 0; n < array.length; n++){
                if(array[i] > array[n]) {
                    temporary = array[i];
                    array[i] = array[n];
                    array[n] = temporary;
                }
            }
        }
        return array;
    }
}