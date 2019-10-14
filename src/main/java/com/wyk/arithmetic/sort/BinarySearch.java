package com.wyk.arithmetic.sort;

/**
 * @author wuyankun
 * @title: BinarySearch
 * @projectName sort
 * @description: TODO
 * @date 2019/5/2517:14
 */
public class BinarySearch {

    public static Integer binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        if (arr == null){
            return null;
        }

        if (target == arr[start]){

        }
        if (target == arr[end]){

        }

        if (target > arr[start] && target < arr[end]){
            return null;
        }



        while (start <= end){
            int mid = (end + start) / 2;

            if (target == arr[mid]){
                return mid;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 8, 9};
        System.out.println(binarySearch(arr, 2));
    }

}
