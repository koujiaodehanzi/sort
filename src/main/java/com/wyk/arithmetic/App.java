package com.wyk.arithmetic;

import com.wyk.arithmetic.sort.QuickSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] arr = new int[]{5,3,9,4,6,7,5,1,6};
        QuickSort.quickSort1(arr, 0, arr.length-1);
        printArr(arr);
    }

    public static void printArr(int[] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }
}