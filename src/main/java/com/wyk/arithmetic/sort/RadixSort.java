package com.wyk.arithmetic.sort;

import java.util.Arrays;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/5/17 22:27
 * @Modified By:
 */
public class RadixSort {

    /**
     *
     * @param arr
     * @param d   代表最大数是几位数
     */
    public static void radixSort(int[] arr,  int d) {
        // 缓存数组
        int[] tmp = new int[arr.length];
        // buckets用于记录待排序元素的信息
        // buckets数组定义了max-min个桶
        int[] buckets = new int[arr.length];

        for (int i = 0, rate = 1; i < d; i++) {

            // 重置count数组，开始统计下一个关键字
            Arrays.fill(buckets, 0);
            // 将arr中的元素完全复制到tmp数组中
            System.arraycopy(arr, 0, tmp, 0, arr.length);

            // 计算每个待排序数据的子关键字
            for (int j = 0; j < arr.length; j++) {
                int subKey = (tmp[j] / rate) % arr.length;
                buckets[subKey]++;
            }

            for (int j = 1; j < arr.length; j++) {
                buckets[j] = buckets[j] + buckets[j - 1];
            }

            // 按子关键字对指定的数据进行排序
            for (int m = arr.length - 1; m >= 0; m--) {
                int subKey = (tmp[m] / rate) % arr.length;
                arr[--buckets[subKey]] = tmp[m];
            }
            rate *= arr.length;
        }

    }

}
