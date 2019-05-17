package com.wyk.arithmetic.sort;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/5/17 22:43
 * @Modified By:
 */
public class BucketSort {

    /**
     *
     * @param arr
     * @param max  数组中最大值范围
     */
    public static void bucketSort(int[] arr, int max){
        int[] buckets;

        if (arr==null || max<1){
            return ;
        }

        // 创建一个容量为max的数组buckets，并且将buckets中的所有数据都初始化为0。
        buckets = new int[max];

        // 1. 计数
        for(int i = 0; i < arr.length; i++)
            buckets[arr[i]]++;

        // 2. 排序
        for (int i = 0, j = 0; i < max; i++) {
            while( (buckets[i]--) >0 ) {
                arr[j++] = i;
            }
        }

    }

}
