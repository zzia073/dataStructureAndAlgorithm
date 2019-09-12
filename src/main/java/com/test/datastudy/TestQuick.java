package com.test.datastudy;

import java.util.Arrays;

/**
 * @author ：fei
 * @date ：Created in 2019/9/11 0011 16:18
 */
public class TestQuick {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 36, 12, 23, 5, 17, 8, 10, 32};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] arr, int start, int end){
        if (start >= end){
            return;
        }
        //挖坑法，将第一个元素作为基准，拿出来形成一个坑，记录坑的索引
        //从最后向前比如果元素比坑中的大则指针向前移，否则将该元素填入坑中，该位置形成新的坑
        //然后在从前向后比，如果元素比基准小则指针向后移，如果比基准的大则填入坑中，该位置形成新的坑
        //直到低位和高位重叠，此时形成的坑中填入从第一个坑中被挤出来的这个基准值
        int pivot = arr[start];
        int low = start;
        int high = end;
        while (low < high){
            while (low < high && pivot <= arr[high]){
                high --;
            }
            arr[low] = arr[high];
            while (low < high && pivot >= arr[low]){
                low ++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        quick(arr, start, low);
        quick(arr, low + 1, end);
    }
    private static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }
}
