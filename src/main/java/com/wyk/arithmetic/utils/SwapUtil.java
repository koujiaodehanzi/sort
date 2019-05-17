package com.wyk.arithmetic.utils;

/**
 * @author wuyankun
 * @title: SwapUtil
 * @projectName sort
 * @description: TODO
 * @date 2019/5/1718:14
 */
public class SwapUtil {

    public static void swap(int[] arr, int i, int j){
        int n = arr[i];
        arr[i] = arr[j];
        arr[j] = n;
    }


    public static void swapXOR(int[] arr, int i, int j){
        // 高逼格两数转换，但是不能应用于数组转换
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
