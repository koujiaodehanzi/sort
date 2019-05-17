package com.wyk.arithmetic.sort;

import com.wyk.arithmetic.utils.SwapUtil;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/5/17 21:03
 * @Modified By:
 */
public class SelectSort {

    public static void selectSort(int[] arr){
        int minIndex;
        for (int i=0; i<arr.length-1; i++){
            minIndex = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            SwapUtil.swap(arr, minIndex, i);
        }
    }

}
