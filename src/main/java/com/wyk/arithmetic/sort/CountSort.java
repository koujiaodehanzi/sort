package com.wyk.arithmetic.sort;

/**
 * @Author: wyk
 * @Description:    计数排序
 * @Date: Create in 2019/5/17 22:53
 * @Modified By:
 */
public class CountSort {

    public static void countSort(int[] arr,int maxValue) {
        int[] a = new int[maxValue + 1];
        int sortIndex = 0;

        for (int i=0; i<arr.length; i++){
            a[arr[i]]++;
        }

        for (int j=0; j<maxValue+1; j++){
            while (a[j] > 0){
                arr[sortIndex++] = j;
                a[j]--;
            }
        }

    }
    
}
