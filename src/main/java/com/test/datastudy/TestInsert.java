package com.test.datastudy;

import java.util.Arrays;

/**
 * @author ：fei
 * @date ：Created in 2019/9/12 0012 10:22
 * 直接插入排序
 * 每次循环拿出一个数，将这个数插入到排好序的子数组的对应位置上
 */
public class TestInsert {
    public static void main(String[] args) {
        int[] arr = new int[] {56,35,2,7,23,15,6,9,26,57,8,36,52};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insert(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for ( ; j >= 0 && arr[j] > temp; j --) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
