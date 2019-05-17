package com.wyk.arithmetic.sort;

/**
 * @author wuyankun
 * @title: MergeSort
 * @projectName sort
 * @description: TODO
 * @date 2019/5/1717:29
 */
public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right){
        if (left >= right){
            return;
        }

        int mid = (right + left)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int[] a = new int[right - left + 1];
        int i = left, j = mid+1, k=0;

        // 双指针法 将两个数组的值从小到大依次赋值到新的数组
        while (i<=mid && j<=right){
            if (arr[i] < arr[j]){
                a[k++] = arr[i++];
            }else{
                a[k++] = arr[j++];
            }
        }
        // 如果i<mid，说明右边数组遍历完成，左边数组还没有遍历完成，将左边数组的值移到新数组
        while (i<=mid){
            a[k++] = arr[i++];
        }
        // 如果j<=right，说明左边数组遍历完成，右边数组还没有遍历完成，将右边数组的值移到新数组
        while (j<=right){
            a[k++] = arr[j++];
        }

        // 将新数组的值 覆盖老数组对应下标
        for (int n=0;n<a.length;n++){
            arr[left+n] = a[n];
        }

    }

}
