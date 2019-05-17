package com.wyk.arithmetic.sort;

import com.wyk.arithmetic.utils.SwapUtil;

/**
 * @author wuyankun
 * @title: HeapSort
 * @projectName sort
 * @description: TODO
 * @date 2019/5/1718:03
 */
public class HeapSort {


    public static void heapSort(int[] arr){
        buildMaxHeap(arr, arr.length);

        int len = arr.length;
        for (int i=arr.length-1; i>=0; i--){
            SwapUtil.swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);
        }

    }

    public static void buildMaxHeap(int[] arr, int len){
        for (int i=len/2; i>=0; i--){
            heapify(arr, i, len);
        }
    }

    public static void heapify(int arr[], int i, int len){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int largest = i;

        if (left < len && arr[left] > arr[largest]){
            largest = left;
        }

        if (right < len && arr[right] > arr[largest]){
            largest = right;
        }

        if (largest != i){
            SwapUtil.swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }

}
