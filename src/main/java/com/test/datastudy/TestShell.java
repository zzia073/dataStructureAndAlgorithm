package com.test.datastudy;

import java.util.Arrays;

/**
 * @author ：fei
 * @date ：Created in 2019/9/12 0012 14:16
 * 希尔排序
 */
public class TestShell {

    public static void main(String[] args) {
        int[] arr = new int[] {39, 28, 37, 26, 15, 29, 8, 52, 7};
        shell(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shell(int[] arr){
        //遍历所有步长
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //遍历所有组（每组前边留一个元素，插入排序第一个元素默认不用排）
            for (int i = gap; i < arr.length; i++) {
                //将arr[i]插入到每组正确的位置
                int insert = arr[i];
                int j = i - gap;
                //循环遍历该组排好序的数组，如insert < arr[j]将当前元素在组内后移一位
                for (; j >= 0 && insert < arr[j]; j -= gap) {
                    arr[j + gap] = arr[j];
                }
                //将insert插入到最后的空位
                arr[j + gap] = insert;
            }
        }
    }
}
