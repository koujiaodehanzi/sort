package com.wyk.arithmetic.sort;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/5/17 21:17
 * @Modified By:
 */
public class InsertSort {

    public static void insertSort(int[] arr){
        for (int i=1; i< arr.length; i++){
            int temp = arr[i];
            int leftIndex = i;

            while (leftIndex>0 && arr[leftIndex-1]>temp){
                arr[leftIndex] = arr[leftIndex-1];
                leftIndex--;
            }

            arr[leftIndex] = temp;
        }
    }


}
