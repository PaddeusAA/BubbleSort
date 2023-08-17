package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = new int[]{33, 10, 5, 1, 8, 18, 13, 9, 22, 25 };

        printArray(arr);
        bubbleSortArray(arr);
        printArray(arr);
    }

    public static void printArray(int[] numbers){
        System.out.println(Arrays.toString(numbers));
    }

    public static void bubbleSortArray(int[] numbers){

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}