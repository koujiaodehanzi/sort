package com.wyk.arithmetic.sort;

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
            swap(arr, start, end);


            while (standard >= arr[start] && start < end){
                start++;
            }
            swap(arr, start, end);

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


    public static void swap(int[] arr, int i, int j){
        /*  高逼格两数转换，但是不能应用于数组转换
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];*/

        int n = arr[i];
        arr[i] = arr[j];
        arr[j] = n;
    }

    public static int partition(int[] arr, int left, int right){
        // 使用left作为基准值 进行比较
        int index = left + 1;

        for (int i=index; i<=right; i++){
            if (arr[i] < arr[left]){
                swap(arr, i, index);
                index++;
            }
        }

        swap(arr, left, index-1);

        return index-1;
    }



}
