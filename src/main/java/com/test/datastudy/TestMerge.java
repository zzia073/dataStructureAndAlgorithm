package com.test.datastudy;

import java.util.Arrays;

/**
 * @author ：fei
 * @date ：Created in 2019/9/12 0012 16:02
 * 归并排序
 * ========================================
 * 将数组分成两部分
 * 分别对左侧和右侧归并
 * 分组的最终结果是左右两边只剩一个元素，然后执行归并的算法
 * 分别从两个数组中取出小的放入新的数组，最后在复制新的数组到原数组对应位置
 */
public class TestMerge {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 13, 9, 7, 12, 5, 21, 14, 6, 8};
        mergeSort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int left, int right){
        if (left >= right){
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr,left, mid, right);
    }
    private static void merge(int[] arr, int left, int middle, int right){
        //用一个新的数组放归并后的元素
        int[] newArr = new int[right - left + 1];
        int index = 0;
        int i = left, j = middle + 1;
        //归并一侧
        for (; i <= middle && j <= right;) {
            newArr[index ++] = arr[i] < arr[j] ? arr[i ++]  : arr[j ++];
        }
        //放入多余的
        while (i <= middle){
            newArr[index ++] = arr[i ++];
        }
        while (j <= right){
            newArr[index ++] = arr[j ++];
        }
        //复制回原数组
        for (int k = 0; k < newArr.length; k++) {
            arr[left + k] = newArr[k];
        }
    }
}
