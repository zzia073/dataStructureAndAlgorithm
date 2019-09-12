package com.test.datastudy;

/**
 * @author ：fei
 * @date ：Created in 2019/9/11 0011 10:35
 * 递归
 */
public class TestRecursive {
    public static void main(String[] args) {
        print(3);
    }

    /**
     * 示例方法，交换打印和递归方法的位置使结果改变，-- i 和 i -- 的用法
     * @param i
     */
    public static void print(int i){
        if (i > 0) {
            print(-- i);
            System.out.println(++ i);
        }
    }
}
