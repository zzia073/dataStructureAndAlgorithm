package com.test.datastudy;

/**
 * @author ：fei
 * @date ：Created in 2019/9/10 0010 09:51
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        //有序数组
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int i = binarySearch(arr, 5);
        System.out.println(i);

    }
    private static int binarySearch(int[] arr, int dest){
        //找到中间的数和目标比，如果相等就返回，如果小于目标则目标在右侧，否则在左侧
        //如果头尾相等或头大于尾则返回-1表示未找到
        int head = 0;
        int tail = arr.length;
        while (head < tail){
           int mid = (head + tail) / 2;
           if (arr[mid] == dest){
               return mid;
           }
           if (arr[mid] < dest){
               head = mid + 1;
           }else {
               tail = mid - 1;
           }
        }
        return -1;
    }
}
