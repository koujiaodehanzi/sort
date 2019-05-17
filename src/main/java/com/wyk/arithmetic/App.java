package com.wyk.arithmetic;

import com.wyk.arithmetic.sort.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] arr = new int[]{5,3,9,4,6,7,5,1,6};
        //1.快速排序
//        QuickSort.quickSort1(arr, 0, arr.length-1);
        //2.归并排序
//        MergeSort.mergeSort(arr, 0, arr.length-1);
        //3.堆排序
//        HeapSort.heapSort(arr);
        //4.冒泡排序
//        BubbleSort.bubbleSort(arr);
        //5.选择排序
//        SelectSort.selectSort(arr);
        //6.插入排序
//        InsertSort.insertSort(arr);
        //7.希尔排序
        ShellSort.shellSort(arr);
        //8.基数排序
        RadixSort.radixSort(arr, 10,5);
        //9.桶排序

        //10.希尔排序


        printArr(arr);
    }

    public static void printArr(int[] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }
}
