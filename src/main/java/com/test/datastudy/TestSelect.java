package com.test.datastudy;

import java.util.Arrays;

/**
 * @author ：fei
 * @date ：Created in 2019/9/12 0012 15:07
 * 选择排序
 * 每次循环拿出最小的元素放在首位
 */
public class TestSelect {
    public static void main(String[] args) {
        int[] arr = new int[] {39, 28, 37, 26, 15, 29, 8, 52, 7};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void select(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //最小数位置的索引
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                //找出最小值的索引并记录下来
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            //如果第一个数不是最小值则交换最小值和第一个元素
            if (index != i){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
