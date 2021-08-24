package com.company;
import java.util.Scanner;

public class SelectionSort {

    public static void printArray(int[] arrayToPrint) {
        for(int var:arrayToPrint)
            System.out.print(var + " ");
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("Choose the size of array: ");
        Scanner scn = new Scanner(System.in);
        int inpArrLen = scn.nextInt();
        int[] inpArray = new int[inpArrLen];

        System.out.println("Enter the numbers one by one and press <Enter> ");
        //Take inputs for the unsorted array
        for(int i = 0; i < inpArrLen; i++) {
            inpArray[i] = scn.nextInt();
        }
        System.out.print("The array to sort is: [ " );
        printArray(inpArray);
        int min = 0;
        int temp;

        //Selection Sort
        for(int i = 0; i < inpArrLen - 1; i++) {
            min = i;
            for(int j = i + 1; j < inpArrLen; j++) {
                if(inpArray[j] < inpArray[min]) {
                    min = j;
                }
            }

            temp = inpArray[i];
            inpArray[i] = inpArray[min];
            inpArray[min] = temp;


            for(int var:inpArray)
                System.out.print(var + " ");
            System.out.println(" ");
        }

        System.out.println("The sorted array is [ ");
        printArray(inpArray);


    }
}