package com.wyk.arithmetic.sort;

import com.wyk.arithmetic.utils.SwapUtil;

/**
 * @author wuyankun
 * @title: QuickSort
 * @projectName sort
 * @description: TODO
 * @date 2019/5/1715:12
 */
public class QuickSort {

    /**
     * 方式一
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort1(int[] arr, int left, int right){
        // 使用left作为基准值 进行比较
        int start = left;
        int end = right;
        int standard = arr[left];
        while (start < end){
            while (standard <= arr[end] && start < end){
                end--;
            }
            SwapUtil.swap(arr, start, end);


            while (standard >= arr[start] && start < end){
                start++;
            }
            SwapUtil.swap(arr, start, end);

        }

        if (left < start){
            quickSort1(arr, left, start-1);
        }
        if (end < right){
            quickSort1(arr, end+1, right);
        }

    }

    /**
     * 方式二
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort(int[] arr, int left, int right){
        if (left < right){
            int standardIndex = partition(arr, left, right);
            quickSort(arr, left, standardIndex-1);
            quickSort(arr, standardIndex+1, right);
        }
    }



    public static int partition(int[] arr, int left, int right){
        // 使用left作为基准值 进行比较
        int index = left + 1;

        for (int i=index; i<=right; i++){
            if (arr[i] < arr[left]){
                SwapUtil.swap(arr, i, index);
                index++;
            }
        }

        SwapUtil.swap(arr, left, index-1);

        return index-1;
    }



}
