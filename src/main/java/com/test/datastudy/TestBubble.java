package com.test.datastudy;

import java.util.Arrays;

/**
 * @author ：fei
 * @date ：Created in 2019/9/11 0011 15:34
 */
public class TestBubble {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 1, 32, 6, 73, 5, 12, 7, 23};

        bubble(arr);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 双重for，外层循环冒泡次数，内层循环冒泡动作
     * @param arr
     */
    public static void bubble(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
    }
}
