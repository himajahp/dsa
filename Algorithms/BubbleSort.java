package com.company;
import java.util.Scanner;

public class BubbleSort {

    static void printArray(int[] arrayToPrint) {
        for(int var:arrayToPrint)
            System.out.print(var + " ");
        System.out.println("]" );
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Length of the array is: ");
        int arrayLen = scn.nextInt();
        int[] arrayToSort = new int[arrayLen];

        System.out.println("Enter the numbers one by one and press <Enter> ");
        //Take inputs for the unsorted array
        for(int i = 0; i < arrayLen; i++) {
            arrayToSort[i] = scn.nextInt();
        }
        System.out.print("The array to sort is: [ " );
        printArray(arrayToSort);

        //Bubble sort
        for(int h = arrayLen - 1; h > 0; h--) {
            for(int p = 0; p < h; p++) {
                if(arrayToSort[p] > arrayToSort[p+1]) {
                    int temp = arrayToSort[p];
                    arrayToSort[p] = arrayToSort[p+1];
                    arrayToSort[p+1] = temp;
                }
            }
        }

        System.out.print("The sorted array is: [ " );
        printArray(arrayToSort);
    }
}
