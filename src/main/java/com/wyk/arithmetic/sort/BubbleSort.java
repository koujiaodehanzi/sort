package com.wyk.arithmetic.sort;

import com.wyk.arithmetic.utils.SwapUtil;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/5/17 20:58
 * @Modified By:
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr){
        for (int i=0; i< arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] >  arr[j+1]){
                    SwapUtil.swap(arr, j,j+1);
                }
            }
        }
    }

}
